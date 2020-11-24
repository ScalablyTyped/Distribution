package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionPolicy extends WindowsInformationProtection {
  
  // Offline interval before app data is wiped (days)
  var daysWithoutContactBeforeUnenroll: js.UndefOr[Double] = js.native
  
  // Enrollment url for the MDM
  var mdmEnrollmentUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become
    * PIN or password locked. Range is an integer X where 0 &amp;lt;= X &amp;lt;= 999.
    */
  var minutesOfInactivityBeforeDeviceLock: js.UndefOr[Double] = js.native
  
  /**
    * Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The
    * largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy
    * setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows
    * 10, version 1511. Default is 0.
    */
  var numberOfPastPinsRemembered: js.UndefOr[Double] = js.native
  
  /**
    * The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe
    * functionality. Range is an integer X where 4 &amp;lt;= X &amp;lt;= 16 for desktop and 0 &amp;lt;= X &amp;lt;= 999 for
    * mobile devices.
    */
  var passwordMaximumAttemptCount: js.UndefOr[Double] = js.native
  
  /**
    * Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to
    * change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for
    * this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in
    * Windows 10, version 1511. Default is 0.
    */
  var pinExpirationDays: js.UndefOr[Double] = js.native
  
  /**
    * Integer value that configures the use of lowercase letters in the Windows Hello for Business PIN. Default is NotAllow.
    * Possible values are: notAllow, requireAtLeastOne, allow.
    */
  var pinLowercaseLetters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.native
  
  /**
    * Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number
    * you can configure for this policy setting is 4. The largest number you can configure must be less than the number
    * configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
    */
  var pinMinimumLength: js.UndefOr[Double] = js.native
  
  /**
    * Integer value that configures the use of special characters in the Windows Hello for Business PIN. Valid special
    * characters for Windows Hello for Business PIN gestures include: ! ' # $ % &amp; ' ( ) + , - . / : ; &amp;lt; = &amp;gt;
    * ? @ [ / ] ^ ` {
    */
  var pinSpecialCharacters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.native
  
  /**
    * Integer value that configures the use of uppercase letters in the Windows Hello for Business PIN. Default is NotAllow.
    * Possible values are: notAllow, requireAtLeastOne, allow.
    */
  var pinUppercaseLetters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.native
  
  // New property in RS2, pending documentation
  var revokeOnMdmHandoffDisabled: js.UndefOr[Boolean] = js.native
  
  // Boolean value that sets Windows Hello for Business as a method for signing into Windows.
  var windowsHelloForBusinessBlocked: js.UndefOr[Boolean] = js.native
}
object WindowsInformationProtectionPolicy {
  
  @scala.inline
  def apply(): WindowsInformationProtectionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionPolicy]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionPolicyOps[Self <: WindowsInformationProtectionPolicy] (val x: Self) extends AnyVal {
    
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
    def setDaysWithoutContactBeforeUnenroll(value: Double): Self = this.set("daysWithoutContactBeforeUnenroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysWithoutContactBeforeUnenroll: Self = this.set("daysWithoutContactBeforeUnenroll", js.undefined)
    
    @scala.inline
    def setMdmEnrollmentUrl(value: NullableOption[String]): Self = this.set("mdmEnrollmentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMdmEnrollmentUrl: Self = this.set("mdmEnrollmentUrl", js.undefined)
    
    @scala.inline
    def setMdmEnrollmentUrlNull: Self = this.set("mdmEnrollmentUrl", null)
    
    @scala.inline
    def setMinutesOfInactivityBeforeDeviceLock(value: Double): Self = this.set("minutesOfInactivityBeforeDeviceLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutesOfInactivityBeforeDeviceLock: Self = this.set("minutesOfInactivityBeforeDeviceLock", js.undefined)
    
    @scala.inline
    def setNumberOfPastPinsRemembered(value: Double): Self = this.set("numberOfPastPinsRemembered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfPastPinsRemembered: Self = this.set("numberOfPastPinsRemembered", js.undefined)
    
    @scala.inline
    def setPasswordMaximumAttemptCount(value: Double): Self = this.set("passwordMaximumAttemptCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMaximumAttemptCount: Self = this.set("passwordMaximumAttemptCount", js.undefined)
    
    @scala.inline
    def setPinExpirationDays(value: Double): Self = this.set("pinExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinExpirationDays: Self = this.set("pinExpirationDays", js.undefined)
    
    @scala.inline
    def setPinLowercaseLetters(value: WindowsInformationProtectionPinCharacterRequirements): Self = this.set("pinLowercaseLetters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinLowercaseLetters: Self = this.set("pinLowercaseLetters", js.undefined)
    
    @scala.inline
    def setPinMinimumLength(value: Double): Self = this.set("pinMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinMinimumLength: Self = this.set("pinMinimumLength", js.undefined)
    
    @scala.inline
    def setPinSpecialCharacters(value: WindowsInformationProtectionPinCharacterRequirements): Self = this.set("pinSpecialCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinSpecialCharacters: Self = this.set("pinSpecialCharacters", js.undefined)
    
    @scala.inline
    def setPinUppercaseLetters(value: WindowsInformationProtectionPinCharacterRequirements): Self = this.set("pinUppercaseLetters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinUppercaseLetters: Self = this.set("pinUppercaseLetters", js.undefined)
    
    @scala.inline
    def setRevokeOnMdmHandoffDisabled(value: Boolean): Self = this.set("revokeOnMdmHandoffDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokeOnMdmHandoffDisabled: Self = this.set("revokeOnMdmHandoffDisabled", js.undefined)
    
    @scala.inline
    def setWindowsHelloForBusinessBlocked(value: Boolean): Self = this.set("windowsHelloForBusinessBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsHelloForBusinessBlocked: Self = this.set("windowsHelloForBusinessBlocked", js.undefined)
  }
}
