package com.stylefeng.guns.modular.system.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.modular.system.model.Food;
import com.stylefeng.guns.modular.system.dao.FoodMapper;
import com.stylefeng.guns.modular.system.service.IFoodService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 食品表 服务实现类
 * </p>
 *
 * @author stylefeng123
 * @since 2018-08-15
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements IFoodService {

    @Override
    public Page<Food> selectFoodList(EntityWrapper ew, int pageNo, int pageSize) {
        Page<Food> page =new Page <>(pageNo,pageSize);
        Page<Food> foods = selectPage(page, ew);
        return foods;
    }
}
