package typings.pixiCompressedTextures

import typings.pixiAssets.libDetectionsMod.FormatDetectionParser
import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiAssets.libResolverTypesMod.ResolveURLParser
import typings.pixiCompressedTextures.anon.Compressed
import typings.pixiCompressedTextures.libResourcesBlobResourceMod.IBlobOptions
import typings.pixiCompressedTextures.libResourcesCompressedTextureResourceMod.ICompressedTextureResourceOptions
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/compressed-textures", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@pixi/compressed-textures", "BlobResource")
  @js.native
  /**
    * @param source - the buffer/URL of the texture file
    * @param {PIXI.IBlobOptions} options
    * @param {boolean}[options.autoLoad] - whether to fetch the data immediately;
    *  you can fetch it later via {@link PIXI.BlobResource#load}
    * @param {boolean}[options.width] - the width in pixels.
    * @param {boolean}[options.height] - the height in pixels.
    */
  open class BlobResource ()
    extends typings.pixiCompressedTextures.libResourcesMod.BlobResource {
    def this(source: String) = this()
    def this(source: js.typedarray.Float32Array) = this()
    def this(source: js.typedarray.Uint32Array) = this()
    def this(source: js.typedarray.Uint8Array) = this()
    def this(source: String, options: IBlobOptions) = this()
    def this(source: js.typedarray.Float32Array, options: IBlobOptions) = this()
    def this(source: js.typedarray.Uint32Array, options: IBlobOptions) = this()
    def this(source: js.typedarray.Uint8Array, options: IBlobOptions) = this()
    def this(source: Null, options: IBlobOptions) = this()
  }
  
  @JSImport("@pixi/compressed-textures", "CompressedTextureResource")
  @js.native
  open class CompressedTextureResource protected ()
    extends typings.pixiCompressedTextures.libResourcesMod.CompressedTextureResource {
    /**
      * @param source - the buffer/URL holding the compressed texture data
      * @param options
      * @param {PIXI.INTERNAL_FORMATS} options.format - the compression format
      * @param {number} options.width - the image width in pixels.
      * @param {number} options.height - the image height in pixels.
      * @param {number} [options.level=1] - the mipmap levels stored in the compressed texture, including level 0.
      * @param {number} [options.levelBuffers] - the buffers for each mipmap level. `CompressedTextureResource` can allows you
      *      to pass `null` for `source`, for cases where each level is stored in non-contiguous memory.
      */
    def this(source: String, options: ICompressedTextureResourceOptions) = this()
    def this(source: js.typedarray.Uint32Array, options: ICompressedTextureResourceOptions) = this()
    def this(source: js.typedarray.Uint8Array, options: ICompressedTextureResourceOptions) = this()
  }
  /* static members */
  object CompressedTextureResource {
    
    @JSImport("@pixi/compressed-textures", "CompressedTextureResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Pre-creates buffer views for each mipmap level
      * @private
      * @param buffer -
      * @param format - compression formats
      * @param levels - mipmap levels
      * @param blockWidth -
      * @param blockHeight -
      * @param imageWidth - width of the image in pixels
      * @param imageHeight - height of the image in pixels
      */
    @JSImport("@pixi/compressed-textures", "CompressedTextureResource._createLevelBuffers")
    @js.native
    def _createLevelBuffers: Any = js.native
    inline def _createLevelBuffers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_createLevelBuffers")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the key (to ContextSystem#extensions) for the WebGL extension supporting the compression format
      * @private
      * @param format - the compression format to get the extension for.
      */
    @JSImport("@pixi/compressed-textures", "CompressedTextureResource._formatToExtension")
    @js.native
    def _formatToExtension: Any = js.native
    inline def _formatToExtension_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_formatToExtension")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/compressed-textures", "INTERNAL_FORMATS")
  @js.native
  object INTERNAL_FORMATS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS & Double] = js.native
    
    /* 37488 */ val COMPRESSED_R11_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_R11_EAC & Double = js.native
    
    /* 37490 */ val COMPRESSED_RG11_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RG11_EAC & Double = js.native
    
    /* 37492 */ val COMPRESSED_RGB8_ETC2: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB8_ETC2 & Double = js.native
    
    /* 37494 */ val COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 & Double = js.native
    
    /* 37496 */ val COMPRESSED_RGBA8_ETC2_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA8_ETC2_EAC & Double = js.native
    
    /* 37808 */ val COMPRESSED_RGBA_ASTC_4x4_KHR: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_ASTC_4x4_KHR & Double = js.native
    
    /* 35986 */ val COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL & Double = js.native
    
    /* 34798 */ val COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL & Double = js.native
    
    /* 35843 */ val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG & Double = js.native
    
    /* 35842 */ val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG & Double = js.native
    
    /* 33777 */ val COMPRESSED_RGBA_S3TC_DXT1_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_S3TC_DXT1_EXT & Double = js.native
    
    /* 33778 */ val COMPRESSED_RGBA_S3TC_DXT3_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_S3TC_DXT3_EXT & Double = js.native
    
    /* 33779 */ val COMPRESSED_RGBA_S3TC_DXT5_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_S3TC_DXT5_EXT & Double = js.native
    
    /* 35986 */ val COMPRESSED_RGB_ATC_WEBGL: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_ATC_WEBGL & Double = js.native
    
    /* 36196 */ val COMPRESSED_RGB_ETC1_WEBGL: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_ETC1_WEBGL & Double = js.native
    
    /* 35841 */ val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_PVRTC_2BPPV1_IMG & Double = js.native
    
    /* 35840 */ val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_PVRTC_4BPPV1_IMG & Double = js.native
    
    /* 33776 */ val COMPRESSED_RGB_S3TC_DXT1_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_S3TC_DXT1_EXT & Double = js.native
    
    /* 37489 */ val COMPRESSED_SIGNED_R11_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SIGNED_R11_EAC & Double = js.native
    
    /* 37491 */ val COMPRESSED_SIGNED_RG11_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SIGNED_RG11_EAC & Double = js.native
    
    /* 37497 */ val COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC & Double = js.native
    
    /* 37493 */ val COMPRESSED_SRGB8_ETC2: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB8_ETC2 & Double = js.native
    
    /* 37495 */ val COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 & Double = js.native
    
    /* 35917 */ val COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT & Double = js.native
    
    /* 35918 */ val COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT & Double = js.native
    
    /* 35919 */ val COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT & Double = js.native
    
    /* 35916 */ val COMPRESSED_SRGB_S3TC_DXT1_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB_S3TC_DXT1_EXT & Double = js.native
  }
  
  @JSImport("@pixi/compressed-textures", "detectCompressedTextures")
  @js.native
  val detectCompressedTextures: FormatDetectionParser = js.native
  
  @JSImport("@pixi/compressed-textures", "loadDDS")
  @js.native
  val loadDDS: LoaderParser[Any, Any, Record[String, Any]] = js.native
  
  @JSImport("@pixi/compressed-textures", "loadKTX")
  @js.native
  val loadKTX: LoaderParser[
    Texture[Resource] | js.Array[Texture[Resource]], 
    IBaseTextureOptions[Any], 
    Record[String, Any]
  ] = js.native
  
  inline def parseDDS(arrayBuffer: js.typedarray.ArrayBuffer): js.Array[typings.pixiCompressedTextures.libResourcesMod.CompressedTextureResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDDS")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.pixiCompressedTextures.libResourcesMod.CompressedTextureResource]]
  
  inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer, loadKeyValueData: Boolean): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any], loadKeyValueData.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  
  @JSImport("@pixi/compressed-textures", "resolveCompressedTextureUrl")
  @js.native
  val resolveCompressedTextureUrl: ResolveURLParser = js.native
}
