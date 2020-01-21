package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOperatingSystemSummary extends js.Object {
  // Number of android device count.
  var androidCount: js.UndefOr[Double] = js.undefined
  // Number of iOS device count.
  var iosCount: js.UndefOr[Double] = js.undefined
  // Number of Mac OS X device count.
  var macOSCount: js.UndefOr[Double] = js.undefined
  // Number of unknown device count.
  var unknownCount: js.UndefOr[Double] = js.undefined
  // Number of Windows device count.
  var windowsCount: js.UndefOr[Double] = js.undefined
  // Number of Windows mobile device count.
  var windowsMobileCount: js.UndefOr[Double] = js.undefined
}

object DeviceOperatingSystemSummary {
  @scala.inline
  def apply(
    androidCount: Int | Double = null,
    iosCount: Int | Double = null,
    macOSCount: Int | Double = null,
    unknownCount: Int | Double = null,
    windowsCount: Int | Double = null,
    windowsMobileCount: Int | Double = null
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

