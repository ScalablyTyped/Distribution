package typings
package numericLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iterations extends js.Object {
  var iterations: scala.Double
  var message: java.lang.String
  var solution: Scalar | Vector
}

object Anon_Iterations {
  @scala.inline
  def apply(iterations: scala.Double, message: java.lang.String, solution: Scalar | Vector): Anon_Iterations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iterations")(iterations)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("solution")(solution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Iterations]
  }
}

