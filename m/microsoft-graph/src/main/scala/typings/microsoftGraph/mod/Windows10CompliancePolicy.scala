package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10CompliancePolicy extends DeviceCompliancePolicy {
  // Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
  var bitLockerEnabled: js.UndefOr[Boolean] = js.native
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var codeIntegrityEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is
    * enabled.
    */
  var earlyLaunchAntiMalwareDriverEnabled: js.UndefOr[Boolean] = js.native
  // Maximum Windows Phone version.
  var mobileOsMaximumVersion: js.UndefOr[String] = js.native
  // Minimum Windows Phone version.
  var mobileOsMinimumVersion: js.UndefOr[String] = js.native
  // Maximum Windows 10 version.
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Minimum Windows 10 version.
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Indicates whether or not to block simple password.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  // The password expiration in days.
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // The number of previous passwords to prevent re-use of.
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Require a password to unlock Windows device.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  // Require a password to unlock an idle device.
  var passwordRequiredToUnlockFromIdle: js.UndefOr[Boolean] = js.native
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var requireHealthyDeviceReport: js.UndefOr[Boolean] = js.native
  // Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
  var secureBootEnabled: js.UndefOr[Boolean] = js.native
  // Require encryption on windows devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
}

object Windows10CompliancePolicy {
  @scala.inline
  def apply(): Windows10CompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10CompliancePolicy]
  }
  @scala.inline
  implicit class Windows10CompliancePolicyOps[Self <: Windows10CompliancePolicy] (val x: Self) extends AnyVal {
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
    def setBitLockerEnabled(value: Boolean): Self = this.set("bitLockerEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitLockerEnabled: Self = this.set("bitLockerEnabled", js.undefined)
    @scala.inline
    def setCodeIntegrityEnabled(value: Boolean): Self = this.set("codeIntegrityEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeIntegrityEnabled: Self = this.set("codeIntegrityEnabled", js.undefined)
    @scala.inline
    def setEarlyLaunchAntiMalwareDriverEnabled(value: Boolean): Self = this.set("earlyLaunchAntiMalwareDriverEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEarlyLaunchAntiMalwareDriverEnabled: Self = this.set("earlyLaunchAntiMalwareDriverEnabled", js.undefined)
    @scala.inline
    def setMobileOsMaximumVersion(value: String): Self = this.set("mobileOsMaximumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileOsMaximumVersion: Self = this.set("mobileOsMaximumVersion", js.undefined)
    @scala.inline
    def setMobileOsMinimumVersion(value: String): Self = this.set("mobileOsMinimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileOsMinimumVersion: Self = this.set("mobileOsMinimumVersion", js.undefined)
    @scala.inline
    def setOsMaximumVersion(value: String): Self = this.set("osMaximumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsMaximumVersion: Self = this.set("osMaximumVersion", js.undefined)
    @scala.inline
    def setOsMinimumVersion(value: String): Self = this.set("osMinimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsMinimumVersion: Self = this.set("osMinimumVersion", js.undefined)
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = this.set("passwordBlockSimple", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordBlockSimple: Self = this.set("passwordBlockSimple", js.undefined)
    @scala.inline
    def setPasswordExpirationDays(value: Double): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: Double): Self = this.set("passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumCharacterSetCount: Self = this.set("passwordMinimumCharacterSetCount", js.undefined)
    @scala.inline
    def setPasswordMinimumLength(value: Double): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLock(value: Double): Self = this.set("passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeLock: Self = this.set("passwordMinutesOfInactivityBeforeLock", js.undefined)
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: Double): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = this.set("passwordRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequired: Self = this.set("passwordRequired", js.undefined)
    @scala.inline
    def setPasswordRequiredToUnlockFromIdle(value: Boolean): Self = this.set("passwordRequiredToUnlockFromIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequiredToUnlockFromIdle: Self = this.set("passwordRequiredToUnlockFromIdle", js.undefined)
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    @scala.inline
    def setRequireHealthyDeviceReport(value: Boolean): Self = this.set("requireHealthyDeviceReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireHealthyDeviceReport: Self = this.set("requireHealthyDeviceReport", js.undefined)
    @scala.inline
    def setSecureBootEnabled(value: Boolean): Self = this.set("secureBootEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureBootEnabled: Self = this.set("secureBootEnabled", js.undefined)
    @scala.inline
    def setStorageRequireEncryption(value: Boolean): Self = this.set("storageRequireEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageRequireEncryption: Self = this.set("storageRequireEncryption", js.undefined)
  }
  
}

