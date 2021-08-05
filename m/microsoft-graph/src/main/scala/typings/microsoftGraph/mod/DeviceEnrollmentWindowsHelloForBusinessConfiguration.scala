package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEnrollmentWindowsHelloForBusinessConfiguration
  extends StObject
     with DeviceEnrollmentConfiguration {
  
  // Not yet documented. Possible values are: notConfigured, enabled, disabled.
  var enhancedBiometricsState: js.UndefOr[Enablement] = js.undefined
  
  // Not yet documented
  var pinExpirationInDays: js.UndefOr[Double] = js.undefined
  
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinLowercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  
  // Not yet documented
  var pinMaximumLength: js.UndefOr[Double] = js.undefined
  
  // Not yet documented
  var pinMinimumLength: js.UndefOr[Double] = js.undefined
  
  // Not yet documented
  var pinPreviousBlockCount: js.UndefOr[Double] = js.undefined
  
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinSpecialCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinUppercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.undefined
  
  // Not yet documented
  var remotePassportEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Not yet documented
  var securityDeviceRequired: js.UndefOr[Boolean] = js.undefined
  
  // Not yet documented. Possible values are: notConfigured, enabled, disabled.
  var state: js.UndefOr[Enablement] = js.undefined
  
  // Not yet documented
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
