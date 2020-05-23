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
    pinExpirationInDays: js.UndefOr[Double] = js.undefined,
    pinLowercaseCharactersUsage: WindowsHelloForBusinessPinUsage = null,
    pinMaximumLength: js.UndefOr[Double] = js.undefined,
    pinMinimumLength: js.UndefOr[Double] = js.undefined,
    pinPreviousBlockCount: js.UndefOr[Double] = js.undefined,
    pinSpecialCharactersUsage: WindowsHelloForBusinessPinUsage = null,
    pinUppercaseCharactersUsage: WindowsHelloForBusinessPinUsage = null,
    priority: js.UndefOr[Double] = js.undefined,
    remotePassportEnabled: js.UndefOr[Boolean] = js.undefined,
    securityDeviceRequired: js.UndefOr[Boolean] = js.undefined,
    state: Enablement = null,
    unlockWithBiometricsEnabled: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): DeviceEnrollmentWindowsHelloForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enhancedBiometricsState != null) __obj.updateDynamic("enhancedBiometricsState")(enhancedBiometricsState.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(pinExpirationInDays)) __obj.updateDynamic("pinExpirationInDays")(pinExpirationInDays.get.asInstanceOf[js.Any])
    if (pinLowercaseCharactersUsage != null) __obj.updateDynamic("pinLowercaseCharactersUsage")(pinLowercaseCharactersUsage.asInstanceOf[js.Any])
    if (!js.isUndefined(pinMaximumLength)) __obj.updateDynamic("pinMaximumLength")(pinMaximumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinMinimumLength)) __obj.updateDynamic("pinMinimumLength")(pinMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinPreviousBlockCount)) __obj.updateDynamic("pinPreviousBlockCount")(pinPreviousBlockCount.get.asInstanceOf[js.Any])
    if (pinSpecialCharactersUsage != null) __obj.updateDynamic("pinSpecialCharactersUsage")(pinSpecialCharactersUsage.asInstanceOf[js.Any])
    if (pinUppercaseCharactersUsage != null) __obj.updateDynamic("pinUppercaseCharactersUsage")(pinUppercaseCharactersUsage.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remotePassportEnabled)) __obj.updateDynamic("remotePassportEnabled")(remotePassportEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(securityDeviceRequired)) __obj.updateDynamic("securityDeviceRequired")(securityDeviceRequired.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(unlockWithBiometricsEnabled)) __obj.updateDynamic("unlockWithBiometricsEnabled")(unlockWithBiometricsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEnrollmentWindowsHelloForBusinessConfiguration]
  }
}

