package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationalSpringOptions extends SpringOptions {
  var restAngle: js.UndefOr[scala.Double] = js.undefined
}

object RotationalSpringOptions {
  @scala.inline
  def apply(
    damping: scala.Int | scala.Double = null,
    localAnchorA: js.Tuple2[scala.Double, scala.Double] = null,
    localAnchorB: js.Tuple2[scala.Double, scala.Double] = null,
    restAngle: scala.Int | scala.Double = null,
    stiffness: scala.Int | scala.Double = null,
    worldAnchorA: js.Tuple2[scala.Double, scala.Double] = null,
    worldAnchorB: js.Tuple2[scala.Double, scala.Double] = null
  ): RotationalSpringOptions = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA)
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB)
    if (restAngle != null) __obj.updateDynamic("restAngle")(restAngle.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (worldAnchorA != null) __obj.updateDynamic("worldAnchorA")(worldAnchorA)
    if (worldAnchorB != null) __obj.updateDynamic("worldAnchorB")(worldAnchorB)
    __obj.asInstanceOf[RotationalSpringOptions]
  }
}

