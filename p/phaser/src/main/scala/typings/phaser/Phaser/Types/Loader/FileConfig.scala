package typings.phaser.Phaser.Types.Loader

import typings.phaser.phaserBooleans.`false`
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileConfig extends StObject {
  
  /**
    * A config object that can be used by file types to store transitional data.
    */
  var config: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The default extension this file uses.
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String
  
  /**
    * The path of the file, not including the baseURL.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The responseType to be used by the XHR request.
    */
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
  
  /**
    * The file type string (image, json, etc) for sorting within the Loader.
    */
  var `type`: String
  
  /**
    * The URL of the file, not including baseURL.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Custom XHR Settings specific to this file and merged with the Loader defaults.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject | `false`] = js.undefined
}
object FileConfig {
  
  inline def apply(key: String, `type`: String): FileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
  
  extension [Self <: FileConfig](x: Self) {
    
    inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXhrSettings(value: XHRSettingsObject | `false`): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
