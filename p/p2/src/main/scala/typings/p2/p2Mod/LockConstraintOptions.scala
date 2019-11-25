package typings.p2.p2Mod

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
    localAngleB: Int | Double = null,
    localOffsetB: js.Tuple2[Double, Double] = null,
    maxForce: Int | Double = null,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): LockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected.asInstanceOf[js.Any])
    if (localAngleB != null) __obj.updateDynamic("localAngleB")(localAngleB.asInstanceOf[js.Any])
    if (localOffsetB != null) __obj.updateDynamic("localOffsetB")(localOffsetB.asInstanceOf[js.Any])
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockConstraintOptions]
  }
}

