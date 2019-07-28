package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationDeviceStateSummary extends Entity {
  // Number of compliant devices
  var compliantDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of conflict devices
  var conflictDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of error devices
  var errorDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of NonCompliant devices
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of not applicable devices
  var notApplicableDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of remediated devices
  var remediatedDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of unknown devices
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
}

object DeviceConfigurationDeviceStateSummary {
  @scala.inline
  def apply(
    compliantDeviceCount: Int | Double = null,
    conflictDeviceCount: Int | Double = null,
    errorDeviceCount: Int | Double = null,
    id: String = null,
    nonCompliantDeviceCount: Int | Double = null,
    notApplicableDeviceCount: Int | Double = null,
    remediatedDeviceCount: Int | Double = null,
    unknownDeviceCount: Int | Double = null
  ): DeviceConfigurationDeviceStateSummary = {
    val __obj = js.Dynamic.literal()
    if (compliantDeviceCount != null) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.asInstanceOf[js.Any])
    if (conflictDeviceCount != null) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.asInstanceOf[js.Any])
    if (errorDeviceCount != null) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (nonCompliantDeviceCount != null) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.asInstanceOf[js.Any])
    if (notApplicableDeviceCount != null) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.asInstanceOf[js.Any])
    if (remediatedDeviceCount != null) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.asInstanceOf[js.Any])
    if (unknownDeviceCount != null) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationDeviceStateSummary]
  }
}

