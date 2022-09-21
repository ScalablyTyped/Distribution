package typings.pixiCompressedTextures

import typings.pixiCompressedTextures.mod.CompressedTextureResource
import typings.pixiConstants.mod.FORMATS
import typings.pixiConstants.mod.TYPES
import typings.pixiCore.mod.BufferResource
import typings.std.Map
import typings.std.WEBGLCompressedTextureAstc
import typings.std.WEBGLCompressedTextureS3tc
import typings.std.WEBGLCompressedTextureS3tcSrgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compressed extends StObject {
    
    var compressed: js.UndefOr[js.Array[CompressedTextureResource]] = js.undefined
    
    var kvData: (Map[String, js.typedarray.DataView]) | Null
    
    var uncompressed: js.UndefOr[js.Array[Resource]] = js.undefined
  }
  object Compressed {
    
    inline def apply(): Compressed = {
      val __obj = js.Dynamic.literal(kvData = null)
      __obj.asInstanceOf[Compressed]
    }
    
    extension [Self <: Compressed](x: Self) {
      
      inline def setCompressed(value: js.Array[CompressedTextureResource]): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
      
      inline def setCompressedVarargs(value: CompressedTextureResource*): Self = StObject.set(x, "compressed", js.Array(value*))
      
      inline def setKvData(value: Map[String, js.typedarray.DataView]): Self = StObject.set(x, "kvData", value.asInstanceOf[js.Any])
      
      inline def setKvDataNull: Self = StObject.set(x, "kvData", null)
      
      inline def setUncompressed(value: js.Array[Resource]): Self = StObject.set(x, "uncompressed", value.asInstanceOf[js.Any])
      
      inline def setUncompressedUndefined: Self = StObject.set(x, "uncompressed", js.undefined)
      
      inline def setUncompressedVarargs(value: Resource*): Self = StObject.set(x, "uncompressed", js.Array(value*))
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[
        /* keyof @pixi/compressed-textures.@pixi/compressed-textures.INTERNAL_FORMATS */ String
      ] = js.undefined
    
    var src: String
  }
  object Format {
    
    inline def apply(src: String): Format = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: /* keyof @pixi/compressed-textures.@pixi/compressed-textures.INTERNAL_FORMATS */ String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@pixi/compressed-textures.@pixi/compressed-textures.CompressedTextureExtensions> */
  trait PartialCompressedTextureE extends StObject {
    
    var astc: js.UndefOr[WEBGLCompressedTextureAstc] = js.undefined
    
    var atc: js.UndefOr[Any] = js.undefined
    
    var etc: js.UndefOr[Any] = js.undefined
    
    var etc1: js.UndefOr[Any] = js.undefined
    
    var pvrtc: js.UndefOr[Any] = js.undefined
    
    var s3tc: js.UndefOr[WEBGLCompressedTextureS3tc] = js.undefined
    
    var s3tc_sRGB: js.UndefOr[WEBGLCompressedTextureS3tcSrgb] = js.undefined
  }
  object PartialCompressedTextureE {
    
    inline def apply(): PartialCompressedTextureE = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCompressedTextureE]
    }
    
    extension [Self <: PartialCompressedTextureE](x: Self) {
      
      inline def setAstc(value: WEBGLCompressedTextureAstc): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
      
      inline def setAstcUndefined: Self = StObject.set(x, "astc", js.undefined)
      
      inline def setAtc(value: Any): Self = StObject.set(x, "atc", value.asInstanceOf[js.Any])
      
      inline def setAtcUndefined: Self = StObject.set(x, "atc", js.undefined)
      
      inline def setEtc(value: Any): Self = StObject.set(x, "etc", value.asInstanceOf[js.Any])
      
      inline def setEtc1(value: Any): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
      
      inline def setEtc1Undefined: Self = StObject.set(x, "etc1", js.undefined)
      
      inline def setEtcUndefined: Self = StObject.set(x, "etc", js.undefined)
      
      inline def setPvrtc(value: Any): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
      
      inline def setPvrtcUndefined: Self = StObject.set(x, "pvrtc", js.undefined)
      
      inline def setS3tc(value: WEBGLCompressedTextureS3tc): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
      
      inline def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
      
      inline def setS3tc_sRGB(value: WEBGLCompressedTextureS3tcSrgb): Self = StObject.set(x, "s3tc_sRGB", value.asInstanceOf[js.Any])
      
      inline def setS3tc_sRGBUndefined: Self = StObject.set(x, "s3tc_sRGB", js.undefined)
    }
  }
  
  trait Resource extends StObject {
    
    var format: FORMATS
    
    var resource: BufferResource
    
    var `type`: TYPES
  }
  object Resource {
    
    inline def apply(format: FORMATS, resource: BufferResource, `type`: TYPES): Resource = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setFormat(value: FORMATS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setResource(value: BufferResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setType(value: TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
