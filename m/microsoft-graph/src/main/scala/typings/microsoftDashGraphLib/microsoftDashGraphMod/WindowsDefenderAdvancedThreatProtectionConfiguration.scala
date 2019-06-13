package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDefenderAdvancedThreatProtectionConfiguration extends DeviceConfiguration {
  /** Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule */
  var allowSampleSharing: js.UndefOr[scala.Boolean] = js.undefined
  /** Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency. */
  var enableExpeditedTelemetryReporting: js.UndefOr[scala.Boolean] = js.undefined
}

object WindowsDefenderAdvancedThreatProtectionConfiguration {
  @scala.inline
  def apply(
    allowSampleSharing: js.UndefOr[scala.Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: java.lang.String = null,
    enableExpeditedTelemetryReporting: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): WindowsDefenderAdvancedThreatProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSampleSharing)) __obj.updateDynamic("allowSampleSharing")(allowSampleSharing)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enableExpeditedTelemetryReporting)) __obj.updateDynamic("enableExpeditedTelemetryReporting")(enableExpeditedTelemetryReporting)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsDefenderAdvancedThreatProtectionConfiguration]
  }
}

