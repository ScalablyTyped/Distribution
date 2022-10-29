package typings.pixiTextBitmap

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiText.mod.TextStyle
import typings.pixiTextBitmap.anon.PartialIBitmapTextStyle
import typings.pixiTextBitmap.anon.PartialITextStyle
import typings.pixiTextBitmap.libBitmapFontMod.IBitmapFontOptions
import typings.pixiUtils.libTypesMod.Dict
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/text-bitmap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/text-bitmap", "BitmapFont")
  @js.native
  open class BitmapFont protected ()
    extends typings.pixiTextBitmap.libBitmapFontMod.BitmapFont {
    /**
      * @param data
      * @param textures
      * @param ownsTextures - Setting to `true` will destroy page textures
      *        when the font is uninstalled.
      */
    def this(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: js.Array[Texture[Resource]]
    ) = this()
    def this(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: Dict[Texture[Resource]]
    ) = this()
    def this(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: js.Array[Texture[Resource]],
      ownsTextures: Boolean
    ) = this()
    def this(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: Dict[Texture[Resource]],
      ownsTextures: Boolean
    ) = this()
  }
  /* static members */
  object BitmapFont {
    
    @JSImport("@pixi/text-bitmap", "BitmapFont")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This character set includes all the letters in the alphabet (both lower- and upper- case).
      * @type {string[][]}
      * @example
      * BitmapFont.from('ExampleFont', style, { chars: BitmapFont.ALPHA })
      */
    @JSImport("@pixi/text-bitmap", "BitmapFont.ALPHA")
    @js.native
    val ALPHA: js.Array[String | js.Array[String]] = js.native
    
    /**
      * This character set is the union of `BitmapFont.ALPHA` and `BitmapFont.NUMERIC`.
      * @type {string[][]}
      */
    @JSImport("@pixi/text-bitmap", "BitmapFont.ALPHANUMERIC")
    @js.native
    val ALPHANUMERIC: js.Array[String | js.Array[String]] = js.native
    
    /**
      * This character set consists of all the ASCII table.
      * @member {string[][]}
      * @see http://www.asciitable.com/
      */
    @JSImport("@pixi/text-bitmap", "BitmapFont.ASCII")
    @js.native
    val ASCII: js.Array[js.Array[String]] = js.native
    
    /**
      * This character set includes all decimal digits (from 0 to 9).
      * @type {string[][]}
      * @example
      * BitmapFont.from('ExampleFont', style, { chars: BitmapFont.NUMERIC })
      */
    @JSImport("@pixi/text-bitmap", "BitmapFont.NUMERIC")
    @js.native
    val NUMERIC: js.Array[js.Array[String]] = js.native
    
    /** Collection of available/installed fonts. */
    @JSImport("@pixi/text-bitmap", "BitmapFont.available")
    @js.native
    val available: Dict[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont] = js.native
    
    /**
      * Collection of default options when using `BitmapFont.from`.
      * @property {number} [resolution=1] -
      * @property {number} [textureWidth=512] -
      * @property {number} [textureHeight=512] -
      * @property {number} [padding=4] -
      * @property {string|string[]|string[][]} chars = PIXI.BitmapFont.ALPHANUMERIC
      */
    @JSImport("@pixi/text-bitmap", "BitmapFont.defaultOptions")
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
    inline def from(name: String): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any]).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def from(name: String, textStyle: Unit, options: IBitmapFontOptions): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def from(name: String, textStyle: TextStyle): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def from(name: String, textStyle: TextStyle, options: IBitmapFontOptions): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def from(name: String, textStyle: PartialITextStyle): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def from(name: String, textStyle: PartialITextStyle, options: IBitmapFontOptions): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    
    inline def install(data: String, textures: js.Array[Texture[Resource]]): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: String, textures: js.Array[Texture[Resource]], ownsTextures: Boolean): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
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
    inline def install(data: String, textures: Texture[Resource]): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: String, textures: Texture[Resource], ownsTextures: Boolean): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: String, textures: Dict[Texture[Resource]]): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: String, textures: Dict[Texture[Resource]], ownsTextures: Boolean): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: js.Array[Texture[Resource]]
    ): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: js.Array[Texture[Resource]],
      ownsTextures: Boolean
    ): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData, textures: Texture[Resource]): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: Texture[Resource],
      ownsTextures: Boolean
    ): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: Dict[Texture[Resource]]
    ): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(
      data: typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData,
      textures: Dict[Texture[Resource]],
      ownsTextures: Boolean
    ): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: XMLDocument, textures: js.Array[Texture[Resource]]): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: XMLDocument, textures: js.Array[Texture[Resource]], ownsTextures: Boolean): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: XMLDocument, textures: Texture[Resource]): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: XMLDocument, textures: Texture[Resource], ownsTextures: Boolean): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: XMLDocument, textures: Dict[Texture[Resource]]): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    inline def install(data: XMLDocument, textures: Dict[Texture[Resource]], ownsTextures: Boolean): typings.pixiTextBitmap.libBitmapFontMod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typings.pixiTextBitmap.libBitmapFontMod.BitmapFont]
    
    /**
      * Remove bitmap font by name.
      * @param name - Name of the font to uninstall.
      */
    inline def uninstall(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@pixi/text-bitmap", "BitmapFontData")
  @js.native
  open class BitmapFontData ()
    extends typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData
  
  @JSImport("@pixi/text-bitmap", "BitmapText")
  @js.native
  open class BitmapText protected ()
    extends typings.pixiTextBitmap.libBitmapTextMod.BitmapText {
    /**
      * @param text - A string that you would like the text to display.
      * @param style - The style parameters.
      * @param {string} style.fontName - The installed BitmapFont name.
      * @param {number} [style.fontSize] - The size of the font in pixels, e.g. 24. If undefined,
      *.     this will default to the BitmapFont size.
      * @param {string} [style.align='left'] - Alignment for multiline text ('left', 'center', 'right' or 'justify'),
      *      does not affect single line text.
      * @param {number} [style.tint=0xFFFFFF] - The tint color.
      * @param {number} [style.letterSpacing=0] - The amount of spacing between letters.
      * @param {number} [style.maxWidth=0] - The max width of the text before line wrapping.
      */
    def this(text: String) = this()
    def this(text: String, style: PartialIBitmapTextStyle) = this()
  }
  /* static members */
  object BitmapText {
    
    @JSImport("@pixi/text-bitmap", "BitmapText")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/text-bitmap", "BitmapText.styleDefaults")
    @js.native
    def styleDefaults: PartialIBitmapTextStyle = js.native
    inline def styleDefaults_=(x: PartialIBitmapTextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/text-bitmap", "TextFormat")
  @js.native
  open class TextFormat ()
    extends typings.pixiTextBitmap.libFormatsMod.TextFormat
  /* static members */
  object TextFormat {
    
    @JSImport("@pixi/text-bitmap", "TextFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert text font data to a javascript object.
      * @param txt - Raw string data to be converted
      * @returns - Parsed font data
      */
    inline def parse(txt: String): typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(txt.asInstanceOf[js.Any]).asInstanceOf[typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData]
    
    /**
      * Check if resource refers to txt font data.
      * @param data
      * @returns - True if resource could be treated as font data, false otherwise.
      */
    inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@pixi/text-bitmap", "XMLFormat")
  @js.native
  open class XMLFormat ()
    extends typings.pixiTextBitmap.libFormatsMod.XMLFormat
  /* static members */
  object XMLFormat {
    
    @JSImport("@pixi/text-bitmap", "XMLFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert the XML into BitmapFontData that we can use.
      * @param xml
      * @returns - Data to use for BitmapFont
      */
    inline def parse(xml: XMLDocument): typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData]
    
    /**
      * Check if resource refers to xml font data.
      * @param data
      * @returns - True if resource could be treated as font data, false otherwise.
      */
    inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@pixi/text-bitmap", "XMLStringFormat")
  @js.native
  open class XMLStringFormat ()
    extends typings.pixiTextBitmap.libFormatsMod.XMLStringFormat
  /* static members */
  object XMLStringFormat {
    
    @JSImport("@pixi/text-bitmap", "XMLStringFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert the text XML into BitmapFontData that we can use.
      * @param xmlTxt
      * @returns - Data to use for BitmapFont
      */
    inline def parse(xmlTxt: String): typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xmlTxt.asInstanceOf[js.Any]).asInstanceOf[typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData]
    
    /**
      * Check if resource refers to text xml font data.
      * @param data
      * @returns - True if resource could be treated as font data, false otherwise.
      */
    inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def autoDetectFormat(data: Any): (/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectFormat")(data.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null]
  
  @JSImport("@pixi/text-bitmap", "loadBitmapFont")
  @js.native
  val loadBitmapFont: LoaderParser[String | typings.pixiTextBitmap.libBitmapFontMod.BitmapFont, Any] = js.native
}
