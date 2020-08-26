package typings.popmotionPose.typesMod

import typings.popmotionPose.popmotionPoseBooleans.`false`
import typings.popmotionPose.popmotionPoseStrings.physics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type :'physics'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.PhysicsProps & popmotion-pose.popmotion-pose/lib/types.NoEase */
@js.native
trait PhysicsDefinition extends TransitionDefinition {
  var acceleration: js.UndefOr[Double] = js.native
  var delay: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[scala.Nothing] = js.native
  var friction: js.UndefOr[Double] = js.native
  var from: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var restSpeed: js.UndefOr[Double | `false`] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var springStrength: js.UndefOr[Double] = js.native
  var to: js.UndefOr[Double] = js.native
  var `type`: physics = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object PhysicsDefinition {
  @scala.inline
  def apply(`type`: physics): PhysicsDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsDefinition]
  }
  @scala.inline
  implicit class PhysicsDefinitionOps[Self <: PhysicsDefinition] (val x: Self) extends AnyVal {
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
    def setType(value: physics): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceleration(value: Double): Self = this.set("acceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleration: Self = this.set("acceleration", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setRestSpeed(value: Double | `false`): Self = this.set("restSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSpeed: Self = this.set("restSpeed", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
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

