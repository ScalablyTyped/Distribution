package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEnrollmentPlatformRestrictionsConfiguration
  extends StObject
     with DeviceEnrollmentConfiguration {
  
  // Not yet documented
  var androidRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.undefined
  
  // Not yet documented
  var iosRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.undefined
  
  // Not yet documented
  var macOSRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.undefined
  
  // Not yet documented
  var windowsMobileRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.undefined
  
  // Not yet documented
  var windowsRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.undefined
}
object DeviceEnrollmentPlatformRestrictionsConfiguration {
  
  inline def apply(): DeviceEnrollmentPlatformRestrictionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestrictionsConfiguration]
  }
  
  extension [Self <: DeviceEnrollmentPlatformRestrictionsConfiguration](x: Self) {
    
    inline def setAndroidRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "androidRestriction", value.asInstanceOf[js.Any])
    
    inline def setAndroidRestrictionNull: Self = StObject.set(x, "androidRestriction", null)
    
    inline def setAndroidRestrictionUndefined: Self = StObject.set(x, "androidRestriction", js.undefined)
    
    inline def setIosRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "iosRestriction", value.asInstanceOf[js.Any])
    
    inline def setIosRestrictionNull: Self = StObject.set(x, "iosRestriction", null)
    
    inline def setIosRestrictionUndefined: Self = StObject.set(x, "iosRestriction", js.undefined)
    
    inline def setMacOSRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "macOSRestriction", value.asInstanceOf[js.Any])
    
    inline def setMacOSRestrictionNull: Self = StObject.set(x, "macOSRestriction", null)
    
    inline def setMacOSRestrictionUndefined: Self = StObject.set(x, "macOSRestriction", js.undefined)
    
    inline def setWindowsMobileRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "windowsMobileRestriction", value.asInstanceOf[js.Any])
    
    inline def setWindowsMobileRestrictionNull: Self = StObject.set(x, "windowsMobileRestriction", null)
    
    inline def setWindowsMobileRestrictionUndefined: Self = StObject.set(x, "windowsMobileRestriction", js.undefined)
    
    inline def setWindowsRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "windowsRestriction", value.asInstanceOf[js.Any])
    
    inline def setWindowsRestrictionNull: Self = StObject.set(x, "windowsRestriction", null)
    
    inline def setWindowsRestrictionUndefined: Self = StObject.set(x, "windowsRestriction", js.undefined)
  }
}
