package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceOrientationHeading extends js.Object {
  var headingAccuracy: js.UndefOr[Double] = js.undefined
  var magneticHeading: Double
  var timestamp: js.UndefOr[Double] = js.undefined
  var trueHeading: js.UndefOr[Double] = js.undefined
}

object IDeviceOrientationHeading {
  @scala.inline
  def apply(
    magneticHeading: Double,
    headingAccuracy: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined,
    trueHeading: js.UndefOr[Double] = js.undefined
  ): IDeviceOrientationHeading = {
    val __obj = js.Dynamic.literal(magneticHeading = magneticHeading.asInstanceOf[js.Any])
    if (!js.isUndefined(headingAccuracy)) __obj.updateDynamic("headingAccuracy")(headingAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trueHeading)) __obj.updateDynamic("trueHeading")(trueHeading.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceOrientationHeading]
  }
}

