package typings.microsoftGraph.mod

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
    compliantDeviceCount: js.UndefOr[Double] = js.undefined,
    conflictDeviceCount: js.UndefOr[Double] = js.undefined,
    errorDeviceCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined,
    notApplicableDeviceCount: js.UndefOr[Double] = js.undefined,
    remediatedDeviceCount: js.UndefOr[Double] = js.undefined,
    unknownDeviceCount: js.UndefOr[Double] = js.undefined
  ): DeviceConfigurationDeviceStateSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compliantDeviceCount)) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conflictDeviceCount)) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorDeviceCount)) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(nonCompliantDeviceCount)) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notApplicableDeviceCount)) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remediatedDeviceCount)) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownDeviceCount)) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationDeviceStateSummary]
  }
}

