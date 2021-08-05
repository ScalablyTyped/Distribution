package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtlasJSONFileConfig extends StObject {
  
  /**
    * The default file extension to use for the atlas json if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load the atlas json file from. Or, a well formed JSON object to use instead.
    */
  var atlasURL: js.UndefOr[js.Object | String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the atlas json file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the texture image.
    */
  var normalMap: js.UndefOr[String] = js.undefined
  
  /**
    * The default file extension to use for the image texture if no url is provided.
    */
  var textureExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load the texture image file from.
    */
  var textureURL: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the texture image file.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}
object AtlasJSONFileConfig {
  
  inline def apply(key: String): AtlasJSONFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlasJSONFileConfig]
  }
  
  extension [Self <: AtlasJSONFileConfig](x: Self) {
    
    inline def setAtlasExtension(value: String): Self = StObject.set(x, "atlasExtension", value.asInstanceOf[js.Any])
    
    inline def setAtlasExtensionUndefined: Self = StObject.set(x, "atlasExtension", js.undefined)
    
    inline def setAtlasURL(value: js.Object | String): Self = StObject.set(x, "atlasURL", value.asInstanceOf[js.Any])
    
    inline def setAtlasURLUndefined: Self = StObject.set(x, "atlasURL", js.undefined)
    
    inline def setAtlasXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "atlasXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setAtlasXhrSettingsUndefined: Self = StObject.set(x, "atlasXhrSettings", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNormalMap(value: String): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    inline def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
    
    inline def setTextureExtension(value: String): Self = StObject.set(x, "textureExtension", value.asInstanceOf[js.Any])
    
    inline def setTextureExtensionUndefined: Self = StObject.set(x, "textureExtension", js.undefined)
    
    inline def setTextureURL(value: String): Self = StObject.set(x, "textureURL", value.asInstanceOf[js.Any])
    
    inline def setTextureURLUndefined: Self = StObject.set(x, "textureURL", js.undefined)
    
    inline def setTextureXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "textureXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setTextureXhrSettingsUndefined: Self = StObject.set(x, "textureXhrSettings", js.undefined)
  }
}
