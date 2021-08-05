package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsUnityClientInfo extends StObject {
  
  /** API client name and version. For example, the SDK calling the API. The exact format is up to the client. */
  var apiClient: js.UndefOr[String] = js.undefined
  
  /** Application ID, such as the package name on Android and the bundle identifier on iOS platforms. */
  var applicationId: js.UndefOr[String] = js.undefined
  
  /** Application version number, such as "1.2.3". The exact format is application-dependent. */
  var applicationVersion: js.UndefOr[String] = js.undefined
  
  /** Device model as reported by the device. The exact format is platform-dependent. */
  var deviceModel: js.UndefOr[String] = js.undefined
  
  /**
    * Language code (in BCP-47 format) indicating the UI language of the client. Examples are "en", "en-US" or "ja-Latn". For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Operating system name and version as reported by the OS. For example, "Mac OS X 10.10.4". The exact format is platform-dependent. */
  var operatingSystem: js.UndefOr[String] = js.undefined
  
  /** Build number/version of the operating system. e.g., the contents of android.os.Build.ID in Android, or the contents of sysctl "kern.osversion" in iOS. */
  var operatingSystemBuild: js.UndefOr[String] = js.undefined
  
  /** Platform where the application is running. */
  var platform: js.UndefOr[String] = js.undefined
}
object GoogleMapsUnityClientInfo {
  
  inline def apply(): GoogleMapsUnityClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsUnityClientInfo]
  }
  
  extension [Self <: GoogleMapsUnityClientInfo](x: Self) {
    
    inline def setApiClient(value: String): Self = StObject.set(x, "apiClient", value.asInstanceOf[js.Any])
    
    inline def setApiClientUndefined: Self = StObject.set(x, "apiClient", js.undefined)
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setApplicationVersion(value: String): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    inline def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemBuild(value: String): Self = StObject.set(x, "operatingSystemBuild", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemBuildUndefined: Self = StObject.set(x, "operatingSystemBuild", js.undefined)
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
