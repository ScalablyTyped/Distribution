package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacOSCustomConfiguration extends DeviceConfiguration {
  // Payload. (UTF8 encoded byte array)
  var payload: js.UndefOr[Double] = js.undefined
  // Payload file name (.mobileconfig
  var payloadFileName: js.UndefOr[String] = js.undefined
  // Name that is displayed to the user.
  var payloadName: js.UndefOr[String] = js.undefined
}

object MacOSCustomConfiguration {
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
    payload: Int | Double = null,
    payloadFileName: String = null,
    payloadName: String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null
  ): MacOSCustomConfiguration = {
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
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (payloadFileName != null) __obj.updateDynamic("payloadFileName")(payloadFileName)
    if (payloadName != null) __obj.updateDynamic("payloadName")(payloadName)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSCustomConfiguration]
  }
}

