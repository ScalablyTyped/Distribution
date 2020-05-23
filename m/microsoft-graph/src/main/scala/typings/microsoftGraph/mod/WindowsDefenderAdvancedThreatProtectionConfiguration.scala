package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDefenderAdvancedThreatProtectionConfiguration extends DeviceConfiguration {
  // Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
  var allowSampleSharing: js.UndefOr[Boolean] = js.undefined
  // Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
  var enableExpeditedTelemetryReporting: js.UndefOr[Boolean] = js.undefined
}

object WindowsDefenderAdvancedThreatProtectionConfiguration {
  @scala.inline
  def apply(
    allowSampleSharing: js.UndefOr[Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    enableExpeditedTelemetryReporting: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastModifiedDateTime: String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined
  ): WindowsDefenderAdvancedThreatProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSampleSharing)) __obj.updateDynamic("allowSampleSharing")(allowSampleSharing.get.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableExpeditedTelemetryReporting)) __obj.updateDynamic("enableExpeditedTelemetryReporting")(enableExpeditedTelemetryReporting.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsDefenderAdvancedThreatProtectionConfiguration]
  }
}

