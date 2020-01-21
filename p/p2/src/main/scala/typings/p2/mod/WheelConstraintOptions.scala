package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelConstraintOptions extends js.Object {
  var localForwardVector: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var localPosition: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var sideFriction: js.UndefOr[Double] = js.undefined
}

object WheelConstraintOptions {
  @scala.inline
  def apply(
    localForwardVector: js.Tuple2[Double, Double] = null,
    localPosition: js.Tuple2[Double, Double] = null,
    sideFriction: Int | Double = null
  ): WheelConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (localForwardVector != null) __obj.updateDynamic("localForwardVector")(localForwardVector.asInstanceOf[js.Any])
    if (localPosition != null) __obj.updateDynamic("localPosition")(localPosition.asInstanceOf[js.Any])
    if (sideFriction != null) __obj.updateDynamic("sideFriction")(sideFriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelConstraintOptions]
  }
}

