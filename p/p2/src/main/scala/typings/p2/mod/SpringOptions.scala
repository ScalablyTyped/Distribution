package typings.p2.mod

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
    damping: js.UndefOr[Double] = js.undefined,
    localAnchorA: js.Tuple2[Double, Double] = null,
    localAnchorB: js.Tuple2[Double, Double] = null,
    stiffness: js.UndefOr[Double] = js.undefined,
    worldAnchorA: js.Tuple2[Double, Double] = null,
    worldAnchorB: js.Tuple2[Double, Double] = null
  ): SpringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA.asInstanceOf[js.Any])
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (worldAnchorA != null) __obj.updateDynamic("worldAnchorA")(worldAnchorA.asInstanceOf[js.Any])
    if (worldAnchorB != null) __obj.updateDynamic("worldAnchorB")(worldAnchorB.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringOptions]
  }
}

