package typings.microsoftGraph.mod

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
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceStatusSummary != null) __obj.updateDynamic("deviceStatusSummary")(deviceStatusSummary.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (targetedMobileApps != null) __obj.updateDynamic("targetedMobileApps")(targetedMobileApps.asInstanceOf[js.Any])
    if (userStatusSummary != null) __obj.updateDynamic("userStatusSummary")(userStatusSummary.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedDeviceMobileAppConfiguration]
  }
}

