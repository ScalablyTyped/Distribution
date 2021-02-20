package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceOperatingSystemSummary extends StObject {
  
  // Number of android device count.
  var androidCount: js.UndefOr[Double] = js.native
  
  // Number of iOS device count.
  var iosCount: js.UndefOr[Double] = js.native
  
  // Number of Mac OS X device count.
  var macOSCount: js.UndefOr[Double] = js.native
  
  // Number of unknown device count.
  var unknownCount: js.UndefOr[Double] = js.native
  
  // Number of Windows device count.
  var windowsCount: js.UndefOr[Double] = js.native
  
  // Number of Windows mobile device count.
  var windowsMobileCount: js.UndefOr[Double] = js.native
}
object DeviceOperatingSystemSummary {
  
  @scala.inline
  def apply(): DeviceOperatingSystemSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOperatingSystemSummary]
  }
  
  @scala.inline
  implicit class DeviceOperatingSystemSummaryMutableBuilder[Self <: DeviceOperatingSystemSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidCount(value: Double): Self = StObject.set(x, "androidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidCountUndefined: Self = StObject.set(x, "androidCount", js.undefined)
    
    @scala.inline
    def setIosCount(value: Double): Self = StObject.set(x, "iosCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosCountUndefined: Self = StObject.set(x, "iosCount", js.undefined)
    
    @scala.inline
    def setMacOSCount(value: Double): Self = StObject.set(x, "macOSCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacOSCountUndefined: Self = StObject.set(x, "macOSCount", js.undefined)
    
    @scala.inline
    def setUnknownCount(value: Double): Self = StObject.set(x, "unknownCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownCountUndefined: Self = StObject.set(x, "unknownCount", js.undefined)
    
    @scala.inline
    def setWindowsCount(value: Double): Self = StObject.set(x, "windowsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsCountUndefined: Self = StObject.set(x, "windowsCount", js.undefined)
    
    @scala.inline
    def setWindowsMobileCount(value: Double): Self = StObject.set(x, "windowsMobileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsMobileCountUndefined: Self = StObject.set(x, "windowsMobileCount", js.undefined)
  }
}
