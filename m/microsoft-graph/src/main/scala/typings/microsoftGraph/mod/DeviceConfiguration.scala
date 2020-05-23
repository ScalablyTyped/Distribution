package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfiguration extends Entity {
  // The list of assignments for the device configuration profile.
  var assignments: js.UndefOr[js.Array[DeviceConfigurationAssignment]] = js.undefined
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[String] = js.undefined
  // Device Configuration Setting State Device Summary
  var deviceSettingStateSummaries: js.UndefOr[js.Array[SettingStateDeviceSummary]] = js.undefined
  // Device Configuration devices status overview
  var deviceStatusOverview: js.UndefOr[DeviceConfigurationDeviceOverview] = js.undefined
  // Device configuration installation status by device.
  var deviceStatuses: js.UndefOr[js.Array[DeviceConfigurationDeviceStatus]] = js.undefined
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.undefined
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // Device Configuration users status overview
  var userStatusOverview: js.UndefOr[DeviceConfigurationUserOverview] = js.undefined
  // Device configuration installation status by user.
  var userStatuses: js.UndefOr[js.Array[DeviceConfigurationUserStatus]] = js.undefined
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.undefined
}

object DeviceConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined
  ): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfiguration]
  }
}

