package typings.numeric.anon

import typings.numeric.mod.Scalar
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterations extends js.Object {
  var iterations: Double = js.native
  var message: String = js.native
  var solution: Scalar | Vector = js.native
}

object Iterations {
  @scala.inline
  def apply(iterations: Double, message: String, solution: Scalar | Vector): Iterations = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterations]
  }
  @scala.inline
  implicit class IterationsOps[Self <: Iterations] (val x: Self) extends AnyVal {
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
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolutionVarargs(value: Double*): Self = this.set("solution", js.Array(value :_*))
    @scala.inline
    def setSolution(value: Scalar | Vector): Self = this.set("solution", value.asInstanceOf[js.Any])
  }
  
}

