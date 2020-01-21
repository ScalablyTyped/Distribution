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
    compliantDeviceCount: Int | Double = null,
    conflictDeviceCount: Int | Double = null,
    deviceComplianceSettingStates: js.Array[DeviceComplianceSettingState] = null,
    errorDeviceCount: Int | Double = null,
    id: String = null,
    nonCompliantDeviceCount: Int | Double = null,
    notApplicableDeviceCount: Int | Double = null,
    platformType: PolicyPlatformType = null,
    remediatedDeviceCount: Int | Double = null,
    setting: String = null,
    settingName: String = null,
    unknownDeviceCount: Int | Double = null
  ): DeviceCompliancePolicySettingStateSummary = {
    val __obj = js.Dynamic.literal()
    if (compliantDeviceCount != null) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.asInstanceOf[js.Any])
    if (conflictDeviceCount != null) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.asInstanceOf[js.Any])
    if (deviceComplianceSettingStates != null) __obj.updateDynamic("deviceComplianceSettingStates")(deviceComplianceSettingStates.asInstanceOf[js.Any])
    if (errorDeviceCount != null) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (nonCompliantDeviceCount != null) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.asInstanceOf[js.Any])
    if (notApplicableDeviceCount != null) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (remediatedDeviceCount != null) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.asInstanceOf[js.Any])
    if (setting != null) __obj.updateDynamic("setting")(setting.asInstanceOf[js.Any])
    if (settingName != null) __obj.updateDynamic("settingName")(settingName.asInstanceOf[js.Any])
    if (unknownDeviceCount != null) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCompliancePolicySettingStateSummary]
  }
}

