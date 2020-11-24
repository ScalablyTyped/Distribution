package typings.microsoftGraph.mod

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
  implicit class ManagedAndroidStoreAppOps[Self <: ManagedAndroidStoreApp] (val x: Self) extends AnyVal {
    
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
    def setAppStoreUrl(value: String): Self = this.set("appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStoreUrl: Self = this.set("appStoreUrl", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: AndroidMinimumOperatingSystem): Self = this.set("minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSupportedOperatingSystem: Self = this.set("minimumSupportedOperatingSystem", js.undefined)
    
    @scala.inline
    def setPackageId(value: NullableOption[String]): Self = this.set("packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageId: Self = this.set("packageId", js.undefined)
    
    @scala.inline
    def setPackageIdNull: Self = this.set("packageId", null)
  }
}
