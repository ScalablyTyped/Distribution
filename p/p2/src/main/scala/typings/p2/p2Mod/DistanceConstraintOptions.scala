package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceConstraintOptions extends ConstraintOptions {
  var distance: js.UndefOr[Double] = js.undefined
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var maxForce: js.UndefOr[Double] = js.undefined
}

object DistanceConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    localAnchorA: js.Tuple2[Double, Double] = null,
    localAnchorB: js.Tuple2[Double, Double] = null,
    maxForce: Int | Double = null,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): DistanceConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA.asInstanceOf[js.Any])
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB.asInstanceOf[js.Any])
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceConstraintOptions]
  }
}

