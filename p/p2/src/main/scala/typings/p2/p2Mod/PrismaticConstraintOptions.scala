package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismaticConstraintOptions extends ConstraintOptions {
  var disableRotationalLock: js.UndefOr[Boolean] = js.undefined
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var localAxisA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var lowerLimit: js.UndefOr[Double] = js.undefined
  var maxForce: js.UndefOr[Double] = js.undefined
  var upperLimit: js.UndefOr[Double] = js.undefined
}

object PrismaticConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[Boolean] = js.undefined,
    disableRotationalLock: js.UndefOr[Boolean] = js.undefined,
    localAnchorA: js.Tuple2[Double, Double] = null,
    localAnchorB: js.Tuple2[Double, Double] = null,
    localAxisA: js.Tuple2[Double, Double] = null,
    lowerLimit: Int | Double = null,
    maxForce: Int | Double = null,
    upperLimit: Int | Double = null,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): PrismaticConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRotationalLock)) __obj.updateDynamic("disableRotationalLock")(disableRotationalLock.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA.asInstanceOf[js.Any])
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB.asInstanceOf[js.Any])
    if (localAxisA != null) __obj.updateDynamic("localAxisA")(localAxisA.asInstanceOf[js.Any])
    if (lowerLimit != null) __obj.updateDynamic("lowerLimit")(lowerLimit.asInstanceOf[js.Any])
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (upperLimit != null) __obj.updateDynamic("upperLimit")(upperLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismaticConstraintOptions]
  }
}

