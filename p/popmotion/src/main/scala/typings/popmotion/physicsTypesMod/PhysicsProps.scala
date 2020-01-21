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
    acceleration: Int | Double = null,
    friction: Int | Double = null,
    from: Int | Double = null,
    restSpeed: Double | `false` = null,
    springStrength: Int | Double = null,
    to: Int | Double = null,
    velocity: Int | Double = null
  ): PhysicsProps = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (springStrength != null) __obj.updateDynamic("springStrength")(springStrength.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsProps]
  }
}

