package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Windows10CompliancePolicy
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
  var mobileOsMaximumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Minimum Windows Phone version.
  var mobileOsMinimumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Maximum Windows 10 version.
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Minimum Windows 10 version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether or not to block simple password.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  
  // The password expiration in days.
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of previous passwords to prevent re-use of.
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Require a password to unlock Windows device.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  
  // Require a password to unlock an idle device.
  var passwordRequiredToUnlockFromIdle: js.UndefOr[Boolean] = js.undefined
  
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var requireHealthyDeviceReport: js.UndefOr[Boolean] = js.undefined
  
  // Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
  var secureBootEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Require encryption on windows devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.undefined
}
object Windows10CompliancePolicy {
  
  inline def apply(): Windows10CompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10CompliancePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Windows10CompliancePolicy] (val x: Self) extends AnyVal {
    
    inline def setBitLockerEnabled(value: Boolean): Self = StObject.set(x, "bitLockerEnabled", value.asInstanceOf[js.Any])
    
    inline def setBitLockerEnabledUndefined: Self = StObject.set(x, "bitLockerEnabled", js.undefined)
    
    inline def setCodeIntegrityEnabled(value: Boolean): Self = StObject.set(x, "codeIntegrityEnabled", value.asInstanceOf[js.Any])
    
    inline def setCodeIntegrityEnabledUndefined: Self = StObject.set(x, "codeIntegrityEnabled", js.undefined)
    
    inline def setEarlyLaunchAntiMalwareDriverEnabled(value: Boolean): Self = StObject.set(x, "earlyLaunchAntiMalwareDriverEnabled", value.asInstanceOf[js.Any])
    
    inline def setEarlyLaunchAntiMalwareDriverEnabledUndefined: Self = StObject.set(x, "earlyLaunchAntiMalwareDriverEnabled", js.undefined)
    
    inline def setMobileOsMaximumVersion(value: NullableOption[String]): Self = StObject.set(x, "mobileOsMaximumVersion", value.asInstanceOf[js.Any])
    
    inline def setMobileOsMaximumVersionNull: Self = StObject.set(x, "mobileOsMaximumVersion", null)
    
    inline def setMobileOsMaximumVersionUndefined: Self = StObject.set(x, "mobileOsMaximumVersion", js.undefined)
    
    inline def setMobileOsMinimumVersion(value: NullableOption[String]): Self = StObject.set(x, "mobileOsMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setMobileOsMinimumVersionNull: Self = StObject.set(x, "mobileOsMinimumVersion", null)
    
    inline def setMobileOsMinimumVersionUndefined: Self = StObject.set(x, "mobileOsMinimumVersion", js.undefined)
    
    inline def setOsMaximumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMaximumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMaximumVersionNull: Self = StObject.set(x, "osMaximumVersion", null)
    
    inline def setOsMaximumVersionUndefined: Self = StObject.set(x, "osMaximumVersion", js.undefined)
    
    inline def setOsMinimumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMinimumVersionNull: Self = StObject.set(x, "osMinimumVersion", null)
    
    inline def setOsMinimumVersionUndefined: Self = StObject.set(x, "osMinimumVersion", js.undefined)
    
    inline def setPasswordBlockSimple(value: Boolean): Self = StObject.set(x, "passwordBlockSimple", value.asInstanceOf[js.Any])
    
    inline def setPasswordBlockSimpleUndefined: Self = StObject.set(x, "passwordBlockSimple", js.undefined)
    
    inline def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    inline def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    inline def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumCharacterSetCountNull: Self = StObject.set(x, "passwordMinimumCharacterSetCount", null)
    
    inline def setPasswordMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passwordMinimumCharacterSetCount", js.undefined)
    
    inline def setPasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumLengthNull: Self = StObject.set(x, "passwordMinimumLength", null)
    
    inline def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    inline def setPasswordMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinutesOfInactivityBeforeLockNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", null)
    
    inline def setPasswordMinutesOfInactivityBeforeLockUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", js.undefined)
    
    inline def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    inline def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    inline def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    inline def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredToUnlockFromIdle(value: Boolean): Self = StObject.set(x, "passwordRequiredToUnlockFromIdle", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredToUnlockFromIdleUndefined: Self = StObject.set(x, "passwordRequiredToUnlockFromIdle", js.undefined)
    
    inline def setPasswordRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    inline def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    inline def setRequireHealthyDeviceReport(value: Boolean): Self = StObject.set(x, "requireHealthyDeviceReport", value.asInstanceOf[js.Any])
    
    inline def setRequireHealthyDeviceReportUndefined: Self = StObject.set(x, "requireHealthyDeviceReport", js.undefined)
    
    inline def setSecureBootEnabled(value: Boolean): Self = StObject.set(x, "secureBootEnabled", value.asInstanceOf[js.Any])
    
    inline def setSecureBootEnabledUndefined: Self = StObject.set(x, "secureBootEnabled", js.undefined)
    
    inline def setStorageRequireEncryption(value: Boolean): Self = StObject.set(x, "storageRequireEncryption", value.asInstanceOf[js.Any])
    
    inline def setStorageRequireEncryptionUndefined: Self = StObject.set(x, "storageRequireEncryption", js.undefined)
  }
}
