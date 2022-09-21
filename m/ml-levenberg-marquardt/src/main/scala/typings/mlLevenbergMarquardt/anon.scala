package typings.mlLevenbergMarquardt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ml-levenberg-marquardt.ml-levenberg-marquardt.Options> */
  trait PartialOptions extends StObject {
    
    var centralDifference: js.UndefOr[Boolean] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var dampingStepDown: js.UndefOr[Double] = js.undefined
    
    var dampingStepUp: js.UndefOr[Double] = js.undefined
    
    var errorTolerance: js.UndefOr[Double] = js.undefined
    
    var gradientDifference: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var improvementThreshold: js.UndefOr[Double] = js.undefined
    
    var initialValues: js.UndefOr[js.Array[Double]] = js.undefined
    
    var maxIterations: js.UndefOr[Double] = js.undefined
    
    var maxValues: js.UndefOr[js.Array[Double]] = js.undefined
    
    var minValues: js.UndefOr[js.Array[Double]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var weights: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setCentralDifference(value: Boolean): Self = StObject.set(x, "centralDifference", value.asInstanceOf[js.Any])
      
      inline def setCentralDifferenceUndefined: Self = StObject.set(x, "centralDifference", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingStepDown(value: Double): Self = StObject.set(x, "dampingStepDown", value.asInstanceOf[js.Any])
      
      inline def setDampingStepDownUndefined: Self = StObject.set(x, "dampingStepDown", js.undefined)
      
      inline def setDampingStepUp(value: Double): Self = StObject.set(x, "dampingStepUp", value.asInstanceOf[js.Any])
      
      inline def setDampingStepUpUndefined: Self = StObject.set(x, "dampingStepUp", js.undefined)
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setErrorTolerance(value: Double): Self = StObject.set(x, "errorTolerance", value.asInstanceOf[js.Any])
      
      inline def setErrorToleranceUndefined: Self = StObject.set(x, "errorTolerance", js.undefined)
      
      inline def setGradientDifference(value: Double | js.Array[Double]): Self = StObject.set(x, "gradientDifference", value.asInstanceOf[js.Any])
      
      inline def setGradientDifferenceUndefined: Self = StObject.set(x, "gradientDifference", js.undefined)
      
      inline def setGradientDifferenceVarargs(value: Double*): Self = StObject.set(x, "gradientDifference", js.Array(value*))
      
      inline def setImprovementThreshold(value: Double): Self = StObject.set(x, "improvementThreshold", value.asInstanceOf[js.Any])
      
      inline def setImprovementThresholdUndefined: Self = StObject.set(x, "improvementThreshold", js.undefined)
      
      inline def setInitialValues(value: js.Array[Double]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      inline def setInitialValuesVarargs(value: Double*): Self = StObject.set(x, "initialValues", js.Array(value*))
      
      inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
      
      inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
      
      inline def setMaxValues(value: js.Array[Double]): Self = StObject.set(x, "maxValues", value.asInstanceOf[js.Any])
      
      inline def setMaxValuesUndefined: Self = StObject.set(x, "maxValues", js.undefined)
      
      inline def setMaxValuesVarargs(value: Double*): Self = StObject.set(x, "maxValues", js.Array(value*))
      
      inline def setMinValues(value: js.Array[Double]): Self = StObject.set(x, "minValues", value.asInstanceOf[js.Any])
      
      inline def setMinValuesUndefined: Self = StObject.set(x, "minValues", js.undefined)
      
      inline def setMinValuesVarargs(value: Double*): Self = StObject.set(x, "minValues", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWeights(value: js.Array[Double]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      inline def setWeightsVarargs(value: Double*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
}
