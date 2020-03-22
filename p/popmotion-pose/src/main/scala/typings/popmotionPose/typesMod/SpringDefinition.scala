package typings.popmotionPose.typesMod

import typings.popmotionPose.popmotionPoseStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :'spring'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.SpringProps & popmotion-pose.popmotion-pose/lib/types.NoEase */
trait SpringDefinition extends TransitionDefinition {
  var damping: js.UndefOr[Double] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[scala.Nothing] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var restDelta: js.UndefOr[Double] = js.undefined
  var restSpeed: js.UndefOr[Double] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
  var `type`: spring
  var velocity: js.UndefOr[Double] = js.undefined
}

object SpringDefinition {
  @scala.inline
  def apply(
    `type`: spring,
    damping: Int | Double = null,
    delay: Int | Double = null,
    ease: js.UndefOr[scala.Nothing] = js.undefined,
    from: Int | Double = null,
    mass: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    restDelta: Int | Double = null,
    restSpeed: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    stiffness: Int | Double = null,
    to: Int | Double = null,
    velocity: Int | Double = null
  ): SpringDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(ease)) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (restDelta != null) __obj.updateDynamic("restDelta")(restDelta.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringDefinition]
  }
}

