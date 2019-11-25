package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearSpringOptions extends SpringOptions {
  var restLength: js.UndefOr[Double] = js.undefined
}

object LinearSpringOptions {
  @scala.inline
  def apply(
    damping: Int | Double = null,
    localAnchorA: js.Tuple2[Double, Double] = null,
    localAnchorB: js.Tuple2[Double, Double] = null,
    restLength: Int | Double = null,
    stiffness: Int | Double = null,
    worldAnchorA: js.Tuple2[Double, Double] = null,
    worldAnchorB: js.Tuple2[Double, Double] = null
  ): LinearSpringOptions = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA.asInstanceOf[js.Any])
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB.asInstanceOf[js.Any])
    if (restLength != null) __obj.updateDynamic("restLength")(restLength.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (worldAnchorA != null) __obj.updateDynamic("worldAnchorA")(worldAnchorA.asInstanceOf[js.Any])
    if (worldAnchorB != null) __obj.updateDynamic("worldAnchorB")(worldAnchorB.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearSpringOptions]
  }
}

