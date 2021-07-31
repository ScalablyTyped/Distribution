package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitmapFontFileConfig extends StObject {
  
  /**
    * The default file extension to use for the font data xml if no url is provided.
    */
  var fontDataExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load the font data xml file from.
    */
  var fontDataURL: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the font data xml file.
    */
  var fontDataXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
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
object BitmapFontFileConfig {
  
  @scala.inline
  def apply(key: String): BitmapFontFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapFontFileConfig]
  }
  
  @scala.inline
  implicit class BitmapFontFileConfigMutableBuilder[Self <: BitmapFontFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontDataExtension(value: String): Self = StObject.set(x, "fontDataExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDataExtensionUndefined: Self = StObject.set(x, "fontDataExtension", js.undefined)
    
    @scala.inline
    def setFontDataURL(value: String): Self = StObject.set(x, "fontDataURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDataURLUndefined: Self = StObject.set(x, "fontDataURL", js.undefined)
    
    @scala.inline
    def setFontDataXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "fontDataXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDataXhrSettingsUndefined: Self = StObject.set(x, "fontDataXhrSettings", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalMap(value: String): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
    
    @scala.inline
    def setTextureExtension(value: String): Self = StObject.set(x, "textureExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureExtensionUndefined: Self = StObject.set(x, "textureExtension", js.undefined)
    
    @scala.inline
    def setTextureURL(value: String): Self = StObject.set(x, "textureURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureURLUndefined: Self = StObject.set(x, "textureURL", js.undefined)
    
    @scala.inline
    def setTextureXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "textureXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureXhrSettingsUndefined: Self = StObject.set(x, "textureXhrSettings", js.undefined)
  }
}
