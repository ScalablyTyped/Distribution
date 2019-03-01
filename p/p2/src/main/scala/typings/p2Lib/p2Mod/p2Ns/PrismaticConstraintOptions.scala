package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismaticConstraintOptions extends ConstraintOptions {
  var disableRotationalLock: js.UndefOr[scala.Boolean] = js.undefined
  var localAnchorA: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var localAnchorB: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var localAxisA: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var lowerLimit: js.UndefOr[scala.Double] = js.undefined
  var maxForce: js.UndefOr[scala.Double] = js.undefined
  var upperLimit: js.UndefOr[scala.Double] = js.undefined
}

object PrismaticConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[scala.Boolean] = js.undefined,
    disableRotationalLock: js.UndefOr[scala.Boolean] = js.undefined,
    localAnchorA: js.Tuple2[scala.Double, scala.Double] = null,
    localAnchorB: js.Tuple2[scala.Double, scala.Double] = null,
    localAxisA: js.Tuple2[scala.Double, scala.Double] = null,
    lowerLimit: scala.Int | scala.Double = null,
    maxForce: scala.Int | scala.Double = null,
    upperLimit: scala.Int | scala.Double = null,
    wakeUpBodies: js.UndefOr[scala.Boolean] = js.undefined
  ): PrismaticConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected)
    if (!js.isUndefined(disableRotationalLock)) __obj.updateDynamic("disableRotationalLock")(disableRotationalLock)
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA)
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB)
    if (localAxisA != null) __obj.updateDynamic("localAxisA")(localAxisA)
    if (lowerLimit != null) __obj.updateDynamic("lowerLimit")(lowerLimit.asInstanceOf[js.Any])
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (upperLimit != null) __obj.updateDynamic("upperLimit")(upperLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies)
    __obj.asInstanceOf[PrismaticConstraintOptions]
  }
}

