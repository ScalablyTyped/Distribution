package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCompliancePolicySettingStateSummary extends Entity {
  // Number of compliant devices
  var compliantDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of conflict devices
  var conflictDeviceCount: js.UndefOr[Double] = js.undefined
  // Not yet documented
  var deviceComplianceSettingStates: js.UndefOr[js.Array[DeviceComplianceSettingState]] = js.undefined
  // Number of error devices
  var errorDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of NonCompliant devices
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of not applicable devices
  var notApplicableDeviceCount: js.UndefOr[Double] = js.undefined
  /**
    * Setting platform. Possible values are: android, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater,
    * androidWorkProfile, all.
    */
  var platformType: js.UndefOr[PolicyPlatformType] = js.undefined
  // Number of remediated devices
  var remediatedDeviceCount: js.UndefOr[Double] = js.undefined
  // The setting class name and property name.
  var setting: js.UndefOr[String] = js.undefined
  // Name of the setting.
  var settingName: js.UndefOr[String] = js.undefined
  // Number of unknown devices
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
}

object DeviceCompliancePolicySettingStateSummary {
  @scala.inline
  def apply(
    compliantDeviceCount: js.UndefOr[Double] = js.undefined,
    conflictDeviceCount: js.UndefOr[Double] = js.undefined,
    deviceComplianceSettingStates: js.Array[DeviceComplianceSettingState] = null,
    errorDeviceCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined,
    notApplicableDeviceCount: js.UndefOr[Double] = js.undefined,
    platformType: PolicyPlatformType = null,
    remediatedDeviceCount: js.UndefOr[Double] = js.undefined,
    setting: String = null,
    settingName: String = null,
    unknownDeviceCount: js.UndefOr[Double] = js.undefined
  ): DeviceCompliancePolicySettingStateSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compliantDeviceCount)) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conflictDeviceCount)) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.get.asInstanceOf[js.Any])
    if (deviceComplianceSettingStates != null) __obj.updateDynamic("deviceComplianceSettingStates")(deviceComplianceSettingStates.asInstanceOf[js.Any])
    if (!js.isUndefined(errorDeviceCount)) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(nonCompliantDeviceCount)) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notApplicableDeviceCount)) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.get.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (!js.isUndefined(remediatedDeviceCount)) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.get.asInstanceOf[js.Any])
    if (setting != null) __obj.updateDynamic("setting")(setting.asInstanceOf[js.Any])
    if (settingName != null) __obj.updateDynamic("settingName")(settingName.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownDeviceCount)) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCompliancePolicySettingStateSummary]
  }
}

