package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAndroidStoreApp
  extends StObject
     with ManagedApp {
  
  // The Android AppStoreUrl.
  var appStoreUrl: js.UndefOr[String] = js.undefined
  
  // The value for the minimum supported operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.undefined
  
  // The app's package ID.
  var packageId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedAndroidStoreApp {
  
  inline def apply(): ManagedAndroidStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAndroidStoreApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedAndroidStoreApp] (val x: Self) extends AnyVal {
    
    inline def setAppStoreUrl(value: String): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    inline def setMinimumSupportedOperatingSystem(value: AndroidMinimumOperatingSystem): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
    
    inline def setPackageId(value: NullableOption[String]): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdNull: Self = StObject.set(x, "packageId", null)
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
  }
}
