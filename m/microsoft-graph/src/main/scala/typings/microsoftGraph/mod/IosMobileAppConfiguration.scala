package typings.microsoftGraph.mod

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
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceStatusSummary != null) __obj.updateDynamic("deviceStatusSummary")(deviceStatusSummary.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (encodedSettingXml != null) __obj.updateDynamic("encodedSettingXml")(encodedSettingXml.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (targetedMobileApps != null) __obj.updateDynamic("targetedMobileApps")(targetedMobileApps.asInstanceOf[js.Any])
    if (userStatusSummary != null) __obj.updateDynamic("userStatusSummary")(userStatusSummary.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosMobileAppConfiguration]
  }
}

