package typings.mlLevenbergMarquardt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ml-levenberg-marquardt.ml-levenberg-marquardt.Options> */
@js.native
trait PartialOptions extends js.Object {
  
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
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    
    @scala.inline
    def setErrorTolerance(value: Double): Self = this.set("errorTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorTolerance: Self = this.set("errorTolerance", js.undefined)
    
    @scala.inline
    def setGradientDifference(value: Double): Self = this.set("gradientDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientDifference: Self = this.set("gradientDifference", js.undefined)
    
    @scala.inline
    def setInitialValuesVarargs(value: Double*): Self = this.set("initialValues", js.Array(value :_*))
    
    @scala.inline
    def setInitialValues(value: js.Array[Double]): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValues: Self = this.set("initialValues", js.undefined)
    
    @scala.inline
    def setMaxIterations(value: Double): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIterations: Self = this.set("maxIterations", js.undefined)
    
    @scala.inline
    def setMaxValueVarargs(value: Double*): Self = this.set("maxValue", js.Array(value :_*))
    
    @scala.inline
    def setMaxValue(value: js.Array[Double]): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValueVarargs(value: Double*): Self = this.set("minValue", js.Array(value :_*))
    
    @scala.inline
    def setMinValue(value: js.Array[Double]): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
  }
}
