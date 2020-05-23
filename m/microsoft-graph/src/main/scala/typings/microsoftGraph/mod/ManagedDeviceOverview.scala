package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedDeviceOverview extends Entity {
  // Distribution of Exchange Access State in Intune
  var deviceExchangeAccessStateSummary: js.UndefOr[DeviceExchangeAccessStateSummary] = js.undefined
  // Device operating system summary.
  var deviceOperatingSystemSummary: js.UndefOr[DeviceOperatingSystemSummary] = js.undefined
  // The number of devices enrolled in both MDM and EAS
  var dualEnrolledDeviceCount: js.UndefOr[Double] = js.undefined
  // Total enrolled device count. Does not include PC devices managed via Intune PC Agent
  var enrolledDeviceCount: js.UndefOr[Double] = js.undefined
  // The number of devices enrolled in MDM
  var mdmEnrolledCount: js.UndefOr[Double] = js.undefined
}

object ManagedDeviceOverview {
  @scala.inline
  def apply(
    deviceExchangeAccessStateSummary: DeviceExchangeAccessStateSummary = null,
    deviceOperatingSystemSummary: DeviceOperatingSystemSummary = null,
    dualEnrolledDeviceCount: js.UndefOr[Double] = js.undefined,
    enrolledDeviceCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    mdmEnrolledCount: js.UndefOr[Double] = js.undefined
  ): ManagedDeviceOverview = {
    val __obj = js.Dynamic.literal()
    if (deviceExchangeAccessStateSummary != null) __obj.updateDynamic("deviceExchangeAccessStateSummary")(deviceExchangeAccessStateSummary.asInstanceOf[js.Any])
    if (deviceOperatingSystemSummary != null) __obj.updateDynamic("deviceOperatingSystemSummary")(deviceOperatingSystemSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(dualEnrolledDeviceCount)) __obj.updateDynamic("dualEnrolledDeviceCount")(dualEnrolledDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enrolledDeviceCount)) __obj.updateDynamic("enrolledDeviceCount")(enrolledDeviceCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(mdmEnrolledCount)) __obj.updateDynamic("mdmEnrolledCount")(mdmEnrolledCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedDeviceOverview]
  }
}

