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
  
  @scala.inline
  def apply(): AndroidStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidStoreApp]
  }
  
  @scala.inline
  implicit class AndroidStoreAppMutableBuilder[Self <: AndroidStoreApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreUrlNull: Self = StObject.set(x, "appStoreUrl", null)
    
    @scala.inline
    def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: NullableOption[AndroidMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
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
