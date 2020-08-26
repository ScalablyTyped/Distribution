package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gravity extends js.Object {
  var gravity: js.Array[Double] = js.native
}

object Gravity {
  @scala.inline
  def apply(gravity: js.Array[Double]): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravity]
  }
  @scala.inline
  implicit class GravityOps[Self <: Gravity] (val x: Self) extends AnyVal {
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
    def setGravityVarargs(value: Double*): Self = this.set("gravity", js.Array(value :_*))
    @scala.inline
    def setGravity(value: js.Array[Double]): Self = this.set("gravity", value.asInstanceOf[js.Any])
  }
  
}

