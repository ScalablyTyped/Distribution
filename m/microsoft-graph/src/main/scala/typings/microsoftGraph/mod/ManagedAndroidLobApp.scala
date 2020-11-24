package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAndroidLobApp extends ManagedMobileLobApp {
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[AndroidMinimumOperatingSystem]] = js.native
  
  // The package identifier.
  var packageId: js.UndefOr[NullableOption[String]] = js.native
  
  // The version code of managed Android Line of Business (LoB) app.
  var versionCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The version name of managed Android Line of Business (LoB) app.
  var versionName: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedAndroidLobApp {
  
  @scala.inline
  def apply(): ManagedAndroidLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAndroidLobApp]
  }
  
  @scala.inline
  implicit class ManagedAndroidLobAppOps[Self <: ManagedAndroidLobApp] (val x: Self) extends AnyVal {
    
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
    def setMinimumSupportedOperatingSystem(value: NullableOption[AndroidMinimumOperatingSystem]): Self = this.set("minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSupportedOperatingSystem: Self = this.set("minimumSupportedOperatingSystem", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystemNull: Self = this.set("minimumSupportedOperatingSystem", null)
    
    @scala.inline
    def setPackageId(value: NullableOption[String]): Self = this.set("packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageId: Self = this.set("packageId", js.undefined)
    
    @scala.inline
    def setPackageIdNull: Self = this.set("packageId", null)
    
    @scala.inline
    def setVersionCode(value: NullableOption[String]): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
    
    @scala.inline
    def setVersionCodeNull: Self = this.set("versionCode", null)
    
    @scala.inline
    def setVersionName(value: NullableOption[String]): Self = this.set("versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionName: Self = this.set("versionName", js.undefined)
    
    @scala.inline
    def setVersionNameNull: Self = this.set("versionName", null)
  }
}
