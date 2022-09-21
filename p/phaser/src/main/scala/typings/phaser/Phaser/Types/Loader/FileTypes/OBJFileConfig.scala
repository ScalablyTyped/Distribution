package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OBJFileConfig extends StObject {
  
  /**
    * The default file extension to use if no url is provided.
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * Flip the UV coordinates stored in the model data?
    */
  var flipUV: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key of the file. Must be unique within both the Loader and the OBJ Cache.
    */
  var key: String
  
  /**
    * The default material file extension to use if no url is provided.
    */
  var matExtension: js.UndefOr[String] = js.undefined
  
  /**
    * An optional absolute or relative URL to the object material file from. If undefined or `null`, no material file will be loaded.
    */
  var matURL: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.obj`, i.e. if `key` was "alien" then the URL will be "alien.obj".
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}
object OBJFileConfig {
  
  inline def apply(key: String): OBJFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[OBJFileConfig]
  }
  
  extension [Self <: OBJFileConfig](x: Self) {
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setFlipUV(value: Boolean): Self = StObject.set(x, "flipUV", value.asInstanceOf[js.Any])
    
    inline def setFlipUVUndefined: Self = StObject.set(x, "flipUV", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMatExtension(value: String): Self = StObject.set(x, "matExtension", value.asInstanceOf[js.Any])
    
    inline def setMatExtensionUndefined: Self = StObject.set(x, "matExtension", js.undefined)
    
    inline def setMatURL(value: String): Self = StObject.set(x, "matURL", value.asInstanceOf[js.Any])
    
    inline def setMatURLUndefined: Self = StObject.set(x, "matURL", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
