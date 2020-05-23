package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockConstraintOptions extends ConstraintOptions {
  var localAngleB: js.UndefOr[Double] = js.undefined
  var localOffsetB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var maxForce: js.UndefOr[Double] = js.undefined
}

object LockConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[Boolean] = js.undefined,
    localAngleB: js.UndefOr[Double] = js.undefined,
    localOffsetB: js.Tuple2[Double, Double] = null,
    maxForce: js.UndefOr[Double] = js.undefined,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): LockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localAngleB)) __obj.updateDynamic("localAngleB")(localAngleB.get.asInstanceOf[js.Any])
    if (localOffsetB != null) __obj.updateDynamic("localOffsetB")(localOffsetB.asInstanceOf[js.Any])
    if (!js.isUndefined(maxForce)) __obj.updateDynamic("maxForce")(maxForce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockConstraintOptions]
  }
}

