package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaCompatibilityVersions extends StObject {
  
  var PUBLIC_SETTINGS: Any
  
  var cordovaCompatibilityVersions: js.UndefOr[Any] = js.undefined
  
  var format: String
  
  var manifest: Any
  
  var version: String
}
object CordovaCompatibilityVersions {
  
  inline def apply(PUBLIC_SETTINGS: Any, format: String, manifest: Any, version: String): CordovaCompatibilityVersions = {
    val __obj = js.Dynamic.literal(PUBLIC_SETTINGS = PUBLIC_SETTINGS.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaCompatibilityVersions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CordovaCompatibilityVersions] (val x: Self) extends AnyVal {
    
    inline def setCordovaCompatibilityVersions(value: Any): Self = StObject.set(x, "cordovaCompatibilityVersions", value.asInstanceOf[js.Any])
    
    inline def setCordovaCompatibilityVersionsUndefined: Self = StObject.set(x, "cordovaCompatibilityVersions", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: Any): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setPUBLIC_SETTINGS(value: Any): Self = StObject.set(x, "PUBLIC_SETTINGS", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
