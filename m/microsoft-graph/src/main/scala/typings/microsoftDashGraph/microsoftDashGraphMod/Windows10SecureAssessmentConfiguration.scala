package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10SecureAssessmentConfiguration extends DeviceConfiguration {
  // Indicates whether or not to allow the app from printing during the test.
  var allowPrinting: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow screen capture capability during a test.
  var allowScreenCapture: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow text suggestions during the test.
  var allowTextSuggestion: js.UndefOr[Boolean] = js.undefined
  /**
    * The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user),
    * an AAD account (username@tenant.com) or a local account (username).
    */
  var configurationAccount: js.UndefOr[String] = js.undefined
  /**
    * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a
    * valid Url (http[s]://msdn.microsoft.com/).
    */
  var launchUri: js.UndefOr[String] = js.undefined
}

object Windows10SecureAssessmentConfiguration {
  @scala.inline
  def apply(
    allowPrinting: js.UndefOr[Boolean] = js.undefined,
    allowScreenCapture: js.UndefOr[Boolean] = js.undefined,
    allowTextSuggestion: js.UndefOr[Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    configurationAccount: String = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    launchUri: String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null
  ): Windows10SecureAssessmentConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPrinting)) __obj.updateDynamic("allowPrinting")(allowPrinting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowScreenCapture)) __obj.updateDynamic("allowScreenCapture")(allowScreenCapture.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTextSuggestion)) __obj.updateDynamic("allowTextSuggestion")(allowTextSuggestion.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (configurationAccount != null) __obj.updateDynamic("configurationAccount")(configurationAccount.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (launchUri != null) __obj.updateDynamic("launchUri")(launchUri.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows10SecureAssessmentConfiguration]
  }
}

