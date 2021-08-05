package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedIOSStoreApp
  extends StObject
     with ManagedApp {
  
  // The Apple AppStoreUrl.
  var appStoreUrl: js.UndefOr[String] = js.undefined
  
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.undefined
  
  // The app's Bundle ID.
  var bundleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The value for the minimum supported operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.undefined
}
object ManagedIOSStoreApp {
  
  inline def apply(): ManagedIOSStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedIOSStoreApp]
  }
  
  extension [Self <: ManagedIOSStoreApp](x: Self) {
    
    inline def setAppStoreUrl(value: String): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    inline def setApplicableDeviceType(value: IosDeviceType): Self = StObject.set(x, "applicableDeviceType", value.asInstanceOf[js.Any])
    
    inline def setApplicableDeviceTypeUndefined: Self = StObject.set(x, "applicableDeviceType", js.undefined)
    
    inline def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setMinimumSupportedOperatingSystem(value: IosMinimumOperatingSystem): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
  }
}
