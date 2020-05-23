package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingStateDeviceSummary extends Entity {
  // Device Compliant count for the setting
  var compliantDeviceCount: js.UndefOr[Double] = js.undefined
  // Device conflict error count for the setting
  var conflictDeviceCount: js.UndefOr[Double] = js.undefined
  // Device error count for the setting
  var errorDeviceCount: js.UndefOr[Double] = js.undefined
  // Name of the InstancePath for the setting
  var instancePath: js.UndefOr[String] = js.undefined
  // Device NonCompliant count for the setting
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined
  // Device Not Applicable count for the setting
  var notApplicableDeviceCount: js.UndefOr[Double] = js.undefined
  // Device Compliant count for the setting
  var remediatedDeviceCount: js.UndefOr[Double] = js.undefined
  // Name of the setting
  var settingName: js.UndefOr[String] = js.undefined
  // Device Unkown count for the setting
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
}

object SettingStateDeviceSummary {
  @scala.inline
  def apply(
    compliantDeviceCount: js.UndefOr[Double] = js.undefined,
    conflictDeviceCount: js.UndefOr[Double] = js.undefined,
    errorDeviceCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    instancePath: String = null,
    nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined,
    notApplicableDeviceCount: js.UndefOr[Double] = js.undefined,
    remediatedDeviceCount: js.UndefOr[Double] = js.undefined,
    settingName: String = null,
    unknownDeviceCount: js.UndefOr[Double] = js.undefined
  ): SettingStateDeviceSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compliantDeviceCount)) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conflictDeviceCount)) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorDeviceCount)) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instancePath != null) __obj.updateDynamic("instancePath")(instancePath.asInstanceOf[js.Any])
    if (!js.isUndefined(nonCompliantDeviceCount)) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notApplicableDeviceCount)) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remediatedDeviceCount)) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.get.asInstanceOf[js.Any])
    if (settingName != null) __obj.updateDynamic("settingName")(settingName.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownDeviceCount)) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingStateDeviceSummary]
  }
}

