package typings.mlLevenbergMarquardt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var iterations: Double = js.native
  
  var parameterError: Double = js.native
  
  var parameterValues: js.Array[Double] = js.native
}
object Result {
  
  @scala.inline
  def apply(iterations: Double, parameterError: Double, parameterValues: js.Array[Double]): Result = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], parameterError = parameterError.asInstanceOf[js.Any], parameterValues = parameterValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterError(value: Double): Self = this.set("parameterError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValuesVarargs(value: Double*): Self = this.set("parameterValues", js.Array(value :_*))
    
    @scala.inline
    def setParameterValues(value: js.Array[Double]): Self = this.set("parameterValues", value.asInstanceOf[js.Any])
  }
}
