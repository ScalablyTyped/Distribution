package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosMobileAppConfiguration extends ManagedDeviceMobileAppConfiguration {
  // mdm app configuration Base64 binary.
  var encodedSettingXml: js.UndefOr[Double] = js.undefined
  // app configuration setting items.
  var settings: js.UndefOr[js.Array[AppConfigurationSettingItem]] = js.undefined
}

object IosMobileAppConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[ManagedDeviceMobileAppConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceStatusSummary: ManagedDeviceMobileAppConfigurationDeviceSummary = null,
    deviceStatuses: js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus] = null,
    displayName: String = null,
    encodedSettingXml: Int | Double = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    settings: js.Array[AppConfigurationSettingItem] = null,
    targetedMobileApps: js.Array[String] = null,
    userStatusSummary: ManagedDeviceMobileAppConfigurationUserSummary = null,
    userStatuses: js.Array[ManagedDeviceMobileAppConfigurationUserStatus] = null,
    version: Int | Double = null
  ): IosMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceStatusSummary != null) __obj.updateDynamic("deviceStatusSummary")(deviceStatusSummary)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (encodedSettingXml != null) __obj.updateDynamic("encodedSettingXml")(encodedSettingXml.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (targetedMobileApps != null) __obj.updateDynamic("targetedMobileApps")(targetedMobileApps)
    if (userStatusSummary != null) __obj.updateDynamic("userStatusSummary")(userStatusSummary)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosMobileAppConfiguration]
  }
}

