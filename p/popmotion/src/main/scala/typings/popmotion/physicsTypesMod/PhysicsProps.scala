package typings.popmotion.physicsTypesMod

import typings.popmotion.popmotionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsProps extends js.Object {
  var acceleration: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var from: js.UndefOr[Double] = js.native
  var restSpeed: js.UndefOr[Double | `false`] = js.native
  var springStrength: js.UndefOr[Double] = js.native
  var to: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object PhysicsProps {
  @scala.inline
  def apply(): PhysicsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsProps]
  }
  @scala.inline
  implicit class PhysicsPropsOps[Self <: PhysicsProps] (val x: Self) extends AnyVal {
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
    def setAcceleration(value: Double): Self = this.set("acceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleration: Self = this.set("acceleration", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setRestSpeed(value: Double | `false`): Self = this.set("restSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSpeed: Self = this.set("restSpeed", js.undefined)
    @scala.inline
    def setSpringStrength(value: Double): Self = this.set("springStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringStrength: Self = this.set("springStrength", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

