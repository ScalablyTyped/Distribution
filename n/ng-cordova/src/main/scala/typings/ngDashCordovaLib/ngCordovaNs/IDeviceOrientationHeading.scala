package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceOrientationHeading extends js.Object {
  var headingAccuracy: js.UndefOr[scala.Double] = js.undefined
  var magneticHeading: scala.Double
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var trueHeading: js.UndefOr[scala.Double] = js.undefined
}

object IDeviceOrientationHeading {
  @scala.inline
  def apply(
    magneticHeading: scala.Double,
    headingAccuracy: scala.Int | scala.Double = null,
    timestamp: scala.Int | scala.Double = null,
    trueHeading: scala.Int | scala.Double = null
  ): IDeviceOrientationHeading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("magneticHeading")(magneticHeading)
    if (headingAccuracy != null) __obj.updateDynamic("headingAccuracy")(headingAccuracy.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (trueHeading != null) __obj.updateDynamic("trueHeading")(trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceOrientationHeading]
  }
}

