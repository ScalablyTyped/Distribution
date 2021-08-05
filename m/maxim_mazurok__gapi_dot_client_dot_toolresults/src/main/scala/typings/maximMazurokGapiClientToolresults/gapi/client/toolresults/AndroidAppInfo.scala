package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidAppInfo extends StObject {
  
  /** The name of the app. Optional */
  var name: js.UndefOr[String] = js.undefined
  
  /** The package name of the app. Required. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** The internal version code of the app. Optional. */
  var versionCode: js.UndefOr[String] = js.undefined
  
  /** The version name of the app. Optional. */
  var versionName: js.UndefOr[String] = js.undefined
}
object AndroidAppInfo {
  
  inline def apply(): AndroidAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidAppInfo]
  }
  
  extension [Self <: AndroidAppInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
