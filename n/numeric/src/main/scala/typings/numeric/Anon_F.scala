package typings.numeric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_F extends js.Object {
  var f: Scalar
  var gradient: Vector
  var invHessian: Matrix
  var iterations: Double
  var message: String
  var solution: Vector
}

object Anon_F {
  @scala.inline
  def apply(
    f: Scalar,
    gradient: Vector,
    invHessian: Matrix,
    iterations: Double,
    message: String,
    solution: Vector
  ): Anon_F = {
    val __obj = js.Dynamic.literal(f = f, gradient = gradient, invHessian = invHessian, iterations = iterations, message = message, solution = solution)
  
    __obj.asInstanceOf[Anon_F]
  }
}

