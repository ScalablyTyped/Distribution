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
    val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], invHessian = invHessian.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_F]
  }
}

