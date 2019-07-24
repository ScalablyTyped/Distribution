package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCompliancePolicySettingStateSummary extends Entity {
  // Number of compliant devices
  var compliantDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // Number of conflict devices
  var conflictDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // Not yet documented
  var deviceComplianceSettingStates: js.UndefOr[js.Array[DeviceComplianceSettingState]] = js.undefined
  // Number of error devices
  var errorDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // Number of NonCompliant devices
  var nonCompliantDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // Number of not applicable devices
  var notApplicableDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Setting platform. Possible values are: android, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater,
    * androidWorkProfile, all.
    */
  var platformType: js.UndefOr[PolicyPlatformType] = js.undefined
  // Number of remediated devices
  var remediatedDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // The setting class name and property name.
  var setting: js.UndefOr[java.lang.String] = js.undefined
  // Name of the setting.
  var settingName: js.UndefOr[java.lang.String] = js.undefined
  // Number of unknown devices
  var unknownDeviceCount: js.UndefOr[scala.Double] = js.undefined
}

object DeviceCompliancePolicySettingStateSummary {
  @scala.inline
  def apply(
    compliantDeviceCount: scala.Int | scala.Double = null,
    conflictDeviceCount: scala.Int | scala.Double = null,
    deviceComplianceSettingStates: js.Array[DeviceComplianceSettingState] = null,
    errorDeviceCount: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    nonCompliantDeviceCount: scala.Int | scala.Double = null,
    notApplicableDeviceCount: scala.Int | scala.Double = null,
    platformType: PolicyPlatformType = null,
    remediatedDeviceCount: scala.Int | scala.Double = null,
    setting: java.lang.String = null,
    settingName: java.lang.String = null,
    unknownDeviceCount: scala.Int | scala.Double = null
  ): DeviceCompliancePolicySettingStateSummary = {
    val __obj = js.Dynamic.literal()
    if (compliantDeviceCount != null) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.asInstanceOf[js.Any])
    if (conflictDeviceCount != null) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.asInstanceOf[js.Any])
    if (deviceComplianceSettingStates != null) __obj.updateDynamic("deviceComplianceSettingStates")(deviceComplianceSettingStates)
    if (errorDeviceCount != null) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (nonCompliantDeviceCount != null) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.asInstanceOf[js.Any])
    if (notApplicableDeviceCount != null) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType)
    if (remediatedDeviceCount != null) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.asInstanceOf[js.Any])
    if (setting != null) __obj.updateDynamic("setting")(setting)
    if (settingName != null) __obj.updateDynamic("settingName")(settingName)
    if (unknownDeviceCount != null) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCompliancePolicySettingStateSummary]
  }
}

