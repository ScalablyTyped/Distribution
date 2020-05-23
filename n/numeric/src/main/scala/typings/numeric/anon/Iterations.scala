package typings.numeric.anon

import typings.numeric.mod.Scalar
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterations extends js.Object {
  var iterations: Double
  var message: String
  var solution: Scalar | Vector
}

object Iterations {
  @scala.inline
  def apply(iterations: Double, message: String, solution: Scalar | Vector): Iterations = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterations]
  }
}

