package typings.poissonDiskSampling

import typings.poissonDiskSampling.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bias extends StObject {
    
    /**
      * When using a `distanceFunction`, will indicate which point constraint takes priority when evaluating two points
      * (0 for the lowest distance, 1 for the highest distance)
      * @default 0
      */
    var bias: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to control the distance between each point depending on their position,
      * must return a value between 0 and 1
      */
    var distanceFunction: js.UndefOr[(js.Function1[/* point */ Point, Double]) | Null] = js.undefined
    
    /**
      * Maximum distance between each points
      * @default (minDistance * 2)
      */
    var maxDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum distance between each points
      */
    var minDistance: Double
    
    /**
      * Shape of the space
      */
    var shape: js.Array[Double]
    
    /**
      * Number of times the algorithm will try to place a point in the neighbourhood of another points
      * @default 30
      */
    var tries: js.UndefOr[Double] = js.undefined
  }
  object Bias {
    
    inline def apply(minDistance: Double, shape: js.Array[Double]): Bias = {
      val __obj = js.Dynamic.literal(minDistance = minDistance.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bias]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bias] (val x: Self) extends AnyVal {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setDistanceFunction(value: /* point */ Point => Double): Self = StObject.set(x, "distanceFunction", js.Any.fromFunction1(value))
      
      inline def setDistanceFunctionNull: Self = StObject.set(x, "distanceFunction", null)
      
      inline def setDistanceFunctionUndefined: Self = StObject.set(x, "distanceFunction", js.undefined)
      
      inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
      
      inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: js.typedarray.Uint32Array
    
    var stride: js.Array[Double]
  }
  object Data {
    
    inline def apply(data: js.typedarray.Uint32Array, stride: js.Array[Double]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setStride(value: js.Array[Double]): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
      
      inline def setStrideVarargs(value: Double*): Self = StObject.set(x, "stride", js.Array(value*))
    }
  }
  
  trait DistanceFunction extends StObject {
    
    var bias: js.UndefOr[Double] = js.undefined
    
    def distanceFunction(params: Double*): Double
    
    var maxDistance: js.UndefOr[Double] = js.undefined
    
    var minDistance: Double
    
    var shape: js.Array[Double]
    
    var tries: js.UndefOr[Double] = js.undefined
  }
  object DistanceFunction {
    
    inline def apply(distanceFunction: /* repeated */ Double => Double, minDistance: Double, shape: js.Array[Double]): DistanceFunction = {
      val __obj = js.Dynamic.literal(distanceFunction = js.Any.fromFunction1(distanceFunction), minDistance = minDistance.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceFunction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DistanceFunction] (val x: Self) extends AnyVal {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setDistanceFunction(value: /* repeated */ Double => Double): Self = StObject.set(x, "distanceFunction", js.Any.fromFunction1(value))
      
      inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
      
      inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
    }
  }
  
  trait MinDistance extends StObject {
    
    var minDistance: Double
    
    var shape: js.Array[Double]
    
    var tries: js.UndefOr[Double] = js.undefined
  }
  object MinDistance {
    
    inline def apply(minDistance: Double, shape: js.Array[Double]): MinDistance = {
      val __obj = js.Dynamic.literal(minDistance = minDistance.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinDistance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinDistance] (val x: Self) extends AnyVal {
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
      
      inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
    }
  }
}
