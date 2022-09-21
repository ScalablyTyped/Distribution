package typings.poissonDiskSampling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bias extends StObject {
    
    var bias: js.UndefOr[(js.Function1[/* repeated */ Double, Double]) | Null] = js.undefined
    
    var distanceFunction: js.UndefOr[(js.Function1[/* repeated */ Double, Double]) | Null] = js.undefined
    
    var maxDistance: js.UndefOr[Double] = js.undefined
    
    var minDistance: Double
    
    var shape: js.Array[Double]
    
    var tries: js.UndefOr[Double] = js.undefined
  }
  object Bias {
    
    inline def apply(minDistance: Double, shape: js.Array[Double]): Bias = {
      val __obj = js.Dynamic.literal(minDistance = minDistance.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bias]
    }
    
    extension [Self <: Bias](x: Self) {
      
      inline def setBias(value: /* repeated */ Double => Double): Self = StObject.set(x, "bias", js.Any.fromFunction1(value))
      
      inline def setBiasNull: Self = StObject.set(x, "bias", null)
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setDistanceFunction(value: /* repeated */ Double => Double): Self = StObject.set(x, "distanceFunction", js.Any.fromFunction1(value))
      
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
    
    extension [Self <: Data](x: Self) {
      
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
    
    extension [Self <: DistanceFunction](x: Self) {
      
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
    
    extension [Self <: MinDistance](x: Self) {
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
      
      inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
    }
  }
}
