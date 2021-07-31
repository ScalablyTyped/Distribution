package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Windows10MobileCompliancePolicy
  extends StObject
     with DeviceCompliancePolicy {
  
  // Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
  var bitLockerEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var codeIntegrityEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is
    * enabled.
    */
  var earlyLaunchAntiMalwareDriverEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Maximum Windows Phone version.
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Minimum Windows Phone version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether or not to block syncing the calendar.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  
  // Number of days before password expiration. Valid values 1 to 255
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of previous passwords to prevent re-use of.
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Require a password to unlock an idle device.
  var passwordRequireToUnlockFromIdle: js.UndefOr[Boolean] = js.undefined
  
  // Require a password to unlock Windows Phone device.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  
  // Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
  var secureBootEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Require encryption on windows devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.undefined
}
object Windows10MobileCompliancePolicy {
  
  @scala.inline
  def apply(): Windows10MobileCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10MobileCompliancePolicy]
  }
  
  @scala.inline
  implicit class Windows10MobileCompliancePolicyMutableBuilder[Self <: Windows10MobileCompliancePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitLockerEnabled(value: Boolean): Self = StObject.set(x, "bitLockerEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitLockerEnabledUndefined: Self = StObject.set(x, "bitLockerEnabled", js.undefined)
    
    @scala.inline
    def setCodeIntegrityEnabled(value: Boolean): Self = StObject.set(x, "codeIntegrityEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeIntegrityEnabledUndefined: Self = StObject.set(x, "codeIntegrityEnabled", js.undefined)
    
    @scala.inline
    def setEarlyLaunchAntiMalwareDriverEnabled(value: Boolean): Self = StObject.set(x, "earlyLaunchAntiMalwareDriverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyLaunchAntiMalwareDriverEnabledUndefined: Self = StObject.set(x, "earlyLaunchAntiMalwareDriverEnabled", js.undefined)
    
    @scala.inline
    def setOsMaximumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMaximumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsMaximumVersionNull: Self = StObject.set(x, "osMaximumVersion", null)
    
    @scala.inline
    def setOsMaximumVersionUndefined: Self = StObject.set(x, "osMaximumVersion", js.undefined)
    
    @scala.inline
    def setOsMinimumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMinimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsMinimumVersionNull: Self = StObject.set(x, "osMinimumVersion", null)
    
    @scala.inline
    def setOsMinimumVersionUndefined: Self = StObject.set(x, "osMinimumVersion", js.undefined)
    
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = StObject.set(x, "passwordBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockSimpleUndefined: Self = StObject.set(x, "passwordBlockSimple", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountNull: Self = StObject.set(x, "passwordMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passwordMinimumCharacterSetCount", js.undefined)
    
    @scala.inline
    def setPasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinimumLengthNull: Self = StObject.set(x, "passwordMinimumLength", null)
    
    @scala.inline
    def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordRequireToUnlockFromIdle(value: Boolean): Self = StObject.set(x, "passwordRequireToUnlockFromIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequireToUnlockFromIdleUndefined: Self = StObject.set(x, "passwordRequireToUnlockFromIdle", js.undefined)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    @scala.inline
    def setSecureBootEnabled(value: Boolean): Self = StObject.set(x, "secureBootEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureBootEnabledUndefined: Self = StObject.set(x, "secureBootEnabled", js.undefined)
    
    @scala.inline
    def setStorageRequireEncryption(value: Boolean): Self = StObject.set(x, "storageRequireEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRequireEncryptionUndefined: Self = StObject.set(x, "storageRequireEncryption", js.undefined)
  }
}
