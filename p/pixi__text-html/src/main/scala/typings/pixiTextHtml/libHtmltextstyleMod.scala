package typings.pixiTextHtml

import typings.pixiText.anon.PartialITextStyle
import typings.pixiText.libTextStyleMod.TextStyleAlign
import typings.pixiText.libTextStyleMod.TextStyleFill
import typings.pixiText.libTextStyleMod.TextStyleFontStyle
import typings.pixiText.libTextStyleMod.TextStyleFontVariant
import typings.pixiText.libTextStyleMod.TextStyleFontWeight
import typings.pixiText.libTextStyleMod.TextStyleLineJoin
import typings.pixiText.libTextStyleMod.TextStyleTextBaseline
import typings.pixiText.mod.TextStyle
import typings.pixiTextHtml.anon.PartialIHTMLTextStyle
import typings.pixiTextHtml.anon.PartialPickIHTMLFontweigh
import typings.std.FontFace
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHtmltextstyleMod {
  
  @JSImport("@pixi/text-html/lib/HTMLTextStyle", "HTMLTextStyle")
  @js.native
  /**
    * @param style - TextStyle properties to be set on the text. See {@link PIXI.TextStyle.defaultStyle}
    *       for the default values.
    */
  open class HTMLTextStyle () extends TextStyle {
    def this(style: PartialITextStyle) = this()
    
    /** For using custom fonts */
    /* private */ var _fonts: Any = js.native
    
    /** List of internal style rules */
    /* private */ var _overrides: Any = js.native
    
    /** Global rules or stylesheet, useful for creating rules for rendering */
    /* private */ var _stylesheet: Any = js.native
    
    /**
      * Add a style override, this can be any CSS property
      * it will override any built-in style. This is the
      * property and the value as a string (e.g., `color: red`).
      * This will override any other internal style.
      * @param {string} value - CSS style(s) to add.
      * @example
      * style.addOverride('background-color: red');
      */
    def addOverride(value: String*): Unit = js.native
    
    /** Clear the current font */
    def cleanFonts(): Unit = js.native
    
    /** Convert the internal drop-shadow settings to CSS text-shadow */
    /* private */ var dropShadowToCSS: Any = js.native
    
    @JSName("fillGradientStops")
    def fillGradientStops_MHTMLTextStyle: js.Array[Double] = js.native
    
    @JSName("fillGradientType")
    def fillGradientType_MHTMLTextStyle: Double = js.native
    
    /** Track font changes internally */
    /* private */ var fontsDirty: Any = js.native
    
    /**
      * Proving that Safari is the new IE
      * @ignore
      */
    /* private */ def isSafari: Any = js.native
    
    @JSName("leading")
    def leading_MHTMLTextStyle: Double = js.native
    
    @JSName("lineJoin")
    def lineJoin_MHTMLTextStyle: TextStyleLineJoin = js.native
    
    /**
      * Because of how HTMLText renders, fonts need to be imported
      * @param url
      * @param options
      */
    def loadFont(url: String): js.Promise[Unit] = js.native
    def loadFont(url: String, options: PartialPickIHTMLFontweigh): js.Promise[Unit] = js.native
    
    @JSName("miterLimit")
    def miterLimit_MHTMLTextStyle: Double = js.native
    
    /**
      * Convert numerical colors into hex-strings
      * @param color
      */
    /* private */ var normalizeColor: Any = js.native
    
    /**
      * Called after the image is loaded but before drawing to the canvas.
      * Mostly used to handle Safari's font loading bug.
      * @ignore
      */
    def onBeforeDraw(): js.Promise[Unit] = js.native
    
    /**
      * Remove any overrides that match the value.
      * @param {string} value - CSS style to remove.
      * @example
      * style.removeOverride('background-color: red');
      */
    def removeOverride(value: String*): Unit = js.native
    
    /** Internal stylesheet contents, useful for creating rules for rendering */
    def stylesheet: String = js.native
    def stylesheet_=(value: String): Unit = js.native
    
    @JSName("textBaseline")
    def textBaseline_MHTMLTextStyle: TextStyleTextBaseline = js.native
    
    /**
      * Internally converts all of the style properties into CSS equivalents.
      * @param scale
      * @returns The CSS style string, for setting `style` property of root HTMLElement.
      */
    def toCSS(scale: Double): String = js.native
    
    /** Get the font CSS styles from the loaded font, If available. */
    def toGlobalCSS(): String = js.native
    
    @JSName("trim")
    def trim_MHTMLTextStyle: Boolean = js.native
  }
  /* static members */
  object HTMLTextStyle {
    
    @JSImport("@pixi/text-html/lib/HTMLTextStyle", "HTMLTextStyle")
    @js.native
    val ^ : js.Any = js.native
    
    /** The collection of installed fonts */
    @JSImport("@pixi/text-html/lib/HTMLTextStyle", "HTMLTextStyle.availableFonts")
    @js.native
    def availableFonts: Record[String, IHTMLFont] = js.native
    inline def availableFonts_=(x: Record[String, IHTMLFont]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableFonts")(x.asInstanceOf[js.Any])
    
    /**
      * List of default options, these are largely the same as TextStyle,
      * with the exception of whiteSpace, which is set to 'normal' by default.
      */
    @JSImport("@pixi/text-html/lib/HTMLTextStyle", "HTMLTextStyle.defaultOptions")
    @js.native
    val defaultOptions: IHTMLTextStyle = js.native
    
    /**
      * Convert a TextStyle to HTMLTextStyle
      * @param originalStyle
      * @example
      * import {TextStyle } from 'pixi.js';
      * import {HTMLTextStyle} from '@pixi/text-html';
      * const style = new TextStyle();
      * const htmlStyle = HTMLTextStyle.from(style);
      */
    inline def from(originalStyle: TextStyle): HTMLTextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(originalStyle.asInstanceOf[js.Any]).asInstanceOf[HTMLTextStyle]
    inline def from(originalStyle: PartialIHTMLTextStyle): HTMLTextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(originalStyle.asInstanceOf[js.Any]).asInstanceOf[HTMLTextStyle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiTextHtml.pixiTextHtmlStrings.normal
    - typings.pixiTextHtml.pixiTextHtmlStrings.pre
    - typings.pixiTextHtml.pixiTextHtmlStrings.`pre-line`
    - typings.pixiTextHtml.pixiTextHtmlStrings.nowrap
    - typings.pixiTextHtml.pixiTextHtmlStrings.`pre-wrap`
  */
  trait HTMLTextStyleWhiteSpace extends StObject
  object HTMLTextStyleWhiteSpace {
    
    inline def normal: typings.pixiTextHtml.pixiTextHtmlStrings.normal = "normal".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.normal]
    
    inline def nowrap: typings.pixiTextHtml.pixiTextHtmlStrings.nowrap = "nowrap".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.nowrap]
    
    inline def pre: typings.pixiTextHtml.pixiTextHtmlStrings.pre = "pre".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.pre]
    
    inline def `pre-line`: typings.pixiTextHtml.pixiTextHtmlStrings.`pre-line` = "pre-line".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.`pre-line`]
    
    inline def `pre-wrap`: typings.pixiTextHtml.pixiTextHtmlStrings.`pre-wrap` = "pre-wrap".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.`pre-wrap`]
  }
  
  trait IHTMLFont extends StObject {
    
    /** Base64 string for font */
    var dataSrc: String
    
    /** Family name of font */
    var family: String
    
    /** FontFace installed in the document */
    var fontFace: FontFace | Null
    
    /** User-supplied URL request */
    var originalUrl: String
    
    /** Reference counter */
    var refs: Double
    
    /** Blob-based URL for font */
    var src: String
    
    /** Style of the font */
    var style: TextStyleFontStyle
    
    /** Weight of the font */
    var weight: TextStyleFontWeight
  }
  object IHTMLFont {
    
    inline def apply(
      dataSrc: String,
      family: String,
      originalUrl: String,
      refs: Double,
      src: String,
      style: TextStyleFontStyle,
      weight: TextStyleFontWeight
    ): IHTMLFont = {
      val __obj = js.Dynamic.literal(dataSrc = dataSrc.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], originalUrl = originalUrl.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], fontFace = null)
      __obj.asInstanceOf[IHTMLFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHTMLFont] (val x: Self) extends AnyVal {
      
      inline def setDataSrc(value: String): Self = StObject.set(x, "dataSrc", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFontFace(value: FontFace): Self = StObject.set(x, "fontFace", value.asInstanceOf[js.Any])
      
      inline def setFontFaceNull: Self = StObject.set(x, "fontFace", null)
      
      inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
      
      inline def setRefs(value: Double): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: TextStyleFontStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: TextStyleFontWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<@pixi/text.@pixi/text.ITextStyle, @pixi/text-html.@pixi/text-html/lib/HTMLTextStyle.ITextStyleIgnore> */
  trait IHTMLTextStyle extends StObject {
    
    var align: TextStyleAlign
    
    var breakWords: Boolean
    
    var dropShadow: Boolean
    
    var dropShadowAlpha: Double
    
    var dropShadowAngle: Double
    
    var dropShadowBlur: Double
    
    var dropShadowColor: String | Double
    
    var dropShadowDistance: Double
    
    var fill: TextStyleFill
    
    var fontFamily: String | js.Array[String]
    
    var fontSize: Double | String
    
    var fontStyle: TextStyleFontStyle
    
    var fontVariant: TextStyleFontVariant
    
    var fontWeight: TextStyleFontWeight
    
    var letterSpacing: Double
    
    var lineHeight: Double
    
    var padding: Double
    
    var stroke: String | Double
    
    var strokeThickness: Double
    
    /** White-space with expanded options. */
    var whiteSpace: HTMLTextStyleWhiteSpace
    
    var wordWrap: Boolean
    
    var wordWrapWidth: Double
  }
  object IHTMLTextStyle {
    
    inline def apply(
      align: TextStyleAlign,
      breakWords: Boolean,
      dropShadow: Boolean,
      dropShadowAlpha: Double,
      dropShadowAngle: Double,
      dropShadowBlur: Double,
      dropShadowColor: String | Double,
      dropShadowDistance: Double,
      fill: TextStyleFill,
      fontFamily: String | js.Array[String],
      fontSize: Double | String,
      fontStyle: TextStyleFontStyle,
      fontVariant: TextStyleFontVariant,
      fontWeight: TextStyleFontWeight,
      letterSpacing: Double,
      lineHeight: Double,
      padding: Double,
      stroke: String | Double,
      strokeThickness: Double,
      whiteSpace: HTMLTextStyleWhiteSpace,
      wordWrap: Boolean,
      wordWrapWidth: Double
    ): IHTMLTextStyle = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], breakWords = breakWords.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], dropShadowAlpha = dropShadowAlpha.asInstanceOf[js.Any], dropShadowAngle = dropShadowAngle.asInstanceOf[js.Any], dropShadowBlur = dropShadowBlur.asInstanceOf[js.Any], dropShadowColor = dropShadowColor.asInstanceOf[js.Any], dropShadowDistance = dropShadowDistance.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontVariant = fontVariant.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeThickness = strokeThickness.asInstanceOf[js.Any], whiteSpace = whiteSpace.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapWidth = wordWrapWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHTMLTextStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHTMLTextStyle] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: TextStyleAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setBreakWords(value: Boolean): Self = StObject.set(x, "breakWords", value.asInstanceOf[js.Any])
      
      inline def setDropShadow(value: Boolean): Self = StObject.set(x, "dropShadow", value.asInstanceOf[js.Any])
      
      inline def setDropShadowAlpha(value: Double): Self = StObject.set(x, "dropShadowAlpha", value.asInstanceOf[js.Any])
      
      inline def setDropShadowAngle(value: Double): Self = StObject.set(x, "dropShadowAngle", value.asInstanceOf[js.Any])
      
      inline def setDropShadowBlur(value: Double): Self = StObject.set(x, "dropShadowBlur", value.asInstanceOf[js.Any])
      
      inline def setDropShadowColor(value: String | Double): Self = StObject.set(x, "dropShadowColor", value.asInstanceOf[js.Any])
      
      inline def setDropShadowDistance(value: Double): Self = StObject.set(x, "dropShadowDistance", value.asInstanceOf[js.Any])
      
      inline def setFill(value: TextStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillVarargs(value: (Double | String)*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setFontFamily(value: String | js.Array[String]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyVarargs(value: String*): Self = StObject.set(x, "fontFamily", js.Array(value*))
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontStyle(value: TextStyleFontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontVariant(value: TextStyleFontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: TextStyleFontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpace(value: HTMLTextStyleWhiteSpace): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapWidth(value: Double): Self = StObject.set(x, "wordWrapWidth", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiTextHtml.pixiTextHtmlStrings.whiteSpace
    - typings.pixiTextHtml.pixiTextHtmlStrings.fillGradientStops
    - typings.pixiTextHtml.pixiTextHtmlStrings.fillGradientType
    - typings.pixiTextHtml.pixiTextHtmlStrings.miterLimit
    - typings.pixiTextHtml.pixiTextHtmlStrings.textBaseline
    - typings.pixiTextHtml.pixiTextHtmlStrings.trim
    - typings.pixiTextHtml.pixiTextHtmlStrings.leading
    - typings.pixiTextHtml.pixiTextHtmlStrings.lineJoin
  */
  trait ITextStyleIgnore extends StObject
  object ITextStyleIgnore {
    
    inline def fillGradientStops: typings.pixiTextHtml.pixiTextHtmlStrings.fillGradientStops = "fillGradientStops".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.fillGradientStops]
    
    inline def fillGradientType: typings.pixiTextHtml.pixiTextHtmlStrings.fillGradientType = "fillGradientType".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.fillGradientType]
    
    inline def leading: typings.pixiTextHtml.pixiTextHtmlStrings.leading = "leading".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.leading]
    
    inline def lineJoin: typings.pixiTextHtml.pixiTextHtmlStrings.lineJoin = "lineJoin".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.lineJoin]
    
    inline def miterLimit: typings.pixiTextHtml.pixiTextHtmlStrings.miterLimit = "miterLimit".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.miterLimit]
    
    inline def textBaseline: typings.pixiTextHtml.pixiTextHtmlStrings.textBaseline = "textBaseline".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.textBaseline]
    
    inline def trim: typings.pixiTextHtml.pixiTextHtmlStrings.trim = "trim".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.trim]
    
    inline def whiteSpace: typings.pixiTextHtml.pixiTextHtmlStrings.whiteSpace = "whiteSpace".asInstanceOf[typings.pixiTextHtml.pixiTextHtmlStrings.whiteSpace]
  }
}
