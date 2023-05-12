package typings.pixiCompressedTextures

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstMod {
  
  @js.native
  sealed trait INTERNAL_FORMATS extends StObject
  @JSImport("@pixi/compressed-textures/lib/const", "INTERNAL_FORMATS")
  @js.native
  object INTERNAL_FORMATS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[INTERNAL_FORMATS & Double] = js.native
    
    /**
      * @default 0x9270
      */
    @js.native
    sealed trait COMPRESSED_R11_EAC
      extends StObject
         with INTERNAL_FORMATS
    /* 37488 */ val COMPRESSED_R11_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_R11_EAC & Double = js.native
    
    /**
      * @default 0x9272
      */
    @js.native
    sealed trait COMPRESSED_RG11_EAC
      extends StObject
         with INTERNAL_FORMATS
    /* 37490 */ val COMPRESSED_RG11_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RG11_EAC & Double = js.native
    
    /**
      * @default 0x9274
      */
    @js.native
    sealed trait COMPRESSED_RGB8_ETC2
      extends StObject
         with INTERNAL_FORMATS
    /* 37492 */ val COMPRESSED_RGB8_ETC2: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB8_ETC2 & Double = js.native
    
    /**
      * @default 0x9276
      */
    @js.native
    sealed trait COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2
      extends StObject
         with INTERNAL_FORMATS
    /* 37494 */ val COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 & Double = js.native
    
    /**
      * @default 0x9278
      */
    @js.native
    sealed trait COMPRESSED_RGBA8_ETC2_EAC
      extends StObject
         with INTERNAL_FORMATS
    /* 37496 */ val COMPRESSED_RGBA8_ETC2_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA8_ETC2_EAC & Double = js.native
    
    /**
      * @default 0x93B0
      */
    @js.native
    sealed trait COMPRESSED_RGBA_ASTC_4x4_KHR
      extends StObject
         with INTERNAL_FORMATS
    /* 37808 */ val COMPRESSED_RGBA_ASTC_4x4_KHR: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_ASTC_4x4_KHR & Double = js.native
    
    /**
      * @default 0x8C92
      */
    @js.native
    sealed trait COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL
      extends StObject
         with INTERNAL_FORMATS
    /* 35986 */ val COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL & Double = js.native
    
    /**
      * @default 0x87EE
      */
    @js.native
    sealed trait COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL
      extends StObject
         with INTERNAL_FORMATS
    /* 34798 */ val COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL & Double = js.native
    
    /**
      * @default 0x8C03
      */
    @js.native
    sealed trait COMPRESSED_RGBA_PVRTC_2BPPV1_IMG
      extends StObject
         with INTERNAL_FORMATS
    /* 35843 */ val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG & Double = js.native
    
    /**
      * @default 0x8C02
      */
    @js.native
    sealed trait COMPRESSED_RGBA_PVRTC_4BPPV1_IMG
      extends StObject
         with INTERNAL_FORMATS
    /* 35842 */ val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG & Double = js.native
    
    /**
      * @default 0x83F1
      */
    @js.native
    sealed trait COMPRESSED_RGBA_S3TC_DXT1_EXT
      extends StObject
         with INTERNAL_FORMATS
    /* 33777 */ val COMPRESSED_RGBA_S3TC_DXT1_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_S3TC_DXT1_EXT & Double = js.native
    
    /**
      * @default 0x83F2
      */
    @js.native
    sealed trait COMPRESSED_RGBA_S3TC_DXT3_EXT
      extends StObject
         with INTERNAL_FORMATS
    /* 33778 */ val COMPRESSED_RGBA_S3TC_DXT3_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_S3TC_DXT3_EXT & Double = js.native
    
    /**
      * @default 0x83F3
      */
    @js.native
    sealed trait COMPRESSED_RGBA_S3TC_DXT5_EXT
      extends StObject
         with INTERNAL_FORMATS
    /* 33779 */ val COMPRESSED_RGBA_S3TC_DXT5_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGBA_S3TC_DXT5_EXT & Double = js.native
    
    /**
      * @default 0x8C92
      */
    @js.native
    sealed trait COMPRESSED_RGB_ATC_WEBGL
      extends StObject
         with INTERNAL_FORMATS
    /* 35986 */ val COMPRESSED_RGB_ATC_WEBGL: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_ATC_WEBGL & Double = js.native
    
    /**
      * @default 0x8D64
      */
    @js.native
    sealed trait COMPRESSED_RGB_ETC1_WEBGL
      extends StObject
         with INTERNAL_FORMATS
    /* 36196 */ val COMPRESSED_RGB_ETC1_WEBGL: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_ETC1_WEBGL & Double = js.native
    
    /**
      * @default 0x8C01
      */
    @js.native
    sealed trait COMPRESSED_RGB_PVRTC_2BPPV1_IMG
      extends StObject
         with INTERNAL_FORMATS
    /* 35841 */ val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_PVRTC_2BPPV1_IMG & Double = js.native
    
    /**
      * @default 0x8C00
      */
    @js.native
    sealed trait COMPRESSED_RGB_PVRTC_4BPPV1_IMG
      extends StObject
         with INTERNAL_FORMATS
    /* 35840 */ val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_PVRTC_4BPPV1_IMG & Double = js.native
    
    /**
      * @default 0x83F0
      */
    @js.native
    sealed trait COMPRESSED_RGB_S3TC_DXT1_EXT
      extends StObject
         with INTERNAL_FORMATS
    /* 33776 */ val COMPRESSED_RGB_S3TC_DXT1_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_RGB_S3TC_DXT1_EXT & Double = js.native
    
    /**
      * @default 0x9271
      */
    @js.native
    sealed trait COMPRESSED_SIGNED_R11_EAC
      extends StObject
         with INTERNAL_FORMATS
    /* 37489 */ val COMPRESSED_SIGNED_R11_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SIGNED_R11_EAC & Double = js.native
    
    /**
      * @default 0x9273
      */
    @js.native
    sealed trait COMPRESSED_SIGNED_RG11_EAC
      extends StObject
         with INTERNAL_FORMATS
    /* 37491 */ val COMPRESSED_SIGNED_RG11_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SIGNED_RG11_EAC & Double = js.native
    
    /**
      * @default 0x9279
      */
    @js.native
    sealed trait COMPRESSED_SRGB8_ALPHA8_ETC2_EAC
      extends StObject
         with INTERNAL_FORMATS
    /* 37497 */ val COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC & Double = js.native
    
    /**
      * @default 0x9275
      */
    @js.native
    sealed trait COMPRESSED_SRGB8_ETC2
      extends StObject
         with INTERNAL_FORMATS
    /* 37493 */ val COMPRESSED_SRGB8_ETC2: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB8_ETC2 & Double = js.native
    
    /**
      * @default 0x9277
      */
    @js.native
    sealed trait COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2
      extends StObject
         with INTERNAL_FORMATS
    /* 37495 */ val COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 & Double = js.native
    
    /**
      * @default 35917
      */
    @js.native
    sealed trait COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT
      extends StObject
         with INTERNAL_FORMATS
    /* 35917 */ val COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT & Double = js.native
    
    /**
      * @default 35918
      */
    @js.native
    sealed trait COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT
      extends StObject
         with INTERNAL_FORMATS
    /* 35918 */ val COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT & Double = js.native
    
    /**
      * @default 35919
      */
    @js.native
    sealed trait COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT
      extends StObject
         with INTERNAL_FORMATS
    /* 35919 */ val COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT & Double = js.native
    
    /**
      * @default 35916
      */
    @js.native
    sealed trait COMPRESSED_SRGB_S3TC_DXT1_EXT
      extends StObject
         with INTERNAL_FORMATS
    /* 35916 */ val COMPRESSED_SRGB_S3TC_DXT1_EXT: typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS.COMPRESSED_SRGB_S3TC_DXT1_EXT & Double = js.native
  }
}
