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
  
  @scala.inline
  def apply(PUBLIC_SETTINGS: js.Any, format: String, manifest: js.Any, version: String): CordovaCompatibilityVersions = {
    val __obj = js.Dynamic.literal(PUBLIC_SETTINGS = PUBLIC_SETTINGS.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaCompatibilityVersions]
  }
  
  @scala.inline
  implicit class CordovaCompatibilityVersionsMutableBuilder[Self <: CordovaCompatibilityVersions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCordovaCompatibilityVersions(value: js.Any): Self = StObject.set(x, "cordovaCompatibilityVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCordovaCompatibilityVersionsUndefined: Self = StObject.set(x, "cordovaCompatibilityVersions", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: js.Any): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUBLIC_SETTINGS(value: js.Any): Self = StObject.set(x, "PUBLIC_SETTINGS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
