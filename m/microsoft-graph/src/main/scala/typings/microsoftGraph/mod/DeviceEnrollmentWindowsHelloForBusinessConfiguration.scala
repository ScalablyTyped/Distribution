package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEnrollmentWindowsHelloForBusinessConfiguration extends DeviceEnrollmentConfiguration {
  // Not yet documented. Possible values are: notConfigured, enabled, disabled.
  var enhancedBiometricsState: js.UndefOr[Enablement] = js.undefined
  // Not yet documented
  var pinExpirationInDays: js.UndefOr[Double] = js.undefined
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinLowercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  // Not yet documented
  var pinMaximumLength: js.UndefOr[Double] = js.undefined
  // Not yet documented
  var pinMinimumLength: js.UndefOr[Double] = js.undefined
  // Not yet documented
  var pinPreviousBlockCount: js.UndefOr[Double] = js.undefined
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinSpecialCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinUppercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  // Not yet documented
  var remotePassportEnabled: js.UndefOr[Boolean] = js.undefined
  // Not yet documented
  var securityDeviceRequired: js.UndefOr[Boolean] = js.undefined
  // Not yet documented. Possible values are: notConfigured, enabled, disabled.
  var state: js.UndefOr[Enablement] = js.undefined
  // Not yet documented
  var unlockWithBiometricsEnabled: js.UndefOr[Boolean] = js.undefined
}

object DeviceEnrollmentWindowsHelloForBusinessConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[EnrollmentConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    displayName: String = null,
    enhancedBiometricsState: Enablement = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    pinExpirationInDays: Int | Double = null,
    pinLowercaseCharactersUsage: WindowsHelloForBusinessPinUsage = null,
    pinMaximumLength: Int | Double = null,
    pinMinimumLength: Int | Double = null,
    pinPreviousBlockCount: Int | Double = null,
    pinSpecialCharactersUsage: WindowsHelloForBusinessPinUsage = null,
    pinUppercaseCharactersUsage: WindowsHelloForBusinessPinUsage = null,
    priority: Int | Double = null,
    remotePassportEnabled: js.UndefOr[Boolean] = js.undefined,
    securityDeviceRequired: js.UndefOr[Boolean] = js.undefined,
    state: Enablement = null,
    unlockWithBiometricsEnabled: js.UndefOr[Boolean] = js.undefined,
    version: Int | Double = null
  ): DeviceEnrollmentWindowsHelloForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enhancedBiometricsState != null) __obj.updateDynamic("enhancedBiometricsState")(enhancedBiometricsState.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (pinExpirationInDays != null) __obj.updateDynamic("pinExpirationInDays")(pinExpirationInDays.asInstanceOf[js.Any])
    if (pinLowercaseCharactersUsage != null) __obj.updateDynamic("pinLowercaseCharactersUsage")(pinLowercaseCharactersUsage.asInstanceOf[js.Any])
    if (pinMaximumLength != null) __obj.updateDynamic("pinMaximumLength")(pinMaximumLength.asInstanceOf[js.Any])
    if (pinMinimumLength != null) __obj.updateDynamic("pinMinimumLength")(pinMinimumLength.asInstanceOf[js.Any])
    if (pinPreviousBlockCount != null) __obj.updateDynamic("pinPreviousBlockCount")(pinPreviousBlockCount.asInstanceOf[js.Any])
    if (pinSpecialCharactersUsage != null) __obj.updateDynamic("pinSpecialCharactersUsage")(pinSpecialCharactersUsage.asInstanceOf[js.Any])
    if (pinUppercaseCharactersUsage != null) __obj.updateDynamic("pinUppercaseCharactersUsage")(pinUppercaseCharactersUsage.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(remotePassportEnabled)) __obj.updateDynamic("remotePassportEnabled")(remotePassportEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(securityDeviceRequired)) __obj.updateDynamic("securityDeviceRequired")(securityDeviceRequired.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(unlockWithBiometricsEnabled)) __obj.updateDynamic("unlockWithBiometricsEnabled")(unlockWithBiometricsEnabled.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEnrollmentWindowsHelloForBusinessConfiguration]
  }
}

