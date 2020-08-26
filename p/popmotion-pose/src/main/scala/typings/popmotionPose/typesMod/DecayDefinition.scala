package typings.popmotionPose.typesMod

import typings.popmotion.decayTypesMod.ModifyTarget
import typings.popmotionPose.popmotionPoseStrings.decay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type :'decay'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.DecayProps & popmotion-pose.popmotion-pose/lib/types.NoEase */
@js.native
trait DecayDefinition extends TransitionDefinition {
  var delay: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[scala.Nothing] = js.native
  var from: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var modifyTarget: js.UndefOr[ModifyTarget] = js.native
  var power: js.UndefOr[Double] = js.native
  var restDelta: js.UndefOr[Double] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var timeConstant: js.UndefOr[Double] = js.native
  var `type`: decay = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object DecayDefinition {
  @scala.inline
  def apply(`type`: decay): DecayDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayDefinition]
  }
  @scala.inline
  implicit class DecayDefinitionOps[Self <: DecayDefinition] (val x: Self) extends AnyVal {
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
    def setType(value: decay): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
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
    def setModifyTarget(value: /* v */ Double => Double): Self = this.set("modifyTarget", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyTarget: Self = this.set("modifyTarget", js.undefined)
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    @scala.inline
    def setRestDelta(value: Double): Self = this.set("restDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestDelta: Self = this.set("restDelta", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setTimeConstant(value: Double): Self = this.set("timeConstant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeConstant: Self = this.set("timeConstant", js.undefined)
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

