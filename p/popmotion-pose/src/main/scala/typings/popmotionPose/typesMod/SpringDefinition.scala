package typings.popmotionPose.typesMod

import typings.popmotionPose.popmotionPoseStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type :'spring'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.SpringProps & popmotion-pose.popmotion-pose/lib/types.NoEase */
@js.native
trait SpringDefinition extends TransitionDefinition {
  var damping: js.UndefOr[Double] = js.native
  var delay: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[scala.Nothing] = js.native
  var from: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var restDelta: js.UndefOr[Double] = js.native
  var restSpeed: js.UndefOr[Double] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var to: js.UndefOr[Double] = js.native
  var `type`: spring = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object SpringDefinition {
  @scala.inline
  def apply(`type`: spring): SpringDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringDefinition]
  }
  @scala.inline
  implicit class SpringDefinitionOps[Self <: SpringDefinition] (val x: Self) extends AnyVal {
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
    def setType(value: spring): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setRestDelta(value: Double): Self = this.set("restDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestDelta: Self = this.set("restDelta", js.undefined)
    @scala.inline
    def setRestSpeed(value: Double): Self = this.set("restSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSpeed: Self = this.set("restSpeed", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
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

