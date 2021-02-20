package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Minimum IOS version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether or not to block simple passcodes.
  var passcodeBlockSimple: js.UndefOr[Boolean] = js.native
  
  // Number of days before the passcode expires. Valid values 1 to 65535
  var passcodeExpirationDays: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of character sets required in the password.
  var passcodeMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.native
  
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[NullableOption[Double]] = js.native
  
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
  implicit class IosCompliancePolicyMutableBuilder[Self <: IosCompliancePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceThreatProtectionEnabled(value: Boolean): Self = StObject.set(x, "deviceThreatProtectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceThreatProtectionEnabledUndefined: Self = StObject.set(x, "deviceThreatProtectionEnabled", js.undefined)
    
    @scala.inline
    def setDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceThreatProtectionRequiredSecurityLevelUndefined: Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", js.undefined)
    
    @scala.inline
    def setManagedEmailProfileRequired(value: Boolean): Self = StObject.set(x, "managedEmailProfileRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedEmailProfileRequiredUndefined: Self = StObject.set(x, "managedEmailProfileRequired", js.undefined)
    
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
    def setPasscodeBlockSimple(value: Boolean): Self = StObject.set(x, "passcodeBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeBlockSimpleUndefined: Self = StObject.set(x, "passcodeBlockSimple", js.undefined)
    
    @scala.inline
    def setPasscodeExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passcodeExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeExpirationDaysNull: Self = StObject.set(x, "passcodeExpirationDays", null)
    
    @scala.inline
    def setPasscodeExpirationDaysUndefined: Self = StObject.set(x, "passcodeExpirationDays", js.undefined)
    
    @scala.inline
    def setPasscodeMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeMinimumCharacterSetCountNull: Self = StObject.set(x, "passcodeMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasscodeMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passcodeMinimumCharacterSetCount", js.undefined)
    
    @scala.inline
    def setPasscodeMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeMinimumLengthNull: Self = StObject.set(x, "passcodeMinimumLength", null)
    
    @scala.inline
    def setPasscodeMinimumLengthUndefined: Self = StObject.set(x, "passcodeMinimumLength", js.undefined)
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeLockNull: Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", null)
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeLockUndefined: Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", js.undefined)
    
    @scala.inline
    def setPasscodePreviousPasscodeBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodePreviousPasscodeBlockCountNull: Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", null)
    
    @scala.inline
    def setPasscodePreviousPasscodeBlockCountUndefined: Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", js.undefined)
    
    @scala.inline
    def setPasscodeRequired(value: Boolean): Self = StObject.set(x, "passcodeRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passcodeRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeRequiredTypeUndefined: Self = StObject.set(x, "passcodeRequiredType", js.undefined)
    
    @scala.inline
    def setPasscodeRequiredUndefined: Self = StObject.set(x, "passcodeRequired", js.undefined)
    
    @scala.inline
    def setSecurityBlockJailbrokenDevices(value: Boolean): Self = StObject.set(x, "securityBlockJailbrokenDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityBlockJailbrokenDevicesUndefined: Self = StObject.set(x, "securityBlockJailbrokenDevices", js.undefined)
  }
}
