package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEnrollmentWindowsHelloForBusinessConfiguration
  extends StObject
     with DeviceEnrollmentConfiguration {
  
  /**
    * Controls the ability to use the anti-spoofing features for facial recognition on devices which support it. If set to
    * disabled, anti-spoofing features are not allowed. If set to Not Configured, the user can choose whether they want to
    * use anti-spoofing. Possible values are: notConfigured, enabled, disabled.
    */
  var enhancedBiometricsState: js.UndefOr[Enablement] = js.undefined
  
  /**
    * Controls the period of time (in days) that a PIN can be used before the system requires the user to change it. This
    * must be set between 0 and 730, inclusive. If set to 0, the user's PIN will never expire
    */
  var pinExpirationInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the ability to use lowercase letters in the Windows Hello for Business PIN. Allowed permits the use of
    * lowercase letter(s), whereas Required ensures they are present. If set to Not Allowed, lowercase letters will not be
    * permitted. Possible values are: allowed, required, disallowed.
    */
  var pinLowercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  
  /**
    * Controls the maximum number of characters allowed for the Windows Hello for Business PIN. This value must be between 4
    * and 127, inclusive. This value must be greater than or equal to the value set for the minimum PIN.
    */
  var pinMaximumLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the minimum number of characters required for the Windows Hello for Business PIN. This value must be between 4
    * and 127, inclusive, and less than or equal to the value set for the maximum PIN.
    */
  var pinMinimumLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the
    * current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not
    * preserved through a PIN reset.
    */
  var pinPreviousBlockCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the ability to use special characters in the Windows Hello for Business PIN. Allowed permits the use of
    * special character(s), whereas Required ensures they are present. If set to Not Allowed, special character(s) will not
    * be permitted. Possible values are: allowed, required, disallowed.
    */
  var pinSpecialCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  
  /**
    * Controls the ability to use uppercase letters in the Windows Hello for Business PIN. Allowed permits the use of
    * uppercase letter(s), whereas Required ensures they are present. If set to Not Allowed, uppercase letters will not be
    * permitted. Possible values are: allowed, required, disallowed.
    */
  var pinUppercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  
  /**
    * Controls the use of Remote Windows Hello for Business. Remote Windows Hello for Business provides the ability for a
    * portable, registered device to be usable as a companion for desktop authentication. The desktop must be Azure AD joined
    * and the companion device must have a Windows Hello for Business PIN.
    */
  var remotePassportEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides
    * an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices
    * can provision Windows Hello for Business even if there is not a usable TPM.
    */
  var securityDeviceRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether to allow the device to be configured for Windows Hello for Business. If set to disabled, the user
    * cannot provision Windows Hello for Business except on Azure Active Directory joined mobile phones if otherwise
    * required. If set to Not Configured, Intune will not override client defaults. Possible values are: notConfigured,
    * enabled, disabled.
    */
  var state: js.UndefOr[Enablement] = js.undefined
  
  /**
    * Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for
    * Business PIN. If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case
    * of failures.
    */
  var unlockWithBiometricsEnabled: js.UndefOr[Boolean] = js.undefined
}
object DeviceEnrollmentWindowsHelloForBusinessConfiguration {
  
  inline def apply(): DeviceEnrollmentWindowsHelloForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentWindowsHelloForBusinessConfiguration]
  }
  
  extension [Self <: DeviceEnrollmentWindowsHelloForBusinessConfiguration](x: Self) {
    
    inline def setEnhancedBiometricsState(value: Enablement): Self = StObject.set(x, "enhancedBiometricsState", value.asInstanceOf[js.Any])
    
    inline def setEnhancedBiometricsStateUndefined: Self = StObject.set(x, "enhancedBiometricsState", js.undefined)
    
    inline def setPinExpirationInDays(value: Double): Self = StObject.set(x, "pinExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setPinExpirationInDaysUndefined: Self = StObject.set(x, "pinExpirationInDays", js.undefined)
    
    inline def setPinLowercaseCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = StObject.set(x, "pinLowercaseCharactersUsage", value.asInstanceOf[js.Any])
    
    inline def setPinLowercaseCharactersUsageUndefined: Self = StObject.set(x, "pinLowercaseCharactersUsage", js.undefined)
    
    inline def setPinMaximumLength(value: Double): Self = StObject.set(x, "pinMaximumLength", value.asInstanceOf[js.Any])
    
    inline def setPinMaximumLengthUndefined: Self = StObject.set(x, "pinMaximumLength", js.undefined)
    
    inline def setPinMinimumLength(value: Double): Self = StObject.set(x, "pinMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setPinMinimumLengthUndefined: Self = StObject.set(x, "pinMinimumLength", js.undefined)
    
    inline def setPinPreviousBlockCount(value: Double): Self = StObject.set(x, "pinPreviousBlockCount", value.asInstanceOf[js.Any])
    
    inline def setPinPreviousBlockCountUndefined: Self = StObject.set(x, "pinPreviousBlockCount", js.undefined)
    
    inline def setPinSpecialCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = StObject.set(x, "pinSpecialCharactersUsage", value.asInstanceOf[js.Any])
    
    inline def setPinSpecialCharactersUsageUndefined: Self = StObject.set(x, "pinSpecialCharactersUsage", js.undefined)
    
    inline def setPinUppercaseCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = StObject.set(x, "pinUppercaseCharactersUsage", value.asInstanceOf[js.Any])
    
    inline def setPinUppercaseCharactersUsageUndefined: Self = StObject.set(x, "pinUppercaseCharactersUsage", js.undefined)
    
    inline def setRemotePassportEnabled(value: Boolean): Self = StObject.set(x, "remotePassportEnabled", value.asInstanceOf[js.Any])
    
    inline def setRemotePassportEnabledUndefined: Self = StObject.set(x, "remotePassportEnabled", js.undefined)
    
    inline def setSecurityDeviceRequired(value: Boolean): Self = StObject.set(x, "securityDeviceRequired", value.asInstanceOf[js.Any])
    
    inline def setSecurityDeviceRequiredUndefined: Self = StObject.set(x, "securityDeviceRequired", js.undefined)
    
    inline def setState(value: Enablement): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUnlockWithBiometricsEnabled(value: Boolean): Self = StObject.set(x, "unlockWithBiometricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setUnlockWithBiometricsEnabledUndefined: Self = StObject.set(x, "unlockWithBiometricsEnabled", js.undefined)
  }
}
