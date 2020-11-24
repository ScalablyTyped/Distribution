package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows10MobileCompliancePolicy extends DeviceCompliancePolicy {
  
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
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Minimum Windows Phone version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether or not to block syncing the calendar.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  
  // Number of days before password expiration. Valid values 1 to 255
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of previous passwords to prevent re-use of.
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Require a password to unlock an idle device.
  var passwordRequireToUnlockFromIdle: js.UndefOr[Boolean] = js.native
  
  // Require a password to unlock Windows Phone device.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  
  // Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
  var secureBootEnabled: js.UndefOr[Boolean] = js.native
  
  // Require encryption on windows devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
}
object Windows10MobileCompliancePolicy {
  
  @scala.inline
  def apply(): Windows10MobileCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10MobileCompliancePolicy]
  }
  
  @scala.inline
  implicit class Windows10MobileCompliancePolicyOps[Self <: Windows10MobileCompliancePolicy] (val x: Self) extends AnyVal {
    
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
    def setOsMaximumVersion(value: NullableOption[String]): Self = this.set("osMaximumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsMaximumVersion: Self = this.set("osMaximumVersion", js.undefined)
    
    @scala.inline
    def setOsMaximumVersionNull: Self = this.set("osMaximumVersion", null)
    
    @scala.inline
    def setOsMinimumVersion(value: NullableOption[String]): Self = this.set("osMinimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsMinimumVersion: Self = this.set("osMinimumVersion", js.undefined)
    
    @scala.inline
    def setOsMinimumVersionNull: Self = this.set("osMinimumVersion", null)
    
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = this.set("passwordBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordBlockSimple: Self = this.set("passwordBlockSimple", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = this.set("passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = this.set("passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinimumCharacterSetCount: Self = this.set("passwordMinimumCharacterSetCount", js.undefined)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountNull: Self = this.set("passwordMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasswordMinimumLength(value: NullableOption[Double]): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    
    @scala.inline
    def setPasswordMinimumLengthNull: Self = this.set("passwordMinimumLength", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = this.set("passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeLock: Self = this.set("passwordMinutesOfInactivityBeforeLock", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockNull: Self = this.set("passwordMinutesOfInactivityBeforeLock", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = this.set("passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordRequireToUnlockFromIdle(value: Boolean): Self = this.set("passwordRequireToUnlockFromIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequireToUnlockFromIdle: Self = this.set("passwordRequireToUnlockFromIdle", js.undefined)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = this.set("passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequired: Self = this.set("passwordRequired", js.undefined)
    
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    
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
