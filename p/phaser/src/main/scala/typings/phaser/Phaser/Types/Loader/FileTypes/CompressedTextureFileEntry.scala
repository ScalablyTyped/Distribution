package typings.phaser.Phaser.Types.Loader.FileTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressedTextureFileEntry extends StObject {
  
  /**
    * Optional URL of a texture atlas JSON data file. If not given, the texture will be loaded as a single image.
    */
  var atlasURL: js.UndefOr[String] = js.undefined
  
  /**
    * The texture compression base format that the browser must support in order to load this file. Can be any of: 'ETC', 'ETC1', 'ATC', 'ASTC', 'BPTC', 'RGTC', 'PVRTC', 'S3TC', 'S3TCSRGB' or the fallback format of 'IMG'.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Optional URL of a multi-texture atlas JSON data file as created by Texture Packer Pro.
    */
  var multiAtlasURL: js.UndefOr[String] = js.undefined
  
  /**
    * Optional Base URL to use when loading the textures defined in the multi atlas data.
    */
  var multiBaseURL: js.UndefOr[String] = js.undefined
  
  /**
    * Optional path to use when loading the textures defined in the multi atlas data.
    */
  var multiPath: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the compressed texture file to load.
    */
  var textureURL: js.UndefOr[String] = js.undefined
  
  /**
    * The container format, either PVR or KTX. If not given it will try to extract it from the textureURL extension.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object CompressedTextureFileEntry {
  
  inline def apply(): CompressedTextureFileEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressedTextureFileEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompressedTextureFileEntry] (val x: Self) extends AnyVal {
    
    inline def setAtlasURL(value: String): Self = StObject.set(x, "atlasURL", value.asInstanceOf[js.Any])
    
    inline def setAtlasURLUndefined: Self = StObject.set(x, "atlasURL", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMultiAtlasURL(value: String): Self = StObject.set(x, "multiAtlasURL", value.asInstanceOf[js.Any])
    
    inline def setMultiAtlasURLUndefined: Self = StObject.set(x, "multiAtlasURL", js.undefined)
    
    inline def setMultiBaseURL(value: String): Self = StObject.set(x, "multiBaseURL", value.asInstanceOf[js.Any])
    
    inline def setMultiBaseURLUndefined: Self = StObject.set(x, "multiBaseURL", js.undefined)
    
    inline def setMultiPath(value: String): Self = StObject.set(x, "multiPath", value.asInstanceOf[js.Any])
    
    inline def setMultiPathUndefined: Self = StObject.set(x, "multiPath", js.undefined)
    
    inline def setTextureURL(value: String): Self = StObject.set(x, "textureURL", value.asInstanceOf[js.Any])
    
    inline def setTextureURLUndefined: Self = StObject.set(x, "textureURL", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
