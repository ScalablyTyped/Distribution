package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidStoreApp
  extends StObject
     with MobileApp {
  
  // The Android app store URL.
  var appStoreUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[AndroidMinimumOperatingSystem]] = js.undefined
  
  // The package identifier.
  var packageId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AndroidStoreApp {
  
  inline def apply(): AndroidStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidStoreApp]
  }
  
  extension [Self <: AndroidStoreApp](x: Self) {
    
    inline def setAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setAppStoreUrlNull: Self = StObject.set(x, "appStoreUrl", null)
    
    inline def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    inline def setMinimumSupportedOperatingSystem(value: NullableOption[AndroidMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
    inline def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
    
    inline def setPackageId(value: NullableOption[String]): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdNull: Self = StObject.set(x, "packageId", null)
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
  }
}
