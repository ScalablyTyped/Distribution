package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiAtlasFileConfig extends StObject {
  
  /**
    * The default file extension to use for the atlas json if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load the multi atlas json file from. Or, a well formed JSON object.
    */
  var atlasURL: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the atlas json file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * Optional Base URL to use when loading the textures defined in the atlas data.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  
  /**
    * Optional path to use when loading the textures defined in the atlas data.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the texture files.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * An alias for 'atlasURL'. If given, it overrides anything set in 'atlasURL'.
    */
  var url: js.UndefOr[String] = js.undefined
}
object MultiAtlasFileConfig {
  
  inline def apply(key: String): MultiAtlasFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiAtlasFileConfig]
  }
  
  extension [Self <: MultiAtlasFileConfig](x: Self) {
    
    inline def setAtlasExtension(value: String): Self = StObject.set(x, "atlasExtension", value.asInstanceOf[js.Any])
    
    inline def setAtlasExtensionUndefined: Self = StObject.set(x, "atlasExtension", js.undefined)
    
    inline def setAtlasURL(value: String): Self = StObject.set(x, "atlasURL", value.asInstanceOf[js.Any])
    
    inline def setAtlasURLUndefined: Self = StObject.set(x, "atlasURL", js.undefined)
    
    inline def setAtlasXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "atlasXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setAtlasXhrSettingsUndefined: Self = StObject.set(x, "atlasXhrSettings", js.undefined)
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTextureXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "textureXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setTextureXhrSettingsUndefined: Self = StObject.set(x, "textureXhrSettings", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
