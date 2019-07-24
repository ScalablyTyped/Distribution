package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosUpdateConfiguration extends DeviceConfiguration {
  // Active Hours End (active hours mean the time window when updates install should not happen)
  var activeHoursEnd: js.UndefOr[java.lang.String] = js.undefined
  // Active Hours Start (active hours mean the time window when updates install should not happen)
  var activeHoursStart: js.UndefOr[java.lang.String] = js.undefined
  // Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
  var scheduledInstallDays: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
  // UTC Time Offset indicated in minutes
  var utcTimeOffsetInMinutes: js.UndefOr[scala.Double] = js.undefined
}

object IosUpdateConfiguration {
  @scala.inline
  def apply(
    activeHoursEnd: java.lang.String = null,
    activeHoursStart: java.lang.String = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    scheduledInstallDays: js.Array[DayOfWeek] = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    utcTimeOffsetInMinutes: scala.Int | scala.Double = null,
    version: scala.Int | scala.Double = null
  ): IosUpdateConfiguration = {
    val __obj = js.Dynamic.literal()
    if (activeHoursEnd != null) __obj.updateDynamic("activeHoursEnd")(activeHoursEnd)
    if (activeHoursStart != null) __obj.updateDynamic("activeHoursStart")(activeHoursStart)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (scheduledInstallDays != null) __obj.updateDynamic("scheduledInstallDays")(scheduledInstallDays)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (utcTimeOffsetInMinutes != null) __obj.updateDynamic("utcTimeOffsetInMinutes")(utcTimeOffsetInMinutes.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosUpdateConfiguration]
  }
}

