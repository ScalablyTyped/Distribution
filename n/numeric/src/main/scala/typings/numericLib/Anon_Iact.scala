package typings
package numericLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iact extends js.Object {
  var iact: Vector
  var iterations: Vector
  var message: java.lang.String
  var solution: Vector
  var unconstrained_solution: Vector
  var value: Vector
}

object Anon_Iact {
  @scala.inline
  def apply(
    iact: Vector,
    iterations: Vector,
    message: java.lang.String,
    solution: Vector,
    unconstrained_solution: Vector,
    value: Vector
  ): Anon_Iact = {
    val __obj = js.Dynamic.literal(iact = iact, iterations = iterations, message = message, solution = solution, unconstrained_solution = unconstrained_solution, value = value)
  
    __obj.asInstanceOf[Anon_Iact]
  }
}

