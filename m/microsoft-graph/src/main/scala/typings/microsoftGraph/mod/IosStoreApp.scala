package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosStoreApp
  extends StObject
     with MobileApp {
  
  // The Apple App Store URL
  var appStoreUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.undefined
  
  // The Identity Name.
  var bundleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[IosMinimumOperatingSystem]] = js.undefined
}
object IosStoreApp {
  
  inline def apply(): IosStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosStoreApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosStoreApp] (val x: Self) extends AnyVal {
    
    inline def setAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setAppStoreUrlNull: Self = StObject.set(x, "appStoreUrl", null)
    
    inline def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    inline def setApplicableDeviceType(value: IosDeviceType): Self = StObject.set(x, "applicableDeviceType", value.asInstanceOf[js.Any])
    
    inline def setApplicableDeviceTypeUndefined: Self = StObject.set(x, "applicableDeviceType", js.undefined)
    
    inline def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setMinimumSupportedOperatingSystem(value: NullableOption[IosMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
    inline def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
  }
}
