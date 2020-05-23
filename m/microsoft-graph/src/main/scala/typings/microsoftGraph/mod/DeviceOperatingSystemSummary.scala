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
    androidCount: js.UndefOr[Double] = js.undefined,
    iosCount: js.UndefOr[Double] = js.undefined,
    macOSCount: js.UndefOr[Double] = js.undefined,
    unknownCount: js.UndefOr[Double] = js.undefined,
    windowsCount: js.UndefOr[Double] = js.undefined,
    windowsMobileCount: js.UndefOr[Double] = js.undefined
  ): DeviceOperatingSystemSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(androidCount)) __obj.updateDynamic("androidCount")(androidCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iosCount)) __obj.updateDynamic("iosCount")(iosCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(macOSCount)) __obj.updateDynamic("macOSCount")(macOSCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownCount)) __obj.updateDynamic("unknownCount")(unknownCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsCount)) __obj.updateDynamic("windowsCount")(windowsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsMobileCount)) __obj.updateDynamic("windowsMobileCount")(windowsMobileCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOperatingSystemSummary]
  }
}

