package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GearConstraintOptions extends ConstraintOptions {
  var angle: js.UndefOr[Double] = js.undefined
  var maxTorque: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
}

object GearConstraintOptions {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    collideConnected: js.UndefOr[Boolean] = js.undefined,
    maxTorque: Int | Double = null,
    ratio: Int | Double = null,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): GearConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected)
    if (maxTorque != null) __obj.updateDynamic("maxTorque")(maxTorque.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies)
    __obj.asInstanceOf[GearConstraintOptions]
  }
}

