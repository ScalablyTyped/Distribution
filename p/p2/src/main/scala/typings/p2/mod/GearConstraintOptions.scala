package typings.p2.mod

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
    angle: js.UndefOr[Double] = js.undefined,
    collideConnected: js.UndefOr[Boolean] = js.undefined,
    maxTorque: js.UndefOr[Double] = js.undefined,
    ratio: js.UndefOr[Double] = js.undefined,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): GearConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTorque)) __obj.updateDynamic("maxTorque")(maxTorque.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GearConstraintOptions]
  }
}

