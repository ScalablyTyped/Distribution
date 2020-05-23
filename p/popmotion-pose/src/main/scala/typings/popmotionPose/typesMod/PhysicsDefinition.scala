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
    acceleration: js.UndefOr[Double] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    friction: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    restSpeed: Double | `false` = null,
    round: js.UndefOr[Boolean] = js.undefined,
    springStrength: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): PhysicsDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(acceleration)) __obj.updateDynamic("acceleration")(acceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springStrength)) __obj.updateDynamic("springStrength")(springStrength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsDefinition]
  }
}

