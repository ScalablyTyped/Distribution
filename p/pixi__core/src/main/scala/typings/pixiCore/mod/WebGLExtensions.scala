package typings.pixiCore.mod

import typings.std.EXTTextureFilterAnisotropic
import typings.std.OESElementIndexUint
import typings.std.OESTextureFloat
import typings.std.OESTextureFloatLinear
import typings.std.OESTextureHalfFloat
import typings.std.OESTextureHalfFloatLinear
import typings.std.OESVertexArrayObject
import typings.std.WEBGLColorBufferFloat
import typings.std.WEBGLCompressedTextureAstc
import typings.std.WEBGLCompressedTextureS3tc
import typings.std.WEBGLCompressedTextureS3tcSrgb
import typings.std.WEBGLDrawBuffers
import typings.std.WEBGLLoseContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLExtensions extends StObject {
  
  var anisotropicFiltering: js.UndefOr[EXTTextureFilterAnisotropic] = js.undefined
  
  var astc: js.UndefOr[WEBGLCompressedTextureAstc] = js.undefined
  
  var atc: js.UndefOr[WEBGLCompressedTextureAtc] = js.undefined
  
  var colorBufferFloat: js.UndefOr[WEBGLColorBufferFloat] = js.undefined
  
  var depthTexture: js.UndefOr[OESTextureFloat] = js.undefined
  
  var drawBuffers: js.UndefOr[WEBGLDrawBuffers] = js.undefined
  
  var etc: js.UndefOr[WEBGLCompressedTextureEtc2] = js.undefined
  
  var etc1: js.UndefOr[WEBGLCompressedTextureEtc12] = js.undefined
  
  var floatTexture: js.UndefOr[OESTextureFloat] = js.undefined
  
  var floatTextureLinear: js.UndefOr[OESTextureFloatLinear] = js.undefined
  
  var loseContext: js.UndefOr[WEBGLLoseContext] = js.undefined
  
  var pvrtc: js.UndefOr[WEBGLCompressedTexturePvrtc2] = js.undefined
  
  var s3tc: js.UndefOr[WEBGLCompressedTextureS3tc] = js.undefined
  
  var s3tc_sRGB: js.UndefOr[WEBGLCompressedTextureS3tcSrgb] = js.undefined
  
  var textureHalfFloat: js.UndefOr[OESTextureHalfFloat] = js.undefined
  
  var textureHalfFloatLinear: js.UndefOr[OESTextureHalfFloatLinear] = js.undefined
  
  var uint32ElementIndex: js.UndefOr[OESElementIndexUint] = js.undefined
  
  var vertexArrayObject: js.UndefOr[OESVertexArrayObject] = js.undefined
}
object WebGLExtensions {
  
  inline def apply(): WebGLExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLExtensions]
  }
  
  extension [Self <: WebGLExtensions](x: Self) {
    
    inline def setAnisotropicFiltering(value: EXTTextureFilterAnisotropic): Self = StObject.set(x, "anisotropicFiltering", value.asInstanceOf[js.Any])
    
    inline def setAnisotropicFilteringUndefined: Self = StObject.set(x, "anisotropicFiltering", js.undefined)
    
    inline def setAstc(value: WEBGLCompressedTextureAstc): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
    
    inline def setAstcUndefined: Self = StObject.set(x, "astc", js.undefined)
    
    inline def setAtc(value: WEBGLCompressedTextureAtc): Self = StObject.set(x, "atc", value.asInstanceOf[js.Any])
    
    inline def setAtcUndefined: Self = StObject.set(x, "atc", js.undefined)
    
    inline def setColorBufferFloat(value: WEBGLColorBufferFloat): Self = StObject.set(x, "colorBufferFloat", value.asInstanceOf[js.Any])
    
    inline def setColorBufferFloatUndefined: Self = StObject.set(x, "colorBufferFloat", js.undefined)
    
    inline def setDepthTexture(value: OESTextureFloat): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
    
    inline def setDepthTextureUndefined: Self = StObject.set(x, "depthTexture", js.undefined)
    
    inline def setDrawBuffers(value: WEBGLDrawBuffers): Self = StObject.set(x, "drawBuffers", value.asInstanceOf[js.Any])
    
    inline def setDrawBuffersUndefined: Self = StObject.set(x, "drawBuffers", js.undefined)
    
    inline def setEtc(value: WEBGLCompressedTextureEtc2): Self = StObject.set(x, "etc", value.asInstanceOf[js.Any])
    
    inline def setEtc1(value: WEBGLCompressedTextureEtc12): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
    
    inline def setEtc1Undefined: Self = StObject.set(x, "etc1", js.undefined)
    
    inline def setEtcUndefined: Self = StObject.set(x, "etc", js.undefined)
    
    inline def setFloatTexture(value: OESTextureFloat): Self = StObject.set(x, "floatTexture", value.asInstanceOf[js.Any])
    
    inline def setFloatTextureLinear(value: OESTextureFloatLinear): Self = StObject.set(x, "floatTextureLinear", value.asInstanceOf[js.Any])
    
    inline def setFloatTextureLinearUndefined: Self = StObject.set(x, "floatTextureLinear", js.undefined)
    
    inline def setFloatTextureUndefined: Self = StObject.set(x, "floatTexture", js.undefined)
    
    inline def setLoseContext(value: WEBGLLoseContext): Self = StObject.set(x, "loseContext", value.asInstanceOf[js.Any])
    
    inline def setLoseContextUndefined: Self = StObject.set(x, "loseContext", js.undefined)
    
    inline def setPvrtc(value: WEBGLCompressedTexturePvrtc2): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
    
    inline def setPvrtcUndefined: Self = StObject.set(x, "pvrtc", js.undefined)
    
    inline def setS3tc(value: WEBGLCompressedTextureS3tc): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
    
    inline def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
    
    inline def setS3tc_sRGB(value: WEBGLCompressedTextureS3tcSrgb): Self = StObject.set(x, "s3tc_sRGB", value.asInstanceOf[js.Any])
    
    inline def setS3tc_sRGBUndefined: Self = StObject.set(x, "s3tc_sRGB", js.undefined)
    
    inline def setTextureHalfFloat(value: OESTextureHalfFloat): Self = StObject.set(x, "textureHalfFloat", value.asInstanceOf[js.Any])
    
    inline def setTextureHalfFloatLinear(value: OESTextureHalfFloatLinear): Self = StObject.set(x, "textureHalfFloatLinear", value.asInstanceOf[js.Any])
    
    inline def setTextureHalfFloatLinearUndefined: Self = StObject.set(x, "textureHalfFloatLinear", js.undefined)
    
    inline def setTextureHalfFloatUndefined: Self = StObject.set(x, "textureHalfFloat", js.undefined)
    
    inline def setUint32ElementIndex(value: OESElementIndexUint): Self = StObject.set(x, "uint32ElementIndex", value.asInstanceOf[js.Any])
    
    inline def setUint32ElementIndexUndefined: Self = StObject.set(x, "uint32ElementIndex", js.undefined)
    
    inline def setVertexArrayObject(value: OESVertexArrayObject): Self = StObject.set(x, "vertexArrayObject", value.asInstanceOf[js.Any])
    
    inline def setVertexArrayObjectUndefined: Self = StObject.set(x, "vertexArrayObject", js.undefined)
  }
}
