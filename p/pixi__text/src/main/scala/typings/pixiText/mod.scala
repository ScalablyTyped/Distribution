package typings.pixiText

import org.scalablytyped.runtime.StringDictionary
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiText.anon.PartialITextStyle
import typings.pixiText.libTextMetricsMod.IFontMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/text", "TEXT_GRADIENT")
  @js.native
  object TEXT_GRADIENT extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiText.libConstMod.TEXT_GRADIENT & Double] = js.native
    
    /* 1 */ val LINEAR_HORIZONTAL: typings.pixiText.libConstMod.TEXT_GRADIENT.LINEAR_HORIZONTAL & Double = js.native
    
    /* 0 */ val LINEAR_VERTICAL: typings.pixiText.libConstMod.TEXT_GRADIENT.LINEAR_VERTICAL & Double = js.native
  }
  
  @JSImport("@pixi/text", "Text")
  @js.native
  /**
    * @param text - The string that you would like the text to display
    * @param {object|PIXI.TextStyle} [style] - The style parameters
    * @param canvas - The canvas element for drawing text
    */
  open class Text ()
    extends typings.pixiText.libTextMod.Text {
    def this(text: String) = this()
    def this(text: Double) = this()
    def this(text: String, style: PartialITextStyle) = this()
    def this(text: String, style: typings.pixiText.libTextStyleMod.TextStyle) = this()
    def this(text: Double, style: PartialITextStyle) = this()
    def this(text: Double, style: typings.pixiText.libTextStyleMod.TextStyle) = this()
    def this(text: Unit, style: PartialITextStyle) = this()
    def this(text: Unit, style: typings.pixiText.libTextStyleMod.TextStyle) = this()
    def this(text: String, style: Unit, canvas: ICanvas) = this()
    def this(text: String, style: PartialITextStyle, canvas: ICanvas) = this()
    def this(text: String, style: typings.pixiText.libTextStyleMod.TextStyle, canvas: ICanvas) = this()
    def this(text: Double, style: Unit, canvas: ICanvas) = this()
    def this(text: Double, style: PartialITextStyle, canvas: ICanvas) = this()
    def this(text: Double, style: typings.pixiText.libTextStyleMod.TextStyle, canvas: ICanvas) = this()
    def this(text: Unit, style: Unit, canvas: ICanvas) = this()
    def this(text: Unit, style: PartialITextStyle, canvas: ICanvas) = this()
    def this(text: Unit, style: typings.pixiText.libTextStyleMod.TextStyle, canvas: ICanvas) = this()
  }
  /* static members */
  object Text {
    
    @JSImport("@pixi/text", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * New rendering behavior for letter-spacing which uses Chrome's new native API. This will
      * lead to more accurate letter-spacing results because it does not try to manually draw
      * each character. However, this Chrome API is experimental and may not serve all cases yet.
      */
    @JSImport("@pixi/text", "Text.experimentalLetterSpacing")
    @js.native
    def experimentalLetterSpacing: Boolean = js.native
    inline def experimentalLetterSpacing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("experimentalLetterSpacing")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/text", "TextMetrics")
  @js.native
  open class TextMetrics protected ()
    extends typings.pixiText.libTextMetricsMod.TextMetrics {
    /**
      * @param text - the text that was measured
      * @param style - the style that was measured
      * @param width - the measured width of the text
      * @param height - the measured height of the text
      * @param lines - an array of the lines of text broken by new lines and wrapping if specified in style
      * @param lineWidths - an array of the line widths for each line matched to `lines`
      * @param lineHeight - the measured line height for this style
      * @param maxLineWidth - the maximum line width for all measured lines
      * @param {PIXI.IFontMetrics} fontProperties - the font properties object from TextMetrics.measureFont
      */
    def this(
      text: String,
      style: typings.pixiText.libTextStyleMod.TextStyle,
      width: Double,
      height: Double,
      lines: js.Array[String],
      lineWidths: js.Array[Double],
      lineHeight: Double,
      maxLineWidth: Double,
      fontProperties: IFontMetrics
    ) = this()
  }
  /* static members */
  object TextMetrics {
    
    @JSImport("@pixi/text", "TextMetrics")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/text", "TextMetrics.BASELINE_MULTIPLIER")
    @js.native
    def BASELINE_MULTIPLIER: Double = js.native
    inline def BASELINE_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_MULTIPLIER")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text", "TextMetrics.BASELINE_SYMBOL")
    @js.native
    def BASELINE_SYMBOL: String = js.native
    inline def BASELINE_SYMBOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_SYMBOL")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text", "TextMetrics.HEIGHT_MULTIPLIER")
    @js.native
    def HEIGHT_MULTIPLIER: Double = js.native
    inline def HEIGHT_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_MULTIPLIER")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text", "TextMetrics.METRICS_STRING")
    @js.native
    def METRICS_STRING: String = js.native
    inline def METRICS_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text", "TextMetrics.__canvas")
    @js.native
    def __canvas: Any = js.native
    inline def __canvas_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__canvas")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text", "TextMetrics.__context")
    @js.native
    def __context: Any = js.native
    inline def __context_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__context")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text", "TextMetrics._breakingSpaces")
    @js.native
    def _breakingSpaces: js.Array[Double] = js.native
    inline def _breakingSpaces_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_breakingSpaces")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text", "TextMetrics._fonts")
    @js.native
    def _fonts: StringDictionary[IFontMetrics] = js.native
    inline def _fonts_=(x: StringDictionary[IFontMetrics]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_fonts")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text", "TextMetrics._newlines")
    @js.native
    def _newlines: js.Array[Double] = js.native
    inline def _newlines_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_newlines")(x.asInstanceOf[js.Any])
    
    /**
      * Convienience function for logging each line added during the wordWrap method.
      * @param line    - The line of text to add
      * @param newLine - Add new line character to end
      * @returns A formatted line
      */
    @JSImport("@pixi/text", "TextMetrics.addLine")
    @js.native
    def addLine: Any = js.native
    inline def addLine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addLine")(x.asInstanceOf[js.Any])
    
    /**
      * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
      *
      * It allows one to determine whether a pair of characters
      * should be broken by newlines
      * For example certain characters in CJK langs or numbers.
      * It must return a boolean.
      * @param _char - The character
      * @param _nextChar - The next character
      * @param _token - The token/word the characters are from
      * @param _index - The index in the token of the char
      * @param _breakWords - The style attr break words
      * @returns whether to break word or not
      */
    inline def canBreakChars(_char: String, _nextChar: String, _token: String, _index: Double, _breakWords: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canBreakChars")(_char.asInstanceOf[js.Any], _nextChar.asInstanceOf[js.Any], _token.asInstanceOf[js.Any], _index.asInstanceOf[js.Any], _breakWords.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
      *
      * It allows one to customise which words should break
      * Examples are if the token is CJK or numbers.
      * It must return a boolean.
      * @param _token - The token
      * @param  breakWords - The style attr break words
      * @returns Whether to break word or not
      */
    inline def canBreakWords(_token: String, breakWords: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canBreakWords")(_token.asInstanceOf[js.Any], breakWords.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Clear font metrics in metrics cache.
      * @param {string} [font] - font name. If font name not set then clear cache for all fonts.
      */
    inline def clearMetrics(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMetrics")().asInstanceOf[Unit]
    inline def clearMetrics(font: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMetrics")(font.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Determines whether we should collapse newLine chars.
      * @param whiteSpace - The white space
      * @returns  should collapse
      */
    @JSImport("@pixi/text", "TextMetrics.collapseNewlines")
    @js.native
    def collapseNewlines: Any = js.native
    inline def collapseNewlines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapseNewlines")(x.asInstanceOf[js.Any])
    
    /**
      * Determines whether we should collapse breaking spaces.
      * @param whiteSpace - The TextStyle property whiteSpace
      * @returns Should collapse
      */
    @JSImport("@pixi/text", "TextMetrics.collapseSpaces")
    @js.native
    def collapseSpaces: Any = js.native
    inline def collapseSpaces_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapseSpaces")(x.asInstanceOf[js.Any])
    
    /**
      * Gets & sets the widths of calculated characters in a cache object
      * @param key            - The key
      * @param letterSpacing  - The letter spacing
      * @param cache          - The cache
      * @param context        - The canvas context
      * @returns The from cache.
      */
    @JSImport("@pixi/text", "TextMetrics.getFromCache")
    @js.native
    def getFromCache: Any = js.native
    inline def getFromCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFromCache")(x.asInstanceOf[js.Any])
    
    /**
      * Determines if char is a breaking whitespace.
      *
      * It allows one to determine whether char should be a breaking whitespace
      * For example certain characters in CJK langs or numbers.
      * It must return a boolean.
      * @param char - The character
      * @param [_nextChar] - The next character
      * @returns True if whitespace, False otherwise.
      */
    inline def isBreakingSpace(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBreakingSpace")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isBreakingSpace(char: String, _nextChar: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBreakingSpace")(char.asInstanceOf[js.Any], _nextChar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines if char is a newline.
      * @param  char - The character
      * @returns True if newline, False otherwise.
      */
    @JSImport("@pixi/text", "TextMetrics.isNewline")
    @js.native
    def isNewline: Any = js.native
    inline def isNewline_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNewline")(x.asInstanceOf[js.Any])
    
    /**
      * Calculates the ascent, descent and fontSize of a given font-style
      * @param font - String representing the style of the font
      * @returns Font properties object
      */
    inline def measureFont(font: String): IFontMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("measureFont")(font.asInstanceOf[js.Any]).asInstanceOf[IFontMetrics]
    
    /**
      * Measures the supplied string of text and returns a Rectangle.
      * @param text - The text to measure.
      * @param style - The text style to use for measuring
      * @param wordWrap - Override for if word-wrap should be applied to the text.
      * @param canvas - optional specification of the canvas to use for measuring.
      * @returns Measured width and height of the text.
      */
    inline def measureText(text: String, style: typings.pixiText.libTextStyleMod.TextStyle): typings.pixiText.libTextMetricsMod.TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.pixiText.libTextMetricsMod.TextMetrics]
    inline def measureText(text: String, style: typings.pixiText.libTextStyleMod.TextStyle, wordWrap: Boolean): typings.pixiText.libTextMetricsMod.TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any])).asInstanceOf[typings.pixiText.libTextMetricsMod.TextMetrics]
    inline def measureText(
      text: String,
      style: typings.pixiText.libTextStyleMod.TextStyle,
      wordWrap: Boolean,
      canvas: ICanvas
    ): typings.pixiText.libTextMetricsMod.TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[typings.pixiText.libTextMetricsMod.TextMetrics]
    inline def measureText(text: String, style: typings.pixiText.libTextStyleMod.TextStyle, wordWrap: Unit, canvas: ICanvas): typings.pixiText.libTextMetricsMod.TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[typings.pixiText.libTextMetricsMod.TextMetrics]
    
    /**
      * Splits a string into words, breaking-spaces and newLine characters
      * @param  text - The text
      * @returns  A tokenized array
      */
    @JSImport("@pixi/text", "TextMetrics.tokenize")
    @js.native
    def tokenize: Any = js.native
    inline def tokenize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(x.asInstanceOf[js.Any])
    
    /**
      * Trims breaking whitespaces from string.
      * @param  text - The text
      * @returns Trimmed string
      */
    @JSImport("@pixi/text", "TextMetrics.trimRight")
    @js.native
    def trimRight: Any = js.native
    inline def trimRight_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trimRight")(x.asInstanceOf[js.Any])
    
    /**
      * Applies newlines to a string to have it optimally fit into the horizontal
      * bounds set by the Text object's wordWrapWidth property.
      * @param text - String to apply word wrapping to
      * @param style - the style to use when wrapping
      * @param canvas - optional specification of the canvas to use for measuring.
      * @returns New string with new lines applied where required
      */
    @JSImport("@pixi/text", "TextMetrics.wordWrap")
    @js.native
    def wordWrap: Any = js.native
    
    /**
      * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
      *
      * It is called when a token (usually a word) has to be split into separate pieces
      * in order to determine the point to break a word.
      * It must return an array of characters.
      * @example
      * // Correctly splits emojis, eg "🤪🤪" will result in two element array, each with one emoji.
      * TextMetrics.wordWrapSplit = (token) => [...token];
      * @param  token - The token to split
      * @returns The characters of the token
      */
    inline def wordWrapSplit(token: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("wordWrapSplit")(token.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def wordWrap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/text", "TextStyle")
  @js.native
  /**
    * @param {object} [style] - The style parameters
    * @param {string} [style.align='left'] - Alignment for multiline text ('left', 'center' or 'right'),
    *  does not affect single line text
    * @param {boolean} [style.breakWords=false] - Indicates if lines can be wrapped within words, it
    *  needs wordWrap to be set to true
    * @param {boolean} [style.dropShadow=false] - Set a drop shadow for the text
    * @param {number} [style.dropShadowAlpha=1] - Set alpha for the drop shadow
    * @param {number} [style.dropShadowAngle=Math.PI/6] - Set a angle of the drop shadow
    * @param {number} [style.dropShadowBlur=0] - Set a shadow blur radius
    * @param {string|number} [style.dropShadowColor='black'] - A fill style to be used on the dropshadow e.g 'red', '#00FF00'
    * @param {number} [style.dropShadowDistance=5] - Set a distance of the drop shadow
    * @param {string|string[]|number|number[]|CanvasGradient|CanvasPattern} [style.fill='black'] - A canvas
    *  fillstyle that will be used on the text e.g 'red', '#00FF00'. Can be an array to create a gradient
    *  eg ['#000000','#FFFFFF']
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle|MDN}
    * @param {number} [style.fillGradientType=PIXI.TEXT_GRADIENT.LINEAR_VERTICAL] - If fill is an array of colours
    *  to create a gradient, this can change the type/direction of the gradient. See {@link PIXI.TEXT_GRADIENT}
    * @param {number[]} [style.fillGradientStops] - If fill is an array of colours to create a gradient, this array can set
    * the stop points (numbers between 0 and 1) for the color, overriding the default behaviour of evenly spacing them.
    * @param {string|string[]} [style.fontFamily='Arial'] - The font family
    * @param {number|string} [style.fontSize=26] - The font size (as a number it converts to px, but as a string,
    *  equivalents are '26px','20pt','160%' or '1.6em')
    * @param {string} [style.fontStyle='normal'] - The font style ('normal', 'italic' or 'oblique')
    * @param {string} [style.fontVariant='normal'] - The font variant ('normal' or 'small-caps')
    * @param {string} [style.fontWeight='normal'] - The font weight ('normal', 'bold', 'bolder', 'lighter' and '100',
    *  '200', '300', '400', '500', '600', '700', '800' or '900')
    * @param {number} [style.leading=0] - The space between lines
    * @param {number} [style.letterSpacing=0] - The amount of spacing between letters, default is 0
    * @param {number} [style.lineHeight] - The line height, a number that represents the vertical space that a letter uses
    * @param {string} [style.lineJoin='miter'] - The lineJoin property sets the type of corner created, it can resolve
    *      spiked text issues. Possible values "miter" (creates a sharp corner), "round" (creates a round corner) or "bevel"
    *      (creates a squared corner).
    * @param {number} [style.miterLimit=10] - The miter limit to use when using the 'miter' lineJoin mode. This can reduce
    *      or increase the spikiness of rendered text.
    * @param {number} [style.padding=0] - Occasionally some fonts are cropped. Adding some padding will prevent this from
    *     happening by adding padding to all sides of the text.
    * @param {string|number} [style.stroke='black'] - A canvas fillstyle that will be used on the text stroke
    *  e.g 'blue', '#FCFF00'
    * @param {number} [style.strokeThickness=0] - A number that represents the thickness of the stroke.
    *  Default is 0 (no stroke)
    * @param {boolean} [style.trim=false] - Trim transparent borders
    * @param {string} [style.textBaseline='alphabetic'] - The baseline of the text that is rendered.
    * @param {string} [style.whiteSpace='pre'] - Determines whether newlines & spaces are collapsed or preserved "normal"
    *      (collapse, collapse), "pre" (preserve, preserve) | "pre-line" (preserve, collapse). It needs wordWrap to be set to true
    * @param {boolean} [style.wordWrap=false] - Indicates if word wrap should be used
    * @param {number} [style.wordWrapWidth=100] - The width at which text will wrap, it needs wordWrap to be set to true
    */
  open class TextStyle ()
    extends typings.pixiText.libTextStyleMod.TextStyle {
    def this(style: PartialITextStyle) = this()
  }
}
