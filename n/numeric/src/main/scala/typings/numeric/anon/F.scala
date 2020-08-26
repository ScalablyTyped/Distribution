package typings.numeric.anon

import typings.numeric.mod.Matrix
import typings.numeric.mod.Scalar
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait F extends js.Object {
  var f: Scalar = js.native
  var gradient: Vector = js.native
  var invHessian: Matrix = js.native
  var iterations: Double = js.native
  var message: String = js.native
  var solution: Vector = js.native
}

object F {
  @scala.inline
  def apply(
    f: Scalar,
    gradient: Vector,
    invHessian: Matrix,
    iterations: Double,
    message: String,
    solution: Vector
  ): F = {
    val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], invHessian = invHessian.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
    __obj.asInstanceOf[F]
  }
  @scala.inline
  implicit class FOps[Self <: F] (val x: Self) extends AnyVal {
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
    def setF(value: Scalar): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradientVarargs(value: Double*): Self = this.set("gradient", js.Array(value :_*))
    @scala.inline
    def setGradient(value: Vector): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvHessianVarargs(value: js.Array[Double]*): Self = this.set("invHessian", js.Array(value :_*))
    @scala.inline
    def setInvHessian(value: Matrix): Self = this.set("invHessian", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolutionVarargs(value: Double*): Self = this.set("solution", js.Array(value :_*))
    @scala.inline
    def setSolution(value: Vector): Self = this.set("solution", value.asInstanceOf[js.Any])
  }
  
}

