package typings.microsoftGraph.mod

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
  implicit class IosStoreAppOps[Self <: IosStoreApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppStoreUrl(value: NullableOption[String]): Self = this.set("appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStoreUrl: Self = this.set("appStoreUrl", js.undefined)
    
    @scala.inline
    def setAppStoreUrlNull: Self = this.set("appStoreUrl", null)
    
    @scala.inline
    def setApplicableDeviceType(value: IosDeviceType): Self = this.set("applicableDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableDeviceType: Self = this.set("applicableDeviceType", js.undefined)
    
    @scala.inline
    def setBundleId(value: NullableOption[String]): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setBundleIdNull: Self = this.set("bundleId", null)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: NullableOption[IosMinimumOperatingSystem]): Self = this.set("minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSupportedOperatingSystem: Self = this.set("minimumSupportedOperatingSystem", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystemNull: Self = this.set("minimumSupportedOperatingSystem", null)
  }
}
