package typings.phaser.Phaser.Types.Loader.FileTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressedTextureFileConfig extends StObject {
  
  /**
    * The string, or file entry object, for an ASTC format texture.
    */
  var ASTC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an ATC format texture.
    */
  var ATC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an BPTC format texture.
    */
  var BPTC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an ETC format texture.
    */
  var ETC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an ETC1 format texture.
    */
  var ETC1: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for the fallback image file.
    */
  var IMG: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an PVRTC format texture.
    */
  var PVRTC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an RGTC format texture.
    */
  var RGTC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an S3TC format texture.
    */
  var S3TC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an S3TCRGB format texture.
    */
  var S3TCRGB: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
}
object CompressedTextureFileConfig {
  
  inline def apply(): CompressedTextureFileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressedTextureFileConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompressedTextureFileConfig] (val x: Self) extends AnyVal {
    
    inline def setASTC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "ASTC", value.asInstanceOf[js.Any])
    
    inline def setASTCUndefined: Self = StObject.set(x, "ASTC", js.undefined)
    
    inline def setATC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "ATC", value.asInstanceOf[js.Any])
    
    inline def setATCUndefined: Self = StObject.set(x, "ATC", js.undefined)
    
    inline def setBPTC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "BPTC", value.asInstanceOf[js.Any])
    
    inline def setBPTCUndefined: Self = StObject.set(x, "BPTC", js.undefined)
    
    inline def setETC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "ETC", value.asInstanceOf[js.Any])
    
    inline def setETC1(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "ETC1", value.asInstanceOf[js.Any])
    
    inline def setETC1Undefined: Self = StObject.set(x, "ETC1", js.undefined)
    
    inline def setETCUndefined: Self = StObject.set(x, "ETC", js.undefined)
    
    inline def setIMG(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "IMG", value.asInstanceOf[js.Any])
    
    inline def setIMGUndefined: Self = StObject.set(x, "IMG", js.undefined)
    
    inline def setPVRTC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "PVRTC", value.asInstanceOf[js.Any])
    
    inline def setPVRTCUndefined: Self = StObject.set(x, "PVRTC", js.undefined)
    
    inline def setRGTC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "RGTC", value.asInstanceOf[js.Any])
    
    inline def setRGTCUndefined: Self = StObject.set(x, "RGTC", js.undefined)
    
    inline def setS3TC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "S3TC", value.asInstanceOf[js.Any])
    
    inline def setS3TCRGB(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "S3TCRGB", value.asInstanceOf[js.Any])
    
    inline def setS3TCRGBUndefined: Self = StObject.set(x, "S3TCRGB", js.undefined)
    
    inline def setS3TCUndefined: Self = StObject.set(x, "S3TC", js.undefined)
  }
}
