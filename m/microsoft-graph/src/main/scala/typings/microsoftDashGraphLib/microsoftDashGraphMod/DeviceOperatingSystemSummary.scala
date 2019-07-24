package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOperatingSystemSummary extends js.Object {
  // Number of android device count.
  var androidCount: js.UndefOr[scala.Double] = js.undefined
  // Number of iOS device count.
  var iosCount: js.UndefOr[scala.Double] = js.undefined
  // Number of Mac OS X device count.
  var macOSCount: js.UndefOr[scala.Double] = js.undefined
  // Number of unknown device count.
  var unknownCount: js.UndefOr[scala.Double] = js.undefined
  // Number of Windows device count.
  var windowsCount: js.UndefOr[scala.Double] = js.undefined
  // Number of Windows mobile device count.
  var windowsMobileCount: js.UndefOr[scala.Double] = js.undefined
}

object DeviceOperatingSystemSummary {
  @scala.inline
  def apply(
    androidCount: scala.Int | scala.Double = null,
    iosCount: scala.Int | scala.Double = null,
    macOSCount: scala.Int | scala.Double = null,
    unknownCount: scala.Int | scala.Double = null,
    windowsCount: scala.Int | scala.Double = null,
    windowsMobileCount: scala.Int | scala.Double = null
  ): DeviceOperatingSystemSummary = {
    val __obj = js.Dynamic.literal()
    if (androidCount != null) __obj.updateDynamic("androidCount")(androidCount.asInstanceOf[js.Any])
    if (iosCount != null) __obj.updateDynamic("iosCount")(iosCount.asInstanceOf[js.Any])
    if (macOSCount != null) __obj.updateDynamic("macOSCount")(macOSCount.asInstanceOf[js.Any])
    if (unknownCount != null) __obj.updateDynamic("unknownCount")(unknownCount.asInstanceOf[js.Any])
    if (windowsCount != null) __obj.updateDynamic("windowsCount")(windowsCount.asInstanceOf[js.Any])
    if (windowsMobileCount != null) __obj.updateDynamic("windowsMobileCount")(windowsMobileCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOperatingSystemSummary]
  }
}

