package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevoluteConstraintOptions extends ConstraintOptions {
  var localPivotA: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var localPivotB: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var maxForce: js.UndefOr[scala.Double] = js.undefined
  var worldPivot: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object RevoluteConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[scala.Boolean] = js.undefined,
    localPivotA: js.Tuple2[scala.Double, scala.Double] = null,
    localPivotB: js.Tuple2[scala.Double, scala.Double] = null,
    maxForce: scala.Int | scala.Double = null,
    wakeUpBodies: js.UndefOr[scala.Boolean] = js.undefined,
    worldPivot: js.Tuple2[scala.Double, scala.Double] = null
  ): RevoluteConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected)
    if (localPivotA != null) __obj.updateDynamic("localPivotA")(localPivotA)
    if (localPivotB != null) __obj.updateDynamic("localPivotB")(localPivotB)
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies)
    if (worldPivot != null) __obj.updateDynamic("worldPivot")(worldPivot)
    __obj.asInstanceOf[RevoluteConstraintOptions]
  }
}

