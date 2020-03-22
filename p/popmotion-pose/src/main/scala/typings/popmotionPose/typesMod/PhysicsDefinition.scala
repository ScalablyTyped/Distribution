package typings.popmotionPose.typesMod

import typings.popmotionPose.popmotionPoseBooleans.`false`
import typings.popmotionPose.popmotionPoseStrings.physics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :'physics'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.PhysicsProps & popmotion-pose.popmotion-pose/lib/types.NoEase */
trait PhysicsDefinition extends TransitionDefinition {
  var acceleration: js.UndefOr[Double] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[scala.Nothing] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var restSpeed: js.UndefOr[Double | `false`] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var springStrength: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
  var `type`: physics
  var velocity: js.UndefOr[Double] = js.undefined
}

object PhysicsDefinition {
  @scala.inline
  def apply(
    `type`: physics,
    acceleration: Int | Double = null,
    delay: Int | Double = null,
    ease: js.UndefOr[scala.Nothing] = js.undefined,
    friction: Int | Double = null,
    from: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    restSpeed: Double | `false` = null,
    round: js.UndefOr[Boolean] = js.undefined,
    springStrength: Int | Double = null,
    to: Int | Double = null,
    velocity: Int | Double = null
  ): PhysicsDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(ease)) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (springStrength != null) __obj.updateDynamic("springStrength")(springStrength.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsDefinition]
  }
}

