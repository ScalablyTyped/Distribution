package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosStoreApp extends MobileApp {
  
  // The Apple App Store URL
  var appStoreUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  
  // The Identity Name.
  var bundleId: js.UndefOr[NullableOption[String]] = js.native
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[IosMinimumOperatingSystem]] = js.native
}
object IosStoreApp {
  
  @scala.inline
  def apply(): IosStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosStoreApp]
  }
  
  @scala.inline
  implicit class IosStoreAppMutableBuilder[Self <: IosStoreApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreUrlNull: Self = StObject.set(x, "appStoreUrl", null)
    
    @scala.inline
    def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    @scala.inline
    def setApplicableDeviceType(value: IosDeviceType): Self = StObject.set(x, "applicableDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableDeviceTypeUndefined: Self = StObject.set(x, "applicableDeviceType", js.undefined)
    
    @scala.inline
    def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: NullableOption[IosMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
    @scala.inline
    def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
  }
}
