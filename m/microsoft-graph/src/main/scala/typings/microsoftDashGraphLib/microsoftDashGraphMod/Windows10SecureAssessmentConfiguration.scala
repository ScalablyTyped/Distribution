package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10SecureAssessmentConfiguration extends DeviceConfiguration {
  // Indicates whether or not to allow the app from printing during the test.
  var allowPrinting: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to allow screen capture capability during a test.
  var allowScreenCapture: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to allow text suggestions during the test.
  var allowTextSuggestion: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user),
    * an AAD account (username@tenant.com) or a local account (username).
    */
  var configurationAccount: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a
    * valid Url (http[s]://msdn.microsoft.com/).
    */
  var launchUri: js.UndefOr[java.lang.String] = js.undefined
}

object Windows10SecureAssessmentConfiguration {
  @scala.inline
  def apply(
    allowPrinting: js.UndefOr[scala.Boolean] = js.undefined,
    allowScreenCapture: js.UndefOr[scala.Boolean] = js.undefined,
    allowTextSuggestion: js.UndefOr[scala.Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    configurationAccount: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    launchUri: java.lang.String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): Windows10SecureAssessmentConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPrinting)) __obj.updateDynamic("allowPrinting")(allowPrinting)
    if (!js.isUndefined(allowScreenCapture)) __obj.updateDynamic("allowScreenCapture")(allowScreenCapture)
    if (!js.isUndefined(allowTextSuggestion)) __obj.updateDynamic("allowTextSuggestion")(allowTextSuggestion)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (configurationAccount != null) __obj.updateDynamic("configurationAccount")(configurationAccount)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (launchUri != null) __obj.updateDynamic("launchUri")(launchUri)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows10SecureAssessmentConfiguration]
  }
}

