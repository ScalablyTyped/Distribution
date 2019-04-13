package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelConstraintOptions extends js.Object {
  var localForwardVector: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var localPosition: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var sideFriction: js.UndefOr[scala.Double] = js.undefined
}

object WheelConstraintOptions {
  @scala.inline
  def apply(
    localForwardVector: js.Tuple2[scala.Double, scala.Double] = null,
    localPosition: js.Tuple2[scala.Double, scala.Double] = null,
    sideFriction: scala.Int | scala.Double = null
  ): WheelConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (localForwardVector != null) __obj.updateDynamic("localForwardVector")(localForwardVector)
    if (localPosition != null) __obj.updateDynamic("localPosition")(localPosition)
    if (sideFriction != null) __obj.updateDynamic("sideFriction")(sideFriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelConstraintOptions]
  }
}

