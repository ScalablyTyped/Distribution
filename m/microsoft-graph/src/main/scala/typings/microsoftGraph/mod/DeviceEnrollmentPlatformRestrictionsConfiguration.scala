package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceEnrollmentPlatformRestrictionsConfiguration extends DeviceEnrollmentConfiguration {
  
  // Not yet documented
  var androidRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.native
  
  // Not yet documented
  var iosRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.native
  
  // Not yet documented
  var macOSRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.native
  
  // Not yet documented
  var windowsMobileRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.native
  
  // Not yet documented
  var windowsRestriction: js.UndefOr[NullableOption[DeviceEnrollmentPlatformRestriction]] = js.native
}
object DeviceEnrollmentPlatformRestrictionsConfiguration {
  
  @scala.inline
  def apply(): DeviceEnrollmentPlatformRestrictionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestrictionsConfiguration]
  }
  
  @scala.inline
  implicit class DeviceEnrollmentPlatformRestrictionsConfigurationMutableBuilder[Self <: DeviceEnrollmentPlatformRestrictionsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "androidRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidRestrictionNull: Self = StObject.set(x, "androidRestriction", null)
    
    @scala.inline
    def setAndroidRestrictionUndefined: Self = StObject.set(x, "androidRestriction", js.undefined)
    
    @scala.inline
    def setIosRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "iosRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosRestrictionNull: Self = StObject.set(x, "iosRestriction", null)
    
    @scala.inline
    def setIosRestrictionUndefined: Self = StObject.set(x, "iosRestriction", js.undefined)
    
    @scala.inline
    def setMacOSRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "macOSRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacOSRestrictionNull: Self = StObject.set(x, "macOSRestriction", null)
    
    @scala.inline
    def setMacOSRestrictionUndefined: Self = StObject.set(x, "macOSRestriction", js.undefined)
    
    @scala.inline
    def setWindowsMobileRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "windowsMobileRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsMobileRestrictionNull: Self = StObject.set(x, "windowsMobileRestriction", null)
    
    @scala.inline
    def setWindowsMobileRestrictionUndefined: Self = StObject.set(x, "windowsMobileRestriction", js.undefined)
    
    @scala.inline
    def setWindowsRestriction(value: NullableOption[DeviceEnrollmentPlatformRestriction]): Self = StObject.set(x, "windowsRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsRestrictionNull: Self = StObject.set(x, "windowsRestriction", null)
    
    @scala.inline
    def setWindowsRestrictionUndefined: Self = StObject.set(x, "windowsRestriction", js.undefined)
  }
}
