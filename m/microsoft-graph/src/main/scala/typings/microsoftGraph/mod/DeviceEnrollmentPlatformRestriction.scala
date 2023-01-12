package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEnrollmentPlatformRestriction extends StObject {
  
  // Max OS version supported
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Min OS version supported
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Block personally owned devices from enrolling
  var personalDeviceEnrollmentBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Block the platform from enrolling
  var platformBlocked: js.UndefOr[Boolean] = js.undefined
}
object DeviceEnrollmentPlatformRestriction {
  
  inline def apply(): DeviceEnrollmentPlatformRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestriction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceEnrollmentPlatformRestriction] (val x: Self) extends AnyVal {
    
    inline def setOsMaximumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMaximumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMaximumVersionNull: Self = StObject.set(x, "osMaximumVersion", null)
    
    inline def setOsMaximumVersionUndefined: Self = StObject.set(x, "osMaximumVersion", js.undefined)
    
    inline def setOsMinimumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMinimumVersionNull: Self = StObject.set(x, "osMinimumVersion", null)
    
    inline def setOsMinimumVersionUndefined: Self = StObject.set(x, "osMinimumVersion", js.undefined)
    
    inline def setPersonalDeviceEnrollmentBlocked(value: Boolean): Self = StObject.set(x, "personalDeviceEnrollmentBlocked", value.asInstanceOf[js.Any])
    
    inline def setPersonalDeviceEnrollmentBlockedUndefined: Self = StObject.set(x, "personalDeviceEnrollmentBlocked", js.undefined)
    
    inline def setPlatformBlocked(value: Boolean): Self = StObject.set(x, "platformBlocked", value.asInstanceOf[js.Any])
    
    inline def setPlatformBlockedUndefined: Self = StObject.set(x, "platformBlocked", js.undefined)
  }
}
