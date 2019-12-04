package typings.numeric

import typings.numeric.numericMod.Scalar
import typings.numeric.numericMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iterations extends js.Object {
  var iterations: Double
  var message: String
  var solution: Scalar | Vector
}

object Anon_Iterations {
  @scala.inline
  def apply(iterations: Double, message: String, solution: Scalar | Vector): Anon_Iterations = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Iterations]
  }
}

