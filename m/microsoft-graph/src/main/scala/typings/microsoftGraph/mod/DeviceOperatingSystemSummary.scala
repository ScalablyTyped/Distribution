package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOperatingSystemSummary extends StObject {
  
  // Number of android device count.
  var androidCount: js.UndefOr[Double] = js.undefined
  
  // Number of iOS device count.
  var iosCount: js.UndefOr[Double] = js.undefined
  
  // Number of Mac OS X device count.
  var macOSCount: js.UndefOr[Double] = js.undefined
  
  // Number of unknown device count.
  var unknownCount: js.UndefOr[Double] = js.undefined
  
  // Number of Windows device count.
  var windowsCount: js.UndefOr[Double] = js.undefined
  
  // Number of Windows mobile device count.
  var windowsMobileCount: js.UndefOr[Double] = js.undefined
}
object DeviceOperatingSystemSummary {
  
  inline def apply(): DeviceOperatingSystemSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOperatingSystemSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceOperatingSystemSummary] (val x: Self) extends AnyVal {
    
    inline def setAndroidCount(value: Double): Self = StObject.set(x, "androidCount", value.asInstanceOf[js.Any])
    
    inline def setAndroidCountUndefined: Self = StObject.set(x, "androidCount", js.undefined)
    
    inline def setIosCount(value: Double): Self = StObject.set(x, "iosCount", value.asInstanceOf[js.Any])
    
    inline def setIosCountUndefined: Self = StObject.set(x, "iosCount", js.undefined)
    
    inline def setMacOSCount(value: Double): Self = StObject.set(x, "macOSCount", value.asInstanceOf[js.Any])
    
    inline def setMacOSCountUndefined: Self = StObject.set(x, "macOSCount", js.undefined)
    
    inline def setUnknownCount(value: Double): Self = StObject.set(x, "unknownCount", value.asInstanceOf[js.Any])
    
    inline def setUnknownCountUndefined: Self = StObject.set(x, "unknownCount", js.undefined)
    
    inline def setWindowsCount(value: Double): Self = StObject.set(x, "windowsCount", value.asInstanceOf[js.Any])
    
    inline def setWindowsCountUndefined: Self = StObject.set(x, "windowsCount", js.undefined)
    
    inline def setWindowsMobileCount(value: Double): Self = StObject.set(x, "windowsMobileCount", value.asInstanceOf[js.Any])
    
    inline def setWindowsMobileCountUndefined: Self = StObject.set(x, "windowsMobileCount", js.undefined)
  }
}
