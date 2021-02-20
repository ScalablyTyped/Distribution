package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAndroidStoreApp extends ManagedApp {
  
  // The Android AppStoreUrl.
  var appStoreUrl: js.UndefOr[String] = js.native
  
  // The value for the minimum supported operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.native
  
  // The app's package ID.
  var packageId: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedAndroidStoreApp {
  
  @scala.inline
  def apply(): ManagedAndroidStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAndroidStoreApp]
  }
  
  @scala.inline
  implicit class ManagedAndroidStoreAppMutableBuilder[Self <: ManagedAndroidStoreApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStoreUrl(value: String): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: AndroidMinimumOperatingSystem): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
    
    @scala.inline
    def setPackageId(value: NullableOption[String]): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIdNull: Self = StObject.set(x, "packageId", null)
    
    @scala.inline
    def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
  }
}
