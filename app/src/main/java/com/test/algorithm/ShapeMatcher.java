package com.test.algorithm;

import com.test.model.GPoint2D;

import java.util.List;

public abstract class ShapeMatcher {

    protected float threshold;

    public ShapeMatcher(float threshold) {
        this.threshold = threshold;
    }

    public abstract boolean match(List<GPoint2D> a, List<GPoint2D> b);
}