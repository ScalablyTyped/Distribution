package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedDeviceMobileAppConfiguration extends Entity {
  // The list of group assignemenets for app configration.
  var assignments: js.UndefOr[js.Array[ManagedDeviceMobileAppConfigurationAssignment]] = js.undefined
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[String] = js.undefined
  // App configuration device status summary.
  var deviceStatusSummary: js.UndefOr[ManagedDeviceMobileAppConfigurationDeviceSummary] = js.undefined
  // List of ManagedDeviceMobileAppConfigurationDeviceStatus.
  var deviceStatuses: js.UndefOr[js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus]] = js.undefined
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.undefined
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // the associated app.
  var targetedMobileApps: js.UndefOr[js.Array[String]] = js.undefined
  // App configuration user status summary.
  var userStatusSummary: js.UndefOr[ManagedDeviceMobileAppConfigurationUserSummary] = js.undefined
  // List of ManagedDeviceMobileAppConfigurationUserStatus.
  var userStatuses: js.UndefOr[js.Array[ManagedDeviceMobileAppConfigurationUserStatus]] = js.undefined
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.undefined
}

object ManagedDeviceMobileAppConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[ManagedDeviceMobileAppConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceStatusSummary: ManagedDeviceMobileAppConfigurationDeviceSummary = null,
    deviceStatuses: js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus] = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    targetedMobileApps: js.Array[String] = null,
    userStatusSummary: ManagedDeviceMobileAppConfigurationUserSummary = null,
    userStatuses: js.Array[ManagedDeviceMobileAppConfigurationUserStatus] = null,
    version: Int | Double = null
  ): ManagedDeviceMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceStatusSummary != null) __obj.updateDynamic("deviceStatusSummary")(deviceStatusSummary)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (targetedMobileApps != null) __obj.updateDynamic("targetedMobileApps")(targetedMobileApps)
    if (userStatusSummary != null) __obj.updateDynamic("userStatusSummary")(userStatusSummary)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedDeviceMobileAppConfiguration]
  }
}

