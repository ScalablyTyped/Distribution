package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsUnityClientInfo extends js.Object {
  
  /** API client name and version. For example, the SDK calling the API. The exact format is up to the client. */
  var apiClient: js.UndefOr[String] = js.native
  
  /** Application ID, such as the package name on Android and the bundle identifier on iOS platforms. */
  var applicationId: js.UndefOr[String] = js.native
  
  /** Application version number, such as "1.2.3". The exact format is application-dependent. */
  var applicationVersion: js.UndefOr[String] = js.native
  
  /** Device model as reported by the device. The exact format is platform-dependent. */
  var deviceModel: js.UndefOr[String] = js.native
  
  /**
    * Language code (in BCP-47 format) indicating the UI language of the client. Examples are "en", "en-US" or "ja-Latn". For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Operating system name and version as reported by the OS. For example, "Mac OS X 10.10.4". The exact format is platform-dependent. */
  var operatingSystem: js.UndefOr[String] = js.native
  
  /** Build number/version of the operating system. e.g., the contents of android.os.Build.ID in Android, or the contents of sysctl "kern.osversion" in iOS. */
  var operatingSystemBuild: js.UndefOr[String] = js.native
  
  /** Platform where the application is running. */
  var platform: js.UndefOr[String] = js.native
}
object GoogleMapsUnityClientInfo {
  
  @scala.inline
  def apply(): GoogleMapsUnityClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsUnityClientInfo]
  }
  
  @scala.inline
  implicit class GoogleMapsUnityClientInfoOps[Self <: GoogleMapsUnityClientInfo] (val x: Self) extends AnyVal {
    
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
    def setApiClient(value: String): Self = this.set("apiClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiClient: Self = this.set("apiClient", js.undefined)
    
    @scala.inline
    def setApplicationId(value: String): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    
    @scala.inline
    def setApplicationVersion(value: String): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersion: Self = this.set("applicationVersion", js.undefined)
    
    @scala.inline
    def setDeviceModel(value: String): Self = this.set("deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceModel: Self = this.set("deviceModel", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
    
    @scala.inline
    def setOperatingSystemBuild(value: String): Self = this.set("operatingSystemBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemBuild: Self = this.set("operatingSystemBuild", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
  }
}
