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
    compliantDeviceCount: Int | Double = null,
    conflictDeviceCount: Int | Double = null,
    errorDeviceCount: Int | Double = null,
    id: String = null,
    instancePath: String = null,
    nonCompliantDeviceCount: Int | Double = null,
    notApplicableDeviceCount: Int | Double = null,
    remediatedDeviceCount: Int | Double = null,
    settingName: String = null,
    unknownDeviceCount: Int | Double = null
  ): SettingStateDeviceSummary = {
    val __obj = js.Dynamic.literal()
    if (compliantDeviceCount != null) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.asInstanceOf[js.Any])
    if (conflictDeviceCount != null) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.asInstanceOf[js.Any])
    if (errorDeviceCount != null) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instancePath != null) __obj.updateDynamic("instancePath")(instancePath.asInstanceOf[js.Any])
    if (nonCompliantDeviceCount != null) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.asInstanceOf[js.Any])
    if (notApplicableDeviceCount != null) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.asInstanceOf[js.Any])
    if (remediatedDeviceCount != null) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.asInstanceOf[js.Any])
    if (settingName != null) __obj.updateDynamic("settingName")(settingName.asInstanceOf[js.Any])
    if (unknownDeviceCount != null) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingStateDeviceSummary]
  }
}

