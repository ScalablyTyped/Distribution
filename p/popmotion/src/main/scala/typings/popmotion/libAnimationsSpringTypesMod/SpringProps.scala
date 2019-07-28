package typings.popmotion.libAnimationsSpringTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringProps extends js.Object {
  var damping: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var restDelta: js.UndefOr[Double] = js.undefined
  var restSpeed: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object SpringProps {
  @scala.inline
  def apply(
    damping: Int | Double = null,
    from: Int | Double = null,
    mass: Int | Double = null,
    restDelta: Int | Double = null,
    restSpeed: Int | Double = null,
    stiffness: Int | Double = null,
    to: Int | Double = null,
    velocity: Int | Double = null
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

