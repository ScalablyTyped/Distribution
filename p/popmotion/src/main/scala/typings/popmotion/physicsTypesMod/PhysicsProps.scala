package typings.popmotion.physicsTypesMod

import typings.popmotion.popmotionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsProps extends js.Object {
  var acceleration: js.UndefOr[Double] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var restSpeed: js.UndefOr[Double | `false`] = js.undefined
  var springStrength: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object PhysicsProps {
  @scala.inline
  def apply(
    acceleration: js.UndefOr[Double] = js.undefined,
    friction: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    restSpeed: Double | `false` = null,
    springStrength: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): PhysicsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceleration)) __obj.updateDynamic("acceleration")(acceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(springStrength)) __obj.updateDynamic("springStrength")(springStrength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsProps]
  }
}

