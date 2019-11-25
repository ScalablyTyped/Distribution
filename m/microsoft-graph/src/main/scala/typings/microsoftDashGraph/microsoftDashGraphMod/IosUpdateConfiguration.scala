package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosUpdateConfiguration extends DeviceConfiguration {
  // Active Hours End (active hours mean the time window when updates install should not happen)
  var activeHoursEnd: js.UndefOr[String] = js.undefined
  // Active Hours Start (active hours mean the time window when updates install should not happen)
  var activeHoursStart: js.UndefOr[String] = js.undefined
  // Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
  var scheduledInstallDays: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
  // UTC Time Offset indicated in minutes
  var utcTimeOffsetInMinutes: js.UndefOr[Double] = js.undefined
}

object IosUpdateConfiguration {
  @scala.inline
  def apply(
    activeHoursEnd: String = null,
    activeHoursStart: String = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    scheduledInstallDays: js.Array[DayOfWeek] = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    utcTimeOffsetInMinutes: Int | Double = null,
    version: Int | Double = null
  ): IosUpdateConfiguration = {
    val __obj = js.Dynamic.literal()
    if (activeHoursEnd != null) __obj.updateDynamic("activeHoursEnd")(activeHoursEnd.asInstanceOf[js.Any])
    if (activeHoursStart != null) __obj.updateDynamic("activeHoursStart")(activeHoursStart.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (scheduledInstallDays != null) __obj.updateDynamic("scheduledInstallDays")(scheduledInstallDays.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (utcTimeOffsetInMinutes != null) __obj.updateDynamic("utcTimeOffsetInMinutes")(utcTimeOffsetInMinutes.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosUpdateConfiguration]
  }
}

