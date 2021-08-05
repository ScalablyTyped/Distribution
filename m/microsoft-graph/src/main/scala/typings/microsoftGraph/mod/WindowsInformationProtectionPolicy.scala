package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionPolicy
  extends StObject
     with WindowsInformationProtection {
  
  // Offline interval before app data is wiped (days)
  var daysWithoutContactBeforeUnenroll: js.UndefOr[Double] = js.undefined
  
  // Enrollment url for the MDM
  var mdmEnrollmentUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become
    * PIN or password locked. Range is an integer X where 0 &amp;lt;= X &amp;lt;= 999.
    */
  var minutesOfInactivityBeforeDeviceLock: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The
    * largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy
    * setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows
    * 10, version 1511. Default is 0.
    */
  var numberOfPastPinsRemembered: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe
    * functionality. Range is an integer X where 4 &amp;lt;= X &amp;lt;= 16 for desktop and 0 &amp;lt;= X &amp;lt;= 999 for
    * mobile devices.
    */
  var passwordMaximumAttemptCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to
    * change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for
    * this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in
    * Windows 10, version 1511. Default is 0.
    */
  var pinExpirationDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer value that configures the use of lowercase letters in the Windows Hello for Business PIN. Default is NotAllow.
    * Possible values are: notAllow, requireAtLeastOne, allow.
    */
  var pinLowercaseLetters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.undefined
  
  /**
    * Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number
    * you can configure for this policy setting is 4. The largest number you can configure must be less than the number
    * configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
    */
  var pinMinimumLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer value that configures the use of special characters in the Windows Hello for Business PIN. Valid special
    * characters for Windows Hello for Business PIN gestures include: ! ' # $ % &amp; ' ( ) + , - . / : ; &amp;lt; = &amp;gt;
    * ? @ [ / ] ^ ` {
    */
  var pinSpecialCharacters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.undefined
  
  /**
    * Integer value that configures the use of uppercase letters in the Windows Hello for Business PIN. Default is NotAllow.
    * Possible values are: notAllow, requireAtLeastOne, allow.
    */
  var pinUppercaseLetters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.undefined
  
  // New property in RS2, pending documentation
  var revokeOnMdmHandoffDisabled: js.UndefOr[Boolean] = js.undefined
  
  // Boolean value that sets Windows Hello for Business as a method for signing into Windows.
  var windowsHelloForBusinessBlocked: js.UndefOr[Boolean] = js.undefined
}
object WindowsInformationProtectionPolicy {
  
  inline def apply(): WindowsInformationProtectionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionPolicy]
  }
  
  extension [Self <: WindowsInformationProtectionPolicy](x: Self) {
    
    inline def setDaysWithoutContactBeforeUnenroll(value: Double): Self = StObject.set(x, "daysWithoutContactBeforeUnenroll", value.asInstanceOf[js.Any])
    
    inline def setDaysWithoutContactBeforeUnenrollUndefined: Self = StObject.set(x, "daysWithoutContactBeforeUnenroll", js.undefined)
    
    inline def setMdmEnrollmentUrl(value: NullableOption[String]): Self = StObject.set(x, "mdmEnrollmentUrl", value.asInstanceOf[js.Any])
    
    inline def setMdmEnrollmentUrlNull: Self = StObject.set(x, "mdmEnrollmentUrl", null)
    
    inline def setMdmEnrollmentUrlUndefined: Self = StObject.set(x, "mdmEnrollmentUrl", js.undefined)
    
    inline def setMinutesOfInactivityBeforeDeviceLock(value: Double): Self = StObject.set(x, "minutesOfInactivityBeforeDeviceLock", value.asInstanceOf[js.Any])
    
    inline def setMinutesOfInactivityBeforeDeviceLockUndefined: Self = StObject.set(x, "minutesOfInactivityBeforeDeviceLock", js.undefined)
    
    inline def setNumberOfPastPinsRemembered(value: Double): Self = StObject.set(x, "numberOfPastPinsRemembered", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPastPinsRememberedUndefined: Self = StObject.set(x, "numberOfPastPinsRemembered", js.undefined)
    
    inline def setPasswordMaximumAttemptCount(value: Double): Self = StObject.set(x, "passwordMaximumAttemptCount", value.asInstanceOf[js.Any])
    
    inline def setPasswordMaximumAttemptCountUndefined: Self = StObject.set(x, "passwordMaximumAttemptCount", js.undefined)
    
    inline def setPinExpirationDays(value: Double): Self = StObject.set(x, "pinExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setPinExpirationDaysUndefined: Self = StObject.set(x, "pinExpirationDays", js.undefined)
    
    inline def setPinLowercaseLetters(value: WindowsInformationProtectionPinCharacterRequirements): Self = StObject.set(x, "pinLowercaseLetters", value.asInstanceOf[js.Any])
    
    inline def setPinLowercaseLettersUndefined: Self = StObject.set(x, "pinLowercaseLetters", js.undefined)
    
    inline def setPinMinimumLength(value: Double): Self = StObject.set(x, "pinMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setPinMinimumLengthUndefined: Self = StObject.set(x, "pinMinimumLength", js.undefined)
    
    inline def setPinSpecialCharacters(value: WindowsInformationProtectionPinCharacterRequirements): Self = StObject.set(x, "pinSpecialCharacters", value.asInstanceOf[js.Any])
    
    inline def setPinSpecialCharactersUndefined: Self = StObject.set(x, "pinSpecialCharacters", js.undefined)
    
    inline def setPinUppercaseLetters(value: WindowsInformationProtectionPinCharacterRequirements): Self = StObject.set(x, "pinUppercaseLetters", value.asInstanceOf[js.Any])
    
    inline def setPinUppercaseLettersUndefined: Self = StObject.set(x, "pinUppercaseLetters", js.undefined)
    
    inline def setRevokeOnMdmHandoffDisabled(value: Boolean): Self = StObject.set(x, "revokeOnMdmHandoffDisabled", value.asInstanceOf[js.Any])
    
    inline def setRevokeOnMdmHandoffDisabledUndefined: Self = StObject.set(x, "revokeOnMdmHandoffDisabled", js.undefined)
    
    inline def setWindowsHelloForBusinessBlocked(value: Boolean): Self = StObject.set(x, "windowsHelloForBusinessBlocked", value.asInstanceOf[js.Any])
    
    inline def setWindowsHelloForBusinessBlockedUndefined: Self = StObject.set(x, "windowsHelloForBusinessBlocked", js.undefined)
  }
}
