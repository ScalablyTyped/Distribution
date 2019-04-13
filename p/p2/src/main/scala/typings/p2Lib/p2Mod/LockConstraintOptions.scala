package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockConstraintOptions extends ConstraintOptions {
  var localAngleB: js.UndefOr[scala.Double] = js.undefined
  var localOffsetB: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var maxForce: js.UndefOr[scala.Double] = js.undefined
}

object LockConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[scala.Boolean] = js.undefined,
    localAngleB: scala.Int | scala.Double = null,
    localOffsetB: js.Tuple2[scala.Double, scala.Double] = null,
    maxForce: scala.Int | scala.Double = null,
    wakeUpBodies: js.UndefOr[scala.Boolean] = js.undefined
  ): LockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected)
    if (localAngleB != null) __obj.updateDynamic("localAngleB")(localAngleB.asInstanceOf[js.Any])
    if (localOffsetB != null) __obj.updateDynamic("localOffsetB")(localOffsetB)
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies)
    __obj.asInstanceOf[LockConstraintOptions]
  }
}

