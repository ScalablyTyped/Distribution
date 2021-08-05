package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpineFileConfig extends StObject {
  
  var atlasExtension: js.UndefOr[String] = js.undefined
  
  var atlasURL: js.UndefOr[String] = js.undefined
  
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  var key: String
  
  var normalMap: js.UndefOr[String] = js.undefined
  
  var textureExtension: js.UndefOr[String] = js.undefined
  
  var textureURL: js.UndefOr[String] = js.undefined
  
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}
object SpineFileConfig {
  
  inline def apply(key: String): SpineFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineFileConfig]
  }
  
  extension [Self <: SpineFileConfig](x: Self) {
    
    inline def setAtlasExtension(value: String): Self = StObject.set(x, "atlasExtension", value.asInstanceOf[js.Any])
    
    inline def setAtlasExtensionUndefined: Self = StObject.set(x, "atlasExtension", js.undefined)
    
    inline def setAtlasURL(value: String): Self = StObject.set(x, "atlasURL", value.asInstanceOf[js.Any])
    
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
