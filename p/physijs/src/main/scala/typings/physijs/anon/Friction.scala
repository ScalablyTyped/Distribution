package typings.physijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Friction extends js.Object {
  var friction: Double = js.native
  var id: Double = js.native
  var restriction: Double = js.native
}

object Friction {
  @scala.inline
  def apply(friction: Double, id: Double, restriction: Double): Friction = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friction]
  }
  @scala.inline
  implicit class FrictionOps[Self <: Friction] (val x: Self) extends AnyVal {
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
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestriction(value: Double): Self = this.set("restriction", value.asInstanceOf[js.Any])
  }
  
}

