package typings
package popmotionLib.libAnimationsSpringTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringProps extends js.Object {
  var damping: js.UndefOr[scala.Double] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var mass: js.UndefOr[scala.Double] = js.undefined
  var restDelta: js.UndefOr[scala.Double] = js.undefined
  var restSpeed: js.UndefOr[scala.Double] = js.undefined
  var stiffness: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[scala.Double] = js.undefined
}

object SpringProps {
  @scala.inline
  def apply(
    damping: scala.Int | scala.Double = null,
    from: scala.Int | scala.Double = null,
    mass: scala.Int | scala.Double = null,
    restDelta: scala.Int | scala.Double = null,
    restSpeed: scala.Int | scala.Double = null,
    stiffness: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null,
    velocity: scala.Int | scala.Double = null
  ): SpringProps = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (restDelta != null) __obj.updateDynamic("restDelta")(restDelta.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringProps]
  }
}

