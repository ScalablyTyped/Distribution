package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacOSLobChildApp extends StObject {
  
  // The build number of the app.
  var buildNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The bundleId of the app.
  var bundleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The version number of the app.
  var versionNumber: js.UndefOr[NullableOption[String]] = js.undefined
}
object MacOSLobChildApp {
  
  inline def apply(): MacOSLobChildApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSLobChildApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacOSLobChildApp] (val x: Self) extends AnyVal {
    
    inline def setBuildNumber(value: NullableOption[String]): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberNull: Self = StObject.set(x, "buildNumber", null)
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    inline def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setVersionNumber(value: NullableOption[String]): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
