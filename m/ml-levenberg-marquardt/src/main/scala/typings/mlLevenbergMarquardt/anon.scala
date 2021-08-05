package typings.mlLevenbergMarquardt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ml-levenberg-marquardt.ml-levenberg-marquardt.Options> */
  trait PartialOptions extends StObject {
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var errorTolerance: js.UndefOr[Double] = js.undefined
    
    var gradientDifference: js.UndefOr[Double] = js.undefined
    
    var initialValues: js.UndefOr[js.Array[Double]] = js.undefined
    
    var maxIterations: js.UndefOr[Double] = js.undefined
    
    var maxValue: js.UndefOr[js.Array[Double]] = js.undefined
    
    var minValue: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setErrorTolerance(value: Double): Self = StObject.set(x, "errorTolerance", value.asInstanceOf[js.Any])
      
      inline def setErrorToleranceUndefined: Self = StObject.set(x, "errorTolerance", js.undefined)
      
      inline def setGradientDifference(value: Double): Self = StObject.set(x, "gradientDifference", value.asInstanceOf[js.Any])
      
      inline def setGradientDifferenceUndefined: Self = StObject.set(x, "gradientDifference", js.undefined)
      
      inline def setInitialValues(value: js.Array[Double]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      inline def setInitialValuesVarargs(value: Double*): Self = StObject.set(x, "initialValues", js.Array(value :_*))
      
      inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
      
      inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
      
      inline def setMaxValue(value: js.Array[Double]): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMaxValueVarargs(value: Double*): Self = StObject.set(x, "maxValue", js.Array(value :_*))
      
      inline def setMinValue(value: js.Array[Double]): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setMinValueVarargs(value: Double*): Self = StObject.set(x, "minValue", js.Array(value :_*))
    }
  }
}
