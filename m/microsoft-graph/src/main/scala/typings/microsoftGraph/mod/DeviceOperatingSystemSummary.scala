package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOperatingSystemSummary extends StObject {
  
  /**
    * The count of Corporate work profile Android devices. Also known as Corporate Owned Personally Enabled (COPE). Valid
    * values -1 to 2147483647
    */
  var androidCorporateWorkProfileCount: js.UndefOr[Double] = js.undefined
  
  // Number of android device count.
  var androidCount: js.UndefOr[Double] = js.undefined
  
  // Number of dedicated Android devices.
  var androidDedicatedCount: js.UndefOr[Double] = js.undefined
  
  // Number of device admin Android devices.
  var androidDeviceAdminCount: js.UndefOr[Double] = js.undefined
  
  // Number of fully managed Android devices.
  var androidFullyManagedCount: js.UndefOr[Double] = js.undefined
  
  // Number of work profile Android devices.
  var androidWorkProfileCount: js.UndefOr[Double] = js.undefined
  
  // Number of ConfigMgr managed devices.
  var configMgrDeviceCount: js.UndefOr[Double] = js.undefined
  
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
    
    inline def setAndroidCorporateWorkProfileCount(value: Double): Self = StObject.set(x, "androidCorporateWorkProfileCount", value.asInstanceOf[js.Any])
    
    inline def setAndroidCorporateWorkProfileCountUndefined: Self = StObject.set(x, "androidCorporateWorkProfileCount", js.undefined)
    
    inline def setAndroidCount(value: Double): Self = StObject.set(x, "androidCount", value.asInstanceOf[js.Any])
    
    inline def setAndroidCountUndefined: Self = StObject.set(x, "androidCount", js.undefined)
    
    inline def setAndroidDedicatedCount(value: Double): Self = StObject.set(x, "androidDedicatedCount", value.asInstanceOf[js.Any])
    
    inline def setAndroidDedicatedCountUndefined: Self = StObject.set(x, "androidDedicatedCount", js.undefined)
    
    inline def setAndroidDeviceAdminCount(value: Double): Self = StObject.set(x, "androidDeviceAdminCount", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceAdminCountUndefined: Self = StObject.set(x, "androidDeviceAdminCount", js.undefined)
    
    inline def setAndroidFullyManagedCount(value: Double): Self = StObject.set(x, "androidFullyManagedCount", value.asInstanceOf[js.Any])
    
    inline def setAndroidFullyManagedCountUndefined: Self = StObject.set(x, "androidFullyManagedCount", js.undefined)
    
    inline def setAndroidWorkProfileCount(value: Double): Self = StObject.set(x, "androidWorkProfileCount", value.asInstanceOf[js.Any])
    
    inline def setAndroidWorkProfileCountUndefined: Self = StObject.set(x, "androidWorkProfileCount", js.undefined)
    
    inline def setConfigMgrDeviceCount(value: Double): Self = StObject.set(x, "configMgrDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setConfigMgrDeviceCountUndefined: Self = StObject.set(x, "configMgrDeviceCount", js.undefined)
    
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
