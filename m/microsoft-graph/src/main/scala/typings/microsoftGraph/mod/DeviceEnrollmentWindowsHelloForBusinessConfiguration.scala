package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class DeviceEnrollmentWindowsHelloForBusinessConfigurationMutableBuilder[Self <: DeviceEnrollmentWindowsHelloForBusinessConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnhancedBiometricsState(value: Enablement): Self = StObject.set(x, "enhancedBiometricsState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedBiometricsStateUndefined: Self = StObject.set(x, "enhancedBiometricsState", js.undefined)
    
    @scala.inline
    def setPinExpirationInDays(value: Double): Self = StObject.set(x, "pinExpirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinExpirationInDaysUndefined: Self = StObject.set(x, "pinExpirationInDays", js.undefined)
    
    @scala.inline
    def setPinLowercaseCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = StObject.set(x, "pinLowercaseCharactersUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinLowercaseCharactersUsageUndefined: Self = StObject.set(x, "pinLowercaseCharactersUsage", js.undefined)
    
    @scala.inline
    def setPinMaximumLength(value: Double): Self = StObject.set(x, "pinMaximumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinMaximumLengthUndefined: Self = StObject.set(x, "pinMaximumLength", js.undefined)
    
    @scala.inline
    def setPinMinimumLength(value: Double): Self = StObject.set(x, "pinMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinMinimumLengthUndefined: Self = StObject.set(x, "pinMinimumLength", js.undefined)
    
    @scala.inline
    def setPinPreviousBlockCount(value: Double): Self = StObject.set(x, "pinPreviousBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinPreviousBlockCountUndefined: Self = StObject.set(x, "pinPreviousBlockCount", js.undefined)
    
    @scala.inline
    def setPinSpecialCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = StObject.set(x, "pinSpecialCharactersUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinSpecialCharactersUsageUndefined: Self = StObject.set(x, "pinSpecialCharactersUsage", js.undefined)
    
    @scala.inline
    def setPinUppercaseCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = StObject.set(x, "pinUppercaseCharactersUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinUppercaseCharactersUsageUndefined: Self = StObject.set(x, "pinUppercaseCharactersUsage", js.undefined)
    
    @scala.inline
    def setRemotePassportEnabled(value: Boolean): Self = StObject.set(x, "remotePassportEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePassportEnabledUndefined: Self = StObject.set(x, "remotePassportEnabled", js.undefined)
    
    @scala.inline
    def setSecurityDeviceRequired(value: Boolean): Self = StObject.set(x, "securityDeviceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDeviceRequiredUndefined: Self = StObject.set(x, "securityDeviceRequired", js.undefined)
    
    @scala.inline
    def setState(value: Enablement): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUnlockWithBiometricsEnabled(value: Boolean): Self = StObject.set(x, "unlockWithBiometricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockWithBiometricsEnabledUndefined: Self = StObject.set(x, "unlockWithBiometricsEnabled", js.undefined)
  }
}
