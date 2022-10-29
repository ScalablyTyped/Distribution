package typings.pixiCore

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

object libContextWebGLExtensionsMod {
  
  trait WEBGLCompressedTextureAtc extends StObject {
    
    var COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: Double
    
    var COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: Double
    
    var COMPRESSED_RGB_ATC_WEBGL: Double
  }
  object WEBGLCompressedTextureAtc {
    
    inline def apply(
      COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: Double,
      COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: Double,
      COMPRESSED_RGB_ATC_WEBGL: Double
    ): WEBGLCompressedTextureAtc = {
      val __obj = js.Dynamic.literal(COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL = COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL.asInstanceOf[js.Any], COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL = COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL.asInstanceOf[js.Any], COMPRESSED_RGB_ATC_WEBGL = COMPRESSED_RGB_ATC_WEBGL.asInstanceOf[js.Any])
      __obj.asInstanceOf[WEBGLCompressedTextureAtc]
    }
    
    extension [Self <: WEBGLCompressedTextureAtc](x: Self) {
      
      inline def setCOMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RGB_ATC_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_ATC_WEBGL", value.asInstanceOf[js.Any])
    }
  }
  
  trait WEBGLCompressedTextureEtc extends StObject {
    
    var COMPRESSED_R11_EAC: Double
    
    var COMPRESSED_RG11_EAC: Double
    
    var COMPRESSED_RGB8_ETC2: Double
    
    var COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: Double
    
    var COMPRESSED_RGBA8_ETC2_EAC: Double
    
    var COMPRESSED_SIGNED_R11_EAC: Double
    
    var COMPRESSED_SIGNED_RG11_EAC: Double
    
    var COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: Double
    
    var COMPRESSED_SRGB8_ETC2: Double
    
    var COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: Double
  }
  object WEBGLCompressedTextureEtc {
    
    inline def apply(
      COMPRESSED_R11_EAC: Double,
      COMPRESSED_RG11_EAC: Double,
      COMPRESSED_RGB8_ETC2: Double,
      COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: Double,
      COMPRESSED_RGBA8_ETC2_EAC: Double,
      COMPRESSED_SIGNED_R11_EAC: Double,
      COMPRESSED_SIGNED_RG11_EAC: Double,
      COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: Double,
      COMPRESSED_SRGB8_ETC2: Double,
      COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: Double
    ): WEBGLCompressedTextureEtc = {
      val __obj = js.Dynamic.literal(COMPRESSED_R11_EAC = COMPRESSED_R11_EAC.asInstanceOf[js.Any], COMPRESSED_RG11_EAC = COMPRESSED_RG11_EAC.asInstanceOf[js.Any], COMPRESSED_RGB8_ETC2 = COMPRESSED_RGB8_ETC2.asInstanceOf[js.Any], COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2.asInstanceOf[js.Any], COMPRESSED_RGBA8_ETC2_EAC = COMPRESSED_RGBA8_ETC2_EAC.asInstanceOf[js.Any], COMPRESSED_SIGNED_R11_EAC = COMPRESSED_SIGNED_R11_EAC.asInstanceOf[js.Any], COMPRESSED_SIGNED_RG11_EAC = COMPRESSED_SIGNED_RG11_EAC.asInstanceOf[js.Any], COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = COMPRESSED_SRGB8_ALPHA8_ETC2_EAC.asInstanceOf[js.Any], COMPRESSED_SRGB8_ETC2 = COMPRESSED_SRGB8_ETC2.asInstanceOf[js.Any], COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2.asInstanceOf[js.Any])
      __obj.asInstanceOf[WEBGLCompressedTextureEtc]
    }
    
    extension [Self <: WEBGLCompressedTextureEtc](x: Self) {
      
      inline def setCOMPRESSED_R11_EAC(value: Double): Self = StObject.set(x, "COMPRESSED_R11_EAC", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RG11_EAC(value: Double): Self = StObject.set(x, "COMPRESSED_RG11_EAC", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RGB8_ETC2(value: Double): Self = StObject.set(x, "COMPRESSED_RGB8_ETC2", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2(value: Double): Self = StObject.set(x, "COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RGBA8_ETC2_EAC(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA8_ETC2_EAC", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_SIGNED_R11_EAC(value: Double): Self = StObject.set(x, "COMPRESSED_SIGNED_R11_EAC", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_SIGNED_RG11_EAC(value: Double): Self = StObject.set(x, "COMPRESSED_SIGNED_RG11_EAC", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_SRGB8_ALPHA8_ETC2_EAC(value: Double): Self = StObject.set(x, "COMPRESSED_SRGB8_ALPHA8_ETC2_EAC", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_SRGB8_ETC2(value: Double): Self = StObject.set(x, "COMPRESSED_SRGB8_ETC2", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2(value: Double): Self = StObject.set(x, "COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2", value.asInstanceOf[js.Any])
    }
  }
  
  trait WEBGLCompressedTextureEtc1 extends StObject {
    
    var COMPRESSED_RGB_ETC1_WEBGL: Double
  }
  object WEBGLCompressedTextureEtc1 {
    
    inline def apply(COMPRESSED_RGB_ETC1_WEBGL: Double): WEBGLCompressedTextureEtc1 = {
      val __obj = js.Dynamic.literal(COMPRESSED_RGB_ETC1_WEBGL = COMPRESSED_RGB_ETC1_WEBGL.asInstanceOf[js.Any])
      __obj.asInstanceOf[WEBGLCompressedTextureEtc1]
    }
    
    extension [Self <: WEBGLCompressedTextureEtc1](x: Self) {
      
      inline def setCOMPRESSED_RGB_ETC1_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_ETC1_WEBGL", value.asInstanceOf[js.Any])
    }
  }
  
  trait WEBGLCompressedTexturePvrtc extends StObject {
    
    var COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double
    
    var COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double
    
    var COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double
    
    var COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double
  }
  object WEBGLCompressedTexturePvrtc {
    
    inline def apply(
      COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double,
      COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double,
      COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double,
      COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double
    ): WEBGLCompressedTexturePvrtc = {
      val __obj = js.Dynamic.literal(COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = COMPRESSED_RGBA_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = COMPRESSED_RGBA_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_2BPPV1_IMG = COMPRESSED_RGB_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_4BPPV1_IMG = COMPRESSED_RGB_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any])
      __obj.asInstanceOf[WEBGLCompressedTexturePvrtc]
    }
    
    extension [Self <: WEBGLCompressedTexturePvrtc](x: Self) {
      
      inline def setCOMPRESSED_RGBA_PVRTC_2BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RGBA_PVRTC_4BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RGB_PVRTC_2BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED_RGB_PVRTC_4BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGLExtensions extends StObject {
    
    var anisotropicFiltering: js.UndefOr[EXTTextureFilterAnisotropic] = js.undefined
    
    var astc: js.UndefOr[WEBGLCompressedTextureAstc] = js.undefined
    
    var atc: js.UndefOr[WEBGLCompressedTextureAtc] = js.undefined
    
    var colorBufferFloat: js.UndefOr[WEBGLColorBufferFloat] = js.undefined
    
    var depthTexture: js.UndefOr[OESTextureFloat] = js.undefined
    
    var drawBuffers: js.UndefOr[WEBGLDrawBuffers] = js.undefined
    
    var etc: js.UndefOr[WEBGLCompressedTextureEtc] = js.undefined
    
    var etc1: js.UndefOr[WEBGLCompressedTextureEtc1] = js.undefined
    
    var floatTexture: js.UndefOr[OESTextureFloat] = js.undefined
    
    var floatTextureLinear: js.UndefOr[OESTextureFloatLinear] = js.undefined
    
    var loseContext: js.UndefOr[WEBGLLoseContext] = js.undefined
    
    var pvrtc: js.UndefOr[WEBGLCompressedTexturePvrtc] = js.undefined
    
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
      
      inline def setEtc(value: WEBGLCompressedTextureEtc): Self = StObject.set(x, "etc", value.asInstanceOf[js.Any])
      
      inline def setEtc1(value: WEBGLCompressedTextureEtc1): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
      
      inline def setEtc1Undefined: Self = StObject.set(x, "etc1", js.undefined)
      
      inline def setEtcUndefined: Self = StObject.set(x, "etc", js.undefined)
      
      inline def setFloatTexture(value: OESTextureFloat): Self = StObject.set(x, "floatTexture", value.asInstanceOf[js.Any])
      
      inline def setFloatTextureLinear(value: OESTextureFloatLinear): Self = StObject.set(x, "floatTextureLinear", value.asInstanceOf[js.Any])
      
      inline def setFloatTextureLinearUndefined: Self = StObject.set(x, "floatTextureLinear", js.undefined)
      
      inline def setFloatTextureUndefined: Self = StObject.set(x, "floatTexture", js.undefined)
      
      inline def setLoseContext(value: WEBGLLoseContext): Self = StObject.set(x, "loseContext", value.asInstanceOf[js.Any])
      
      inline def setLoseContextUndefined: Self = StObject.set(x, "loseContext", js.undefined)
      
      inline def setPvrtc(value: WEBGLCompressedTexturePvrtc): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
      
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
}
