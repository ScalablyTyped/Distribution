package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection .
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.native
  // Indicates whether or not to require a managed email profile.
  var managedEmailProfileRequired: js.UndefOr[Boolean] = js.native
  // Maximum IOS version.
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Minimum IOS version.
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Indicates whether or not to block simple passcodes.
  var passcodeBlockSimple: js.UndefOr[Boolean] = js.native
  // Number of days before the passcode expires. Valid values 1 to 65535
  var passcodeExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passcodeMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[Double] = js.native
  // Indicates whether or not to require a passcode.
  var passcodeRequired: js.UndefOr[Boolean] = js.native
  // The required passcode type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Devices must not be jailbroken or rooted.
  var securityBlockJailbrokenDevices: js.UndefOr[Boolean] = js.native
}

object IosCompliancePolicy {
  @scala.inline
  def apply(): IosCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosCompliancePolicy]
  }
  @scala.inline
  implicit class IosCompliancePolicyOps[Self <: IosCompliancePolicy] (val x: Self) extends AnyVal {
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
    def setDeviceThreatProtectionEnabled(value: Boolean): Self = this.set("deviceThreatProtectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceThreatProtectionEnabled: Self = this.set("deviceThreatProtectionEnabled", js.undefined)
    @scala.inline
    def setDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = this.set("deviceThreatProtectionRequiredSecurityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceThreatProtectionRequiredSecurityLevel: Self = this.set("deviceThreatProtectionRequiredSecurityLevel", js.undefined)
    @scala.inline
    def setManagedEmailProfileRequired(value: Boolean): Self = this.set("managedEmailProfileRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedEmailProfileRequired: Self = this.set("managedEmailProfileRequired", js.undefined)
    @scala.inline
    def setOsMaximumVersion(value: String): Self = this.set("osMaximumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsMaximumVersion: Self = this.set("osMaximumVersion", js.undefined)
    @scala.inline
    def setOsMinimumVersion(value: String): Self = this.set("osMinimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsMinimumVersion: Self = this.set("osMinimumVersion", js.undefined)
    @scala.inline
    def setPasscodeBlockSimple(value: Boolean): Self = this.set("passcodeBlockSimple", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeBlockSimple: Self = this.set("passcodeBlockSimple", js.undefined)
    @scala.inline
    def setPasscodeExpirationDays(value: Double): Self = this.set("passcodeExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeExpirationDays: Self = this.set("passcodeExpirationDays", js.undefined)
    @scala.inline
    def setPasscodeMinimumCharacterSetCount(value: Double): Self = this.set("passcodeMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeMinimumCharacterSetCount: Self = this.set("passcodeMinimumCharacterSetCount", js.undefined)
    @scala.inline
    def setPasscodeMinimumLength(value: Double): Self = this.set("passcodeMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeMinimumLength: Self = this.set("passcodeMinimumLength", js.undefined)
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeLock(value: Double): Self = this.set("passcodeMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeMinutesOfInactivityBeforeLock: Self = this.set("passcodeMinutesOfInactivityBeforeLock", js.undefined)
    @scala.inline
    def setPasscodePreviousPasscodeBlockCount(value: Double): Self = this.set("passcodePreviousPasscodeBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodePreviousPasscodeBlockCount: Self = this.set("passcodePreviousPasscodeBlockCount", js.undefined)
    @scala.inline
    def setPasscodeRequired(value: Boolean): Self = this.set("passcodeRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeRequired: Self = this.set("passcodeRequired", js.undefined)
    @scala.inline
    def setPasscodeRequiredType(value: RequiredPasswordType): Self = this.set("passcodeRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeRequiredType: Self = this.set("passcodeRequiredType", js.undefined)
    @scala.inline
    def setSecurityBlockJailbrokenDevices(value: Boolean): Self = this.set("securityBlockJailbrokenDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityBlockJailbrokenDevices: Self = this.set("securityBlockJailbrokenDevices", js.undefined)
  }
  
}

