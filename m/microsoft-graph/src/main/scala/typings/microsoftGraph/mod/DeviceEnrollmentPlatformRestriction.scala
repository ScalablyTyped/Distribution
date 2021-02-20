package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceEnrollmentPlatformRestriction extends StObject {
  
  // Max OS version supported
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Min OS version supported
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Block personally owned devices from enrolling
  var personalDeviceEnrollmentBlocked: js.UndefOr[Boolean] = js.native
  
  // Block the platform from enrolling
  var platformBlocked: js.UndefOr[Boolean] = js.native
}
object DeviceEnrollmentPlatformRestriction {
  
  @scala.inline
  def apply(): DeviceEnrollmentPlatformRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestriction]
  }
  
  @scala.inline
  implicit class DeviceEnrollmentPlatformRestrictionMutableBuilder[Self <: DeviceEnrollmentPlatformRestriction] (val x: Self) extends AnyVal {
    
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
    def setPersonalDeviceEnrollmentBlocked(value: Boolean): Self = StObject.set(x, "personalDeviceEnrollmentBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalDeviceEnrollmentBlockedUndefined: Self = StObject.set(x, "personalDeviceEnrollmentBlocked", js.undefined)
    
    @scala.inline
    def setPlatformBlocked(value: Boolean): Self = StObject.set(x, "platformBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformBlockedUndefined: Self = StObject.set(x, "platformBlocked", js.undefined)
  }
}
