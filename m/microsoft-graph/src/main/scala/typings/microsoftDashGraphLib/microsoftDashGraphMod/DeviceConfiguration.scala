package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfiguration extends Entity {
  /** The list of assignments for the device configuration profile. */
  var assignments: js.UndefOr[js.Array[DeviceConfigurationAssignment]] = js.undefined
  /** DateTime the object was created. */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Admin provided description of the Device Configuration. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Device Configuration Setting State Device Summary */
  var deviceSettingStateSummaries: js.UndefOr[js.Array[SettingStateDeviceSummary]] = js.undefined
  /** Device Configuration devices status overview */
  var deviceStatusOverview: js.UndefOr[DeviceConfigurationDeviceOverview] = js.undefined
  /** Device configuration installation status by device. */
  var deviceStatuses: js.UndefOr[js.Array[DeviceConfigurationDeviceStatus]] = js.undefined
  /** Admin provided name of the device configuration. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** DateTime the object was last modified. */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Device Configuration users status overview */
  var userStatusOverview: js.UndefOr[DeviceConfigurationUserOverview] = js.undefined
  /** Device configuration installation status by user. */
  var userStatuses: js.UndefOr[js.Array[DeviceConfigurationUserStatus]] = js.undefined
  /** Version of the device configuration. */
  var version: js.UndefOr[scala.Double] = js.undefined
}

object DeviceConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfiguration]
  }
}

