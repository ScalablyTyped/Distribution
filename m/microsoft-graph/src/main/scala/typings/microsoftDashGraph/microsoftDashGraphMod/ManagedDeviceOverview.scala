package typings.microsoftDashGraph.microsoftDashGraphMod

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
    dualEnrolledDeviceCount: Int | Double = null,
    enrolledDeviceCount: Int | Double = null,
    id: String = null,
    mdmEnrolledCount: Int | Double = null
  ): ManagedDeviceOverview = {
    val __obj = js.Dynamic.literal()
    if (deviceExchangeAccessStateSummary != null) __obj.updateDynamic("deviceExchangeAccessStateSummary")(deviceExchangeAccessStateSummary)
    if (deviceOperatingSystemSummary != null) __obj.updateDynamic("deviceOperatingSystemSummary")(deviceOperatingSystemSummary)
    if (dualEnrolledDeviceCount != null) __obj.updateDynamic("dualEnrolledDeviceCount")(dualEnrolledDeviceCount.asInstanceOf[js.Any])
    if (enrolledDeviceCount != null) __obj.updateDynamic("enrolledDeviceCount")(enrolledDeviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (mdmEnrolledCount != null) __obj.updateDynamic("mdmEnrolledCount")(mdmEnrolledCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedDeviceOverview]
  }
}

