package typings.popmotionPose.typesMod

import typings.popmotion.decayTypesMod.ModifyTarget
import typings.popmotionPose.popmotionPoseStrings.decay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :'decay'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.DecayProps & popmotion-pose.popmotion-pose/lib/types.NoEase */
trait DecayDefinition extends TransitionDefinition {
  var delay: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[scala.Nothing] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var modifyTarget: js.UndefOr[ModifyTarget] = js.undefined
  var power: js.UndefOr[Double] = js.undefined
  var restDelta: js.UndefOr[Double] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var timeConstant: js.UndefOr[Double] = js.undefined
  var `type`: decay
  var velocity: js.UndefOr[Double] = js.undefined
}

object DecayDefinition {
  @scala.inline
  def apply(
    `type`: decay,
    delay: Int | Double = null,
    ease: js.UndefOr[scala.Nothing] = js.undefined,
    from: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    modifyTarget: /* v */ Double => Double = null,
    power: Int | Double = null,
    restDelta: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    timeConstant: Int | Double = null,
    velocity: Int | Double = null
  ): DecayDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(ease)) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (modifyTarget != null) __obj.updateDynamic("modifyTarget")(js.Any.fromFunction1(modifyTarget))
    if (power != null) __obj.updateDynamic("power")(power.asInstanceOf[js.Any])
    if (restDelta != null) __obj.updateDynamic("restDelta")(restDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (timeConstant != null) __obj.updateDynamic("timeConstant")(timeConstant.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayDefinition]
  }
}

