package typings.pixiTextBitmap

import typings.pixiConstants.mod.ALPHA_MODES
import typings.pixiConstants.mod.MIPMAP_MODES
import typings.pixiConstants.mod.SCALE_MODES
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiText.mod.TextStyle
import typings.pixiTextBitmap.anon.PartialITextStyle
import typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData
import typings.pixiUtils.libTypesMod.Dict
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBitmapFontMod {
  
  @JSImport("@pixi/text-bitmap/lib/BitmapFont", "BitmapFont")
  @js.native
  open class BitmapFont protected () extends StObject {
    /**
      * @param data
      * @param textures
      * @param ownsTextures - Setting to `true` will destroy page textures
      *        when the font is uninstalled.
      */
    def this(data: BitmapFontData, textures: js.Array[Texture[Resource]]) = this()
    def this(data: BitmapFontData, textures: Dict[Texture[Resource]]) = this()
    def this(data: BitmapFontData, textures: js.Array[Texture[Resource]], ownsTextures: Boolean) = this()
    def this(data: BitmapFontData, textures: Dict[Texture[Resource]], ownsTextures: Boolean) = this()
    
    /* private */ var _ownsTextures: Any = js.native
    
    /** The map of characters by character code. */
    val chars: Dict[IBitmapFontCharacter] = js.native
    
    /** Remove references to created glyph textures. */
    def destroy(): Unit = js.native
    
    /** The range of the distance field in pixels. */
    val distanceFieldRange: Double = js.native
    
    /** The kind of distance field for this font or "none". */
    val distanceFieldType: String = js.native
    
    /** The name of the font face. */
    val font: String = js.native
    
    /** The line-height of the font face in pixels. */
    val lineHeight: Double = js.native
    
    /** The map of base page textures (i.e., sheets of glyphs). */
    val pageTextures: Dict[Texture[Resource]] = js.native
    
    /** The size of the font face in pixels. */
    val size: Double = js.native
  }
  /* static members */
  object BitmapFont {
    
    @JSImport("@pixi/text-bitmap/lib/BitmapFont", "BitmapFont")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This character set includes all the letters in the alphabet (both lower- and upper- case).
      * @type {string[][]}
      * @example
      * BitmapFont.from('ExampleFont', style, { chars: BitmapFont.ALPHA })
      */
    @JSImport("@pixi/text-bitmap/lib/BitmapFont", "BitmapFont.ALPHA")
    @js.native
    val ALPHA: js.Array[String | js.Array[String]] = js.native
    
    /**
      * This character set is the union of `BitmapFont.ALPHA` and `BitmapFont.NUMERIC`.
      * @type {string[][]}
      */
    @JSImport("@pixi/text-bitmap/lib/BitmapFont", "BitmapFont.ALPHANUMERIC")
    @js.native
    val ALPHANUMERIC: js.Array[String | js.Array[String]] = js.native
    
    /**
      * This character set consists of all the ASCII table.
      * @member {string[][]}
      * @see http://www.asciitable.com/
      */
    @JSImport("@pixi/text-bitmap/lib/BitmapFont", "BitmapFont.ASCII")
    @js.native
    val ASCII: js.Array[js.Array[String]] = js.native
    
    /**
      * This character set includes all decimal digits (from 0 to 9).
      * @type {string[][]}
      * @example
      * BitmapFont.from('ExampleFont', style, { chars: BitmapFont.NUMERIC })
      */
    @JSImport("@pixi/text-bitmap/lib/BitmapFont", "BitmapFont.NUMERIC")
    @js.native
    val NUMERIC: js.Array[js.Array[String]] = js.native
    
    /** Collection of available/installed fonts. */
    @JSImport("@pixi/text-bitmap/lib/BitmapFont", "BitmapFont.available")
    @js.native
    val available: Dict[BitmapFont] = js.native
    
    /**
      * Collection of default options when using `BitmapFont.from`.
      * @property {number} [resolution=1] -
      * @property {number} [textureWidth=512] -
      * @property {number} [textureHeight=512] -
      * @property {number} [padding=4] -
      * @property {string|string[]|string[][]} chars = PIXI.BitmapFont.ALPHANUMERIC
      */
    @JSImport("@pixi/text-bitmap/lib/BitmapFont", "BitmapFont.defaultOptions")
    @js.native
    val defaultOptions: IBitmapFontOptions = js.native
    
    /**
      * Generates a bitmap-font for the given style and character set. This does not support
      * kernings yet. With `style` properties, only the following non-layout properties are used:
      *
      * - {@link PIXI.TextStyle#dropShadow|dropShadow}
      * - {@link PIXI.TextStyle#dropShadowDistance|dropShadowDistance}
      * - {@link PIXI.TextStyle#dropShadowColor|dropShadowColor}
      * - {@link PIXI.TextStyle#dropShadowBlur|dropShadowBlur}
      * - {@link PIXI.TextStyle#dropShadowAngle|dropShadowAngle}
      * - {@link PIXI.TextStyle#fill|fill}
      * - {@link PIXI.TextStyle#fillGradientStops|fillGradientStops}
      * - {@link PIXI.TextStyle#fillGradientType|fillGradientType}
      * - {@link PIXI.TextStyle#fontFamily|fontFamily}
      * - {@link PIXI.TextStyle#fontSize|fontSize}
      * - {@link PIXI.TextStyle#fontVariant|fontVariant}
      * - {@link PIXI.TextStyle#fontWeight|fontWeight}
      * - {@link PIXI.TextStyle#lineJoin|lineJoin}
      * - {@link PIXI.TextStyle#miterLimit|miterLimit}
      * - {@link PIXI.TextStyle#stroke|stroke}
      * - {@link PIXI.TextStyle#strokeThickness|strokeThickness}
      * - {@link PIXI.TextStyle#textBaseline|textBaseline}
      * @param name - The name of the custom font to use with BitmapText.
      * @param textStyle - Style options to render with BitmapFont.
      * @param options - Setup options for font or name of the font.
      * @returns Font generated by style options.
      * @example
      * import { BitmapFont, BitmapText } from 'pixi.js';
      *
      * BitmapFont.from('TitleFont', {
      *     fontFamily: 'Arial',
      *     fontSize: 12,
      *     strokeThickness: 2,
      *     fill: 'purple',
      * });
      *
      * const title = new BitmapText('This is the title', { fontName: 'TitleFont' });
      */
    inline def from(name: String): BitmapFont = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any]).asInstanceOf[BitmapFont]
    inline def from(name: String, textStyle: Unit, options: IBitmapFontOptions): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def from(name: String, textStyle: TextStyle): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def from(name: String, textStyle: TextStyle, options: IBitmapFontOptions): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def from(name: String, textStyle: PartialITextStyle): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def from(name: String, textStyle: PartialITextStyle, options: IBitmapFontOptions): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    
    inline def install(data: String, textures: js.Array[Texture[Resource]]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: String, textures: js.Array[Texture[Resource]], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    /**
      * Register a new bitmap font.
      * @param data - The
      *        characters map that could be provided as xml or raw string.
      * @param textures - List of textures for each page.
      * @param ownsTextures - Set to `true` to destroy page textures
      *        when the font is uninstalled. By default fonts created with
      *        `BitmapFont.from` or from the `BitmapFontLoader` are `true`.
      * @returns {PIXI.BitmapFont} Result font object with font, size, lineHeight
      *         and char fields.
      */
    inline def install(data: String, textures: Texture[Resource]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: String, textures: Texture[Resource], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: String, textures: Dict[Texture[Resource]]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: String, textures: Dict[Texture[Resource]], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: BitmapFontData, textures: js.Array[Texture[Resource]]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: BitmapFontData, textures: js.Array[Texture[Resource]], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: BitmapFontData, textures: Texture[Resource]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: BitmapFontData, textures: Texture[Resource], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: BitmapFontData, textures: Dict[Texture[Resource]]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: BitmapFontData, textures: Dict[Texture[Resource]], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: XMLDocument, textures: js.Array[Texture[Resource]]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: XMLDocument, textures: js.Array[Texture[Resource]], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: XMLDocument, textures: Texture[Resource]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: XMLDocument, textures: Texture[Resource], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: XMLDocument, textures: Dict[Texture[Resource]]): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    inline def install(data: XMLDocument, textures: Dict[Texture[Resource]], ownsTextures: Boolean): BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[BitmapFont]
    
    /**
      * Remove bitmap font by name.
      * @param name - Name of the font to uninstall.
      */
    inline def uninstall(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* Inlined std.Pick<@pixi/core.@pixi/core.IBaseTextureOptions<any>, 'scaleMode' | 'mipmap' | 'anisotropicLevel' | 'alphaMode'> */
  trait BaseOptions extends StObject {
    
    var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
    
    var anisotropicLevel: js.UndefOr[Double] = js.undefined
    
    var mipmap: js.UndefOr[MIPMAP_MODES] = js.undefined
    
    var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      inline def setAlphaMode(value: ALPHA_MODES): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
      
      inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
      
      inline def setAnisotropicLevel(value: Double): Self = StObject.set(x, "anisotropicLevel", value.asInstanceOf[js.Any])
      
      inline def setAnisotropicLevelUndefined: Self = StObject.set(x, "anisotropicLevel", js.undefined)
      
      inline def setMipmap(value: MIPMAP_MODES): Self = StObject.set(x, "mipmap", value.asInstanceOf[js.Any])
      
      inline def setMipmapUndefined: Self = StObject.set(x, "mipmap", js.undefined)
      
      inline def setScaleMode(value: SCALE_MODES): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
      
      inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    }
  }
  
  trait IBitmapFontCharacter extends StObject {
    
    var kerning: Dict[Double]
    
    var page: Double
    
    var texture: Texture[Resource]
    
    var xAdvance: Double
    
    var xOffset: Double
    
    var yOffset: Double
  }
  object IBitmapFontCharacter {
    
    inline def apply(
      kerning: Dict[Double],
      page: Double,
      texture: Texture[Resource],
      xAdvance: Double,
      xOffset: Double,
      yOffset: Double
    ): IBitmapFontCharacter = {
      val __obj = js.Dynamic.literal(kerning = kerning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], xAdvance = xAdvance.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapFontCharacter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontCharacter] (val x: Self) extends AnyVal {
      
      inline def setKerning(value: Dict[Double]): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setTexture(value: Texture[Resource]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setXAdvance(value: Double): Self = StObject.set(x, "xAdvance", value.asInstanceOf[js.Any])
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBitmapFontOptions
    extends StObject
       with BaseOptions {
    
    /**
      * Characters included in the font set. You can also use ranges.
      * For example, `[['a', 'z'], ['A', 'Z'], "!@#$%^&*()~{}[] "]`.
      * Don't forget to include spaces ' ' in your character set!
      * @default PIXI.BitmapFont.ALPHANUMERIC
      */
    var chars: js.UndefOr[String | (js.Array[String | js.Array[String]])] = js.undefined
    
    /**
      * Padding between glyphs on texture atlas. Lower values could mean more visual artifacts
      * and bleeding from other glyphs, larger values increase the space required on the texture.
      * @default 4
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * Render resolution for glyphs.
      * @default 1
      */
    var resolution: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional height of atlas, smaller values to reduce memory.
      * @default 512
      */
    var textureHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional width of atlas, smaller values to reduce memory.
      * @default 512
      */
    var textureWidth: js.UndefOr[Double] = js.undefined
  }
  object IBitmapFontOptions {
    
    inline def apply(): IBitmapFontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBitmapFontOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontOptions] (val x: Self) extends AnyVal {
      
      inline def setChars(value: String | (js.Array[String | js.Array[String]])): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setCharsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "chars", js.Array(value*))
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setTextureHeight(value: Double): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
      
      inline def setTextureHeightUndefined: Self = StObject.set(x, "textureHeight", js.undefined)
      
      inline def setTextureWidth(value: Double): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
      
      inline def setTextureWidthUndefined: Self = StObject.set(x, "textureWidth", js.undefined)
    }
  }
}
