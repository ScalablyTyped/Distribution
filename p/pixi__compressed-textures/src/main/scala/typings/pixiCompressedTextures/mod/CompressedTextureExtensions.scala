package typings.pixiCompressedTextures.mod

import typings.std.WEBGLCompressedTextureAstc
import typings.std.WEBGLCompressedTextureS3tc
import typings.std.WEBGLCompressedTextureS3tcSrgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressedTextureExtensions extends StObject {
  
  var astc: WEBGLCompressedTextureAstc
  
  var atc: Any
  
  var etc: Any
  
  var etc1: Any
  
  var pvrtc: Any
  
  var s3tc: js.UndefOr[WEBGLCompressedTextureS3tc] = js.undefined
  
  var s3tc_sRGB: WEBGLCompressedTextureS3tcSrgb
}
object CompressedTextureExtensions {
  
  inline def apply(
    astc: WEBGLCompressedTextureAstc,
    atc: Any,
    etc: Any,
    etc1: Any,
    pvrtc: Any,
    s3tc_sRGB: WEBGLCompressedTextureS3tcSrgb
  ): CompressedTextureExtensions = {
    val __obj = js.Dynamic.literal(astc = astc.asInstanceOf[js.Any], atc = atc.asInstanceOf[js.Any], etc = etc.asInstanceOf[js.Any], etc1 = etc1.asInstanceOf[js.Any], pvrtc = pvrtc.asInstanceOf[js.Any], s3tc_sRGB = s3tc_sRGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressedTextureExtensions]
  }
  
  extension [Self <: CompressedTextureExtensions](x: Self) {
    
    inline def setAstc(value: WEBGLCompressedTextureAstc): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
    
    inline def setAtc(value: Any): Self = StObject.set(x, "atc", value.asInstanceOf[js.Any])
    
    inline def setEtc(value: Any): Self = StObject.set(x, "etc", value.asInstanceOf[js.Any])
    
    inline def setEtc1(value: Any): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
    
    inline def setPvrtc(value: Any): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
    
    inline def setS3tc(value: WEBGLCompressedTextureS3tc): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
    
    inline def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
    
    inline def setS3tc_sRGB(value: WEBGLCompressedTextureS3tcSrgb): Self = StObject.set(x, "s3tc_sRGB", value.asInstanceOf[js.Any])
  }
}
