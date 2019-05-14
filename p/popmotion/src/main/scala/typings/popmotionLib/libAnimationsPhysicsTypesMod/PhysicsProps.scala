package typings
package popmotionLib.libAnimationsPhysicsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsProps extends js.Object {
  var acceleration: js.UndefOr[scala.Double] = js.undefined
  var friction: js.UndefOr[scala.Double] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var restSpeed: js.UndefOr[scala.Double | popmotionLib.popmotionLibNumbers.`false`] = js.undefined
  var springStrength: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[scala.Double] = js.undefined
}

object PhysicsProps {
  @scala.inline
  def apply(
    acceleration: scala.Int | scala.Double = null,
    friction: scala.Int | scala.Double = null,
    from: scala.Int | scala.Double = null,
    restSpeed: scala.Double | popmotionLib.popmotionLibNumbers.`false` = null,
    springStrength: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null,
    velocity: scala.Int | scala.Double = null
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

