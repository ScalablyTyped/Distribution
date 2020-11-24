package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedIOSLobApp extends ManagedMobileLobApp {
  
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  
  // The build number of managed iOS Line of Business (LoB) app.
  var buildNumber: js.UndefOr[NullableOption[String]] = js.native
  
  // The Identity Name.
  var bundleId: js.UndefOr[NullableOption[String]] = js.native
  
  // The expiration time.
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[IosMinimumOperatingSystem]] = js.native
  
  // The version number of managed iOS Line of Business (LoB) app.
  var versionNumber: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedIOSLobApp {
  
  @scala.inline
  def apply(): ManagedIOSLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedIOSLobApp]
  }
  
  @scala.inline
  implicit class ManagedIOSLobAppOps[Self <: ManagedIOSLobApp] (val x: Self) extends AnyVal {
    
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
    def setApplicableDeviceType(value: IosDeviceType): Self = this.set("applicableDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableDeviceType: Self = this.set("applicableDeviceType", js.undefined)
    
    @scala.inline
    def setBuildNumber(value: NullableOption[String]): Self = this.set("buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildNumber: Self = this.set("buildNumber", js.undefined)
    
    @scala.inline
    def setBuildNumberNull: Self = this.set("buildNumber", null)
    
    @scala.inline
    def setBundleId(value: NullableOption[String]): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setBundleIdNull: Self = this.set("bundleId", null)
    
    @scala.inline
    def setExpirationDateTime(value: NullableOption[String]): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    
    @scala.inline
    def setExpirationDateTimeNull: Self = this.set("expirationDateTime", null)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: NullableOption[IosMinimumOperatingSystem]): Self = this.set("minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSupportedOperatingSystem: Self = this.set("minimumSupportedOperatingSystem", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystemNull: Self = this.set("minimumSupportedOperatingSystem", null)
    
    @scala.inline
    def setVersionNumber(value: NullableOption[String]): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
    
    @scala.inline
    def setVersionNumberNull: Self = this.set("versionNumber", null)
  }
}
