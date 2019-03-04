package typings
package mlDashLevenbergDashMarquardtLib.mlDashLevenbergDashMarquardtMod.LMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var iterations: scala.Double
  var parameterError: scala.Double
  var parameterValues: js.Array[scala.Double]
}

object Result {
  @scala.inline
  def apply(iterations: scala.Double, parameterError: scala.Double, parameterValues: js.Array[scala.Double]): Result = {
    val __obj = js.Dynamic.literal(iterations = iterations, parameterError = parameterError, parameterValues = parameterValues)
  
    __obj.asInstanceOf[Result]
  }
}

