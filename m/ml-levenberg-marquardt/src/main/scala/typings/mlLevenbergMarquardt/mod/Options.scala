package typings.mlLevenbergMarquardt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The Levenberg-Marquardt lambda parameter.
    * Default value: 0
    */
  var damping: Double = js.native
  
  /**
    * Minimum uncertainty allowed for each point.
    * Default value: 10e-3
    */
  var errorTolerance: Double = js.native
  
  /**
    * Adjustment for decrease the damping parameter.
    * Default value: 10e-2
    */
  var gradientDifference: Double = js.native
  
  /**
    * Initial guesses for the parameters.
    * Default value: Array(parameters.lengh).fill(1)
    */
  var initialValues: js.Array[Double] = js.native
  
  /**
    * The maximum number of iterations before halting.
    * Default value: 100
    */
  var maxIterations: Double = js.native
  
  /**
    * Maximum values for the parameters.
    * Default value: Array(data.x.length).fill(MAX_SAFE_INTEGER)
    */
  var maxValue: js.Array[Double] = js.native
  
  /**
    * Minimum values for the parameters.
    * Default value: Array(data.x.length).fill(MIN_SAFE_INTEGER)
    */
  var minValue: js.Array[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    damping: Double,
    errorTolerance: Double,
    gradientDifference: Double,
    initialValues: js.Array[Double],
    maxIterations: Double,
    maxValue: js.Array[Double],
    minValue: js.Array[Double]
  ): Options = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], errorTolerance = errorTolerance.asInstanceOf[js.Any], gradientDifference = gradientDifference.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], maxIterations = maxIterations.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setErrorTolerance(value: Double): Self = this.set("errorTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientDifference(value: Double): Self = this.set("gradientDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValuesVarargs(value: Double*): Self = this.set("initialValues", js.Array(value :_*))
    
    @scala.inline
    def setInitialValues(value: js.Array[Double]): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterations(value: Double): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueVarargs(value: Double*): Self = this.set("maxValue", js.Array(value :_*))
    
    @scala.inline
    def setMaxValue(value: js.Array[Double]): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueVarargs(value: Double*): Self = this.set("minValue", js.Array(value :_*))
    
    @scala.inline
    def setMinValue(value: js.Array[Double]): Self = this.set("minValue", value.asInstanceOf[js.Any])
  }
}
