package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassHeading extends js.Object {
  var headingAccuracy: js.UndefOr[Double] = js.undefined
  var magneticHeading: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var trueHeading: js.UndefOr[Double] = js.undefined
}

object CompassHeading {
  @scala.inline
  def apply(
    headingAccuracy: js.UndefOr[Double] = js.undefined,
    magneticHeading: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined,
    trueHeading: js.UndefOr[Double] = js.undefined
  ): CompassHeading = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headingAccuracy)) __obj.updateDynamic("headingAccuracy")(headingAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magneticHeading)) __obj.updateDynamic("magneticHeading")(magneticHeading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trueHeading)) __obj.updateDynamic("trueHeading")(trueHeading.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassHeading]
  }
}

