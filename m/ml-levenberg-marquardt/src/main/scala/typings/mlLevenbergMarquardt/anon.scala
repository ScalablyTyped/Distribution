package typings.mlLevenbergMarquardt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ml-levenberg-marquardt.ml-levenberg-marquardt.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var damping: js.UndefOr[Double] = js.native
    
    var errorTolerance: js.UndefOr[Double] = js.native
    
    var gradientDifference: js.UndefOr[Double] = js.native
    
    var initialValues: js.UndefOr[js.Array[Double]] = js.native
    
    var maxIterations: js.UndefOr[Double] = js.native
    
    var maxValue: js.UndefOr[js.Array[Double]] = js.native
    
    var minValue: js.UndefOr[js.Array[Double]] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      @scala.inline
      def setErrorTolerance(value: Double): Self = StObject.set(x, "errorTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorToleranceUndefined: Self = StObject.set(x, "errorTolerance", js.undefined)
      
      @scala.inline
      def setGradientDifference(value: Double): Self = StObject.set(x, "gradientDifference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientDifferenceUndefined: Self = StObject.set(x, "gradientDifference", js.undefined)
      
      @scala.inline
      def setInitialValues(value: js.Array[Double]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      @scala.inline
      def setInitialValuesVarargs(value: Double*): Self = StObject.set(x, "initialValues", js.Array(value :_*))
      
      @scala.inline
      def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
      
      @scala.inline
      def setMaxValue(value: js.Array[Double]): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMaxValueVarargs(value: Double*): Self = StObject.set(x, "maxValue", js.Array(value :_*))
      
      @scala.inline
      def setMinValue(value: js.Array[Double]): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setMinValueVarargs(value: Double*): Self = StObject.set(x, "minValue", js.Array(value :_*))
    }
  }
}
