package typings.ngDashCordova.ngCordova

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
    headingAccuracy: Int | Double = null,
    timestamp: Int | Double = null,
    trueHeading: Int | Double = null
  ): IDeviceOrientationHeading = {
    val __obj = js.Dynamic.literal(magneticHeading = magneticHeading)
    if (headingAccuracy != null) __obj.updateDynamic("headingAccuracy")(headingAccuracy.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (trueHeading != null) __obj.updateDynamic("trueHeading")(trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceOrientationHeading]
  }
}

