package typings.mlLevenbergMarquardt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var iterations: Double
  var parameterError: Double
  var parameterValues: js.Array[Double]
}

object Result {
  @scala.inline
  def apply(iterations: Double, parameterError: Double, parameterValues: js.Array[Double]): Result = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], parameterError = parameterError.asInstanceOf[js.Any], parameterValues = parameterValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

