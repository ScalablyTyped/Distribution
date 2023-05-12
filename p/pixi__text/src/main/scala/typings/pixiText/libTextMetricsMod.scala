package typings.pixiText

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiText.libTextStyleMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTextMetricsMod {
  
  @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics")
  @js.native
  open class TextMetrics protected () extends StObject {
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
      style: TextStyle,
      width: Double,
      height: Double,
      lines: js.Array[String],
      lineWidths: js.Array[Double],
      lineHeight: Double,
      maxLineWidth: Double,
      fontProperties: IFontMetrics
    ) = this()
    
    /** The font properties object from TextMetrics.measureFont. */
    var fontProperties: IFontMetrics = js.native
    
    /** The measured height of the text. */
    var height: Double = js.native
    
    /** The measured line height for this style. */
    var lineHeight: Double = js.native
    
    /** An array of the line widths for each line matched to `lines`. */
    var lineWidths: js.Array[Double] = js.native
    
    /** An array of lines of the text broken by new lines and wrapping is specified in style. */
    var lines: js.Array[String] = js.native
    
    /** The maximum line width for all measured lines. */
    var maxLineWidth: Double = js.native
    
    /** The style that was measured. */
    var style: TextStyle = js.native
    
    /** The text that was measured. */
    var text: String = js.native
    
    /** The measured width of the text. */
    var width: Double = js.native
  }
  /* static members */
  object TextMetrics {
    
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics")
    @js.native
    val ^ : js.Any = js.native
    
    /** Baseline multiplier for calculate font metrics. */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.BASELINE_MULTIPLIER")
    @js.native
    def BASELINE_MULTIPLIER: Double = js.native
    inline def BASELINE_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_MULTIPLIER")(x.asInstanceOf[js.Any])
    
    /** Baseline symbol for calculate font metrics. */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.BASELINE_SYMBOL")
    @js.native
    def BASELINE_SYMBOL: String = js.native
    inline def BASELINE_SYMBOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_SYMBOL")(x.asInstanceOf[js.Any])
    
    /** Height multiplier for setting height of canvas to calculate font metrics. */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.HEIGHT_MULTIPLIER")
    @js.native
    def HEIGHT_MULTIPLIER: Double = js.native
    inline def HEIGHT_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_MULTIPLIER")(x.asInstanceOf[js.Any])
    
    /**
      * String used for calculate font metrics.
      * These characters are all tall to help calculate the height required for text.
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.METRICS_STRING")
    @js.native
    def METRICS_STRING: String = js.native
    inline def METRICS_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.__canvas")
    @js.native
    def __canvas: Any = js.native
    inline def __canvas_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__canvas")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.__context")
    @js.native
    def __context: Any = js.native
    inline def __context_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__context")(x.asInstanceOf[js.Any])
    
    /** Cache of breaking spaces. */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics._breakingSpaces")
    @js.native
    def _breakingSpaces: Any = js.native
    inline def _breakingSpaces_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_breakingSpaces")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics._experimentalLetterSpacingSupported")
    @js.native
    def _experimentalLetterSpacingSupported: js.UndefOr[Boolean] = js.native
    inline def _experimentalLetterSpacingSupported_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_experimentalLetterSpacingSupported")(x.asInstanceOf[js.Any])
    
    /** Cache of {@see PIXI.TextMetrics.FontMetrics} objects. */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics._fonts")
    @js.native
    def _fonts: Any = js.native
    inline def _fonts_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_fonts")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics._measureText")
    @js.native
    def _measureText: Any = js.native
    inline def _measureText_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_measureText")(x.asInstanceOf[js.Any])
    
    /** Cache of new line chars. */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics._newlines")
    @js.native
    def _newlines: Any = js.native
    inline def _newlines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_newlines")(x.asInstanceOf[js.Any])
    
    /**
      * Convienience function for logging each line added during the wordWrap method.
      * @param line    - The line of text to add
      * @param newLine - Add new line character to end
      * @returns A formatted line
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.addLine")
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
      * @param breakWords - The style attr break words
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
      * @returns should collapse
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.collapseNewlines")
    @js.native
    def collapseNewlines: Any = js.native
    inline def collapseNewlines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapseNewlines")(x.asInstanceOf[js.Any])
    
    /**
      * Determines whether we should collapse breaking spaces.
      * @param whiteSpace - The TextStyle property whiteSpace
      * @returns Should collapse
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.collapseSpaces")
    @js.native
    def collapseSpaces: Any = js.native
    inline def collapseSpaces_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapseSpaces")(x.asInstanceOf[js.Any])
    
    /**
      * New rendering behavior for letter-spacing which uses Chrome's new native API. This will
      * lead to more accurate letter-spacing results because it does not try to manually draw
      * each character. However, this Chrome API is experimental and may not serve all cases yet.
      * @see PIXI.TextMetrics.experimentalLetterSpacingSupported
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.experimentalLetterSpacing")
    @js.native
    def experimentalLetterSpacing: Boolean = js.native
    inline def experimentalLetterSpacing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("experimentalLetterSpacing")(x.asInstanceOf[js.Any])
    
    /**
      * Gets & sets the widths of calculated characters in a cache object
      * @param key            - The key
      * @param letterSpacing  - The letter spacing
      * @param cache          - The cache
      * @param context        - The canvas context
      * @returns The from cache.
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.getFromCache")
    @js.native
    def getFromCache: Any = js.native
    inline def getFromCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFromCache")(x.asInstanceOf[js.Any])
    
    /**
      * A Unicode "character", or "grapheme cluster", can be composed of multiple Unicode code points,
      * such as letters with diacritical marks (e.g. `'\\u0065\\u0301'`, letter e with acute)
      * or emojis with modifiers (e.g. `'\\uD83E\\uDDD1\\u200D\\uD83D\\uDCBB'`, technologist).
      * The new `Intl.Segmenter` API in ES2022 can split the string into grapheme clusters correctly. If it is not available,
      * PixiJS will fallback to use the iterator of String, which can only spilt the string into code points.
      * If you want to get full functionality in environments that don't support `Intl.Segmenter` (such as Firefox),
      * you can use other libraries such as [grapheme-splitter]{@link https://www.npmjs.com/package/grapheme-splitter}
      * or [graphemer]{@link https://www.npmjs.com/package/graphemer} to create a polyfill. Since these libraries can be
      * relatively large in size to handle various Unicode grapheme clusters properly, PixiJS won't use them directly.
      */
    inline def graphemeSegmenter(s: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("graphemeSegmenter")(s.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
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
      * @param char - The character
      * @returns True if newline, False otherwise.
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.isNewline")
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
    inline def measureText(text: String, style: TextStyle): TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[TextMetrics]
    inline def measureText(text: String, style: TextStyle, wordWrap: Boolean): TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any])).asInstanceOf[TextMetrics]
    inline def measureText(text: String, style: TextStyle, wordWrap: Boolean, canvas: ICanvas): TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[TextMetrics]
    inline def measureText(text: String, style: TextStyle, wordWrap: Unit, canvas: ICanvas): TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[TextMetrics]
    
    /**
      * Splits a string into words, breaking-spaces and newLine characters
      * @param text - The text
      * @returns A tokenized array
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.tokenize")
    @js.native
    def tokenize: Any = js.native
    inline def tokenize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(x.asInstanceOf[js.Any])
    
    /**
      * Trims breaking whitespaces from string.
      * @param text - The text
      * @returns Trimmed string
      */
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.trimRight")
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
    @JSImport("@pixi/text/lib/TextMetrics", "TextMetrics.wordWrap")
    @js.native
    def wordWrap: Any = js.native
    
    /**
      * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
      *
      * It is called when a token (usually a word) has to be split into separate pieces
      * in order to determine the point to break a word.
      * It must return an array of characters.
      * @param token - The token to split
      * @returns The characters of the token
      * @see TextMetrics.graphemeSegmenter
      */
    inline def wordWrapSplit(token: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("wordWrapSplit")(token.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def wordWrap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Internal return object for {@link PIXI.TextMetrics.measureFont `TextMetrics.measureFont`}.
    * @typedef {object} FontMetrics
    * @property {number} ascent - The ascent distance
    * @property {number} descent - The descent distance
    * @property {number} fontSize - Font size from ascent to descent
    * @memberof PIXI.TextMetrics
    * @private
    */
  /**
    * A number, or a string containing a number.
    * @memberof PIXI
    * @typedef {object} IFontMetrics
    * @property {number} ascent - Font ascent
    * @property {number} descent - Font descent
    * @property {number} fontSize - Font size
    */
  trait IFontMetrics extends StObject {
    
    var ascent: Double
    
    var descent: Double
    
    var fontSize: Double
  }
  object IFontMetrics {
    
    inline def apply(ascent: Double, descent: Double, fontSize: Double): IFontMetrics = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFontMetrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFontMetrics] (val x: Self) extends AnyVal {
      
      inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    }
  }
}
