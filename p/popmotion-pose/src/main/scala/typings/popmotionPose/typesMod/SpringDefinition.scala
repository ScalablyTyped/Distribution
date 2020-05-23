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
    damping: js.UndefOr[Double] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    restDelta: js.UndefOr[Double] = js.undefined,
    restSpeed: js.UndefOr[Double] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): SpringDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restDelta)) __obj.updateDynamic("restDelta")(restDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restSpeed)) __obj.updateDynamic("restSpeed")(restSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringDefinition]
  }
}

