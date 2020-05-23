package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearSpringOptions extends SpringOptions {
  var restLength: js.UndefOr[Double] = js.undefined
}

object LinearSpringOptions {
  @scala.inline
  def apply(
    damping: js.UndefOr[Double] = js.undefined,
    localAnchorA: js.Tuple2[Double, Double] = null,
    localAnchorB: js.Tuple2[Double, Double] = null,
    restLength: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    worldAnchorA: js.Tuple2[Double, Double] = null,
    worldAnchorB: js.Tuple2[Double, Double] = null
  ): LinearSpringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA.asInstanceOf[js.Any])
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB.asInstanceOf[js.Any])
    if (!js.isUndefined(restLength)) __obj.updateDynamic("restLength")(restLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (worldAnchorA != null) __obj.updateDynamic("worldAnchorA")(worldAnchorA.asInstanceOf[js.Any])
    if (worldAnchorB != null) __obj.updateDynamic("worldAnchorB")(worldAnchorB.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearSpringOptions]
  }
}

