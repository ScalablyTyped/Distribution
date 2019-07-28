package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringOptions extends js.Object {
  var damping: js.UndefOr[Double] = js.undefined
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var worldAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var worldAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object SpringOptions {
  @scala.inline
  def apply(
    damping: Int | Double = null,
    localAnchorA: js.Tuple2[Double, Double] = null,
    localAnchorB: js.Tuple2[Double, Double] = null,
    stiffness: Int | Double = null,
    worldAnchorA: js.Tuple2[Double, Double] = null,
    worldAnchorB: js.Tuple2[Double, Double] = null
  ): SpringOptions = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA)
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB)
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (worldAnchorA != null) __obj.updateDynamic("worldAnchorA")(worldAnchorA)
    if (worldAnchorB != null) __obj.updateDynamic("worldAnchorB")(worldAnchorB)
    __obj.asInstanceOf[SpringOptions]
  }
}

