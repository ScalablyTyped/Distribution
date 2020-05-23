package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevoluteConstraintOptions extends ConstraintOptions {
  var localPivotA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var localPivotB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var maxForce: js.UndefOr[Double] = js.undefined
  var worldPivot: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object RevoluteConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[Boolean] = js.undefined,
    localPivotA: js.Tuple2[Double, Double] = null,
    localPivotB: js.Tuple2[Double, Double] = null,
    maxForce: js.UndefOr[Double] = js.undefined,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined,
    worldPivot: js.Tuple2[Double, Double] = null
  ): RevoluteConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected.get.asInstanceOf[js.Any])
    if (localPivotA != null) __obj.updateDynamic("localPivotA")(localPivotA.asInstanceOf[js.Any])
    if (localPivotB != null) __obj.updateDynamic("localPivotB")(localPivotB.asInstanceOf[js.Any])
    if (!js.isUndefined(maxForce)) __obj.updateDynamic("maxForce")(maxForce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies.get.asInstanceOf[js.Any])
    if (worldPivot != null) __obj.updateDynamic("worldPivot")(worldPivot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevoluteConstraintOptions]
  }
}

