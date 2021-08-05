package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidInfo extends StObject {
  
  /** Link to open on Android if the app is not installed. */
  var androidFallbackLink: js.UndefOr[String] = js.undefined
  
  /** If specified, this overrides the ‘link’ parameter on Android. */
  var androidLink: js.UndefOr[String] = js.undefined
  
  /** Minimum version code for the Android app. If the installed app’s version code is lower, then the user is taken to the Play Store. */
  var androidMinPackageVersionCode: js.UndefOr[String] = js.undefined
  
  /** Android package name of the app. */
  var androidPackageName: js.UndefOr[String] = js.undefined
}
object AndroidInfo {
  
  inline def apply(): AndroidInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidInfo]
  }
  
  extension [Self <: AndroidInfo](x: Self) {
    
    inline def setAndroidFallbackLink(value: String): Self = StObject.set(x, "androidFallbackLink", value.asInstanceOf[js.Any])
    
    inline def setAndroidFallbackLinkUndefined: Self = StObject.set(x, "androidFallbackLink", js.undefined)
    
    inline def setAndroidLink(value: String): Self = StObject.set(x, "androidLink", value.asInstanceOf[js.Any])
    
    inline def setAndroidLinkUndefined: Self = StObject.set(x, "androidLink", js.undefined)
    
    inline def setAndroidMinPackageVersionCode(value: String): Self = StObject.set(x, "androidMinPackageVersionCode", value.asInstanceOf[js.Any])
    
    inline def setAndroidMinPackageVersionCodeUndefined: Self = StObject.set(x, "androidMinPackageVersionCode", js.undefined)
    
    inline def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
    
    inline def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
  }
}
