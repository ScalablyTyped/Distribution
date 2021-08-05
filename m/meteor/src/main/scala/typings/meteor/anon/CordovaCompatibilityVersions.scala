package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaCompatibilityVersions extends StObject {
  
  var PUBLIC_SETTINGS: js.Any
  
  var cordovaCompatibilityVersions: js.UndefOr[js.Any] = js.undefined
  
  var format: String
  
  var manifest: js.Any
  
  var version: String
}
object CordovaCompatibilityVersions {
  
  inline def apply(PUBLIC_SETTINGS: js.Any, format: String, manifest: js.Any, version: String): CordovaCompatibilityVersions = {
    val __obj = js.Dynamic.literal(PUBLIC_SETTINGS = PUBLIC_SETTINGS.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaCompatibilityVersions]
  }
  
  extension [Self <: CordovaCompatibilityVersions](x: Self) {
    
    inline def setCordovaCompatibilityVersions(value: js.Any): Self = StObject.set(x, "cordovaCompatibilityVersions", value.asInstanceOf[js.Any])
    
    inline def setCordovaCompatibilityVersionsUndefined: Self = StObject.set(x, "cordovaCompatibilityVersions", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: js.Any): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setPUBLIC_SETTINGS(value: js.Any): Self = StObject.set(x, "PUBLIC_SETTINGS", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
