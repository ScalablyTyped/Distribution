package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsPhone81CustomConfiguration extends DeviceConfiguration {
  // OMA settings. This collection can contain a maximum of 1000 elements.
  var omaSettings: js.UndefOr[js.Array[OmaSetting]] = js.undefined
}

object WindowsPhone81CustomConfiguration {
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
    omaSettings: js.Array[OmaSetting] = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null
  ): WindowsPhone81CustomConfiguration = {
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
    if (omaSettings != null) __obj.updateDynamic("omaSettings")(omaSettings)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsPhone81CustomConfiguration]
  }
}

