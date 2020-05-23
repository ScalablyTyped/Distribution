package typings.p2.mod

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
    distance: js.UndefOr[Double] = js.undefined,
    localAnchorA: js.Tuple2[Double, Double] = null,
    localAnchorB: js.Tuple2[Double, Double] = null,
    maxForce: js.UndefOr[Double] = js.undefined,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): DistanceConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA.asInstanceOf[js.Any])
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB.asInstanceOf[js.Any])
    if (!js.isUndefined(maxForce)) __obj.updateDynamic("maxForce")(maxForce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceConstraintOptions]
  }
}

