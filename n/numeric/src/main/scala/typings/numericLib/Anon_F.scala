package typings
package numericLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_F extends js.Object {
  var f: Scalar
  var gradient: Vector
  var invHessian: Matrix
  var iterations: scala.Double
  var message: java.lang.String
  var solution: Vector
}

object Anon_F {
  @scala.inline
  def apply(
    f: Scalar,
    gradient: Vector,
    invHessian: Matrix,
    iterations: scala.Double,
    message: java.lang.String,
    solution: Vector
  ): Anon_F = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("f")(f)
    __obj.updateDynamic("gradient")(gradient)
    __obj.updateDynamic("invHessian")(invHessian)
    __obj.updateDynamic("iterations")(iterations)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("solution")(solution)
    __obj.asInstanceOf[Anon_F]
  }
}

