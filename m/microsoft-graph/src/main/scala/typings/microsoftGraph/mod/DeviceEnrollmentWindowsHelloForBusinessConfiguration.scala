package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEnrollmentWindowsHelloForBusinessConfiguration extends DeviceEnrollmentConfiguration {
  // Not yet documented. Possible values are: notConfigured, enabled, disabled.
  var enhancedBiometricsState: js.UndefOr[Enablement] = js.native
  // Not yet documented
  var pinExpirationInDays: js.UndefOr[Double] = js.native
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinLowercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.native
  // Not yet documented
  var pinMaximumLength: js.UndefOr[Double] = js.native
  // Not yet documented
  var pinMinimumLength: js.UndefOr[Double] = js.native
  // Not yet documented
  var pinPreviousBlockCount: js.UndefOr[Double] = js.native
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinSpecialCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.native
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinUppercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.native
  // Not yet documented
  var remotePassportEnabled: js.UndefOr[Boolean] = js.native
  // Not yet documented
  var securityDeviceRequired: js.UndefOr[Boolean] = js.native
  // Not yet documented. Possible values are: notConfigured, enabled, disabled.
  var state: js.UndefOr[Enablement] = js.native
  // Not yet documented
  var unlockWithBiometricsEnabled: js.UndefOr[Boolean] = js.native
}

object DeviceEnrollmentWindowsHelloForBusinessConfiguration {
  @scala.inline
  def apply(): DeviceEnrollmentWindowsHelloForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentWindowsHelloForBusinessConfiguration]
  }
  @scala.inline
  implicit class DeviceEnrollmentWindowsHelloForBusinessConfigurationOps[Self <: DeviceEnrollmentWindowsHelloForBusinessConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnhancedBiometricsState(value: Enablement): Self = this.set("enhancedBiometricsState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedBiometricsState: Self = this.set("enhancedBiometricsState", js.undefined)
    @scala.inline
    def setPinExpirationInDays(value: Double): Self = this.set("pinExpirationInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinExpirationInDays: Self = this.set("pinExpirationInDays", js.undefined)
    @scala.inline
    def setPinLowercaseCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = this.set("pinLowercaseCharactersUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinLowercaseCharactersUsage: Self = this.set("pinLowercaseCharactersUsage", js.undefined)
    @scala.inline
    def setPinMaximumLength(value: Double): Self = this.set("pinMaximumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinMaximumLength: Self = this.set("pinMaximumLength", js.undefined)
    @scala.inline
    def setPinMinimumLength(value: Double): Self = this.set("pinMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinMinimumLength: Self = this.set("pinMinimumLength", js.undefined)
    @scala.inline
    def setPinPreviousBlockCount(value: Double): Self = this.set("pinPreviousBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinPreviousBlockCount: Self = this.set("pinPreviousBlockCount", js.undefined)
    @scala.inline
    def setPinSpecialCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = this.set("pinSpecialCharactersUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinSpecialCharactersUsage: Self = this.set("pinSpecialCharactersUsage", js.undefined)
    @scala.inline
    def setPinUppercaseCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = this.set("pinUppercaseCharactersUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinUppercaseCharactersUsage: Self = this.set("pinUppercaseCharactersUsage", js.undefined)
    @scala.inline
    def setRemotePassportEnabled(value: Boolean): Self = this.set("remotePassportEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemotePassportEnabled: Self = this.set("remotePassportEnabled", js.undefined)
    @scala.inline
    def setSecurityDeviceRequired(value: Boolean): Self = this.set("securityDeviceRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityDeviceRequired: Self = this.set("securityDeviceRequired", js.undefined)
    @scala.inline
    def setState(value: Enablement): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUnlockWithBiometricsEnabled(value: Boolean): Self = this.set("unlockWithBiometricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlockWithBiometricsEnabled: Self = this.set("unlockWithBiometricsEnabled", js.undefined)
  }
  
}

