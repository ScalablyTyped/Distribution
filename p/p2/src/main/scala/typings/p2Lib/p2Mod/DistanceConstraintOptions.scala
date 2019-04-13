package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceConstraintOptions extends ConstraintOptions {
  var distance: js.UndefOr[scala.Double] = js.undefined
  var localAnchorA: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var localAnchorB: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var maxForce: js.UndefOr[scala.Double] = js.undefined
}

object DistanceConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[scala.Boolean] = js.undefined,
    distance: scala.Int | scala.Double = null,
    localAnchorA: js.Tuple2[scala.Double, scala.Double] = null,
    localAnchorB: js.Tuple2[scala.Double, scala.Double] = null,
    maxForce: scala.Int | scala.Double = null,
    wakeUpBodies: js.UndefOr[scala.Boolean] = js.undefined
  ): DistanceConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA)
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB)
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies)
    __obj.asInstanceOf[DistanceConstraintOptions]
  }
}

