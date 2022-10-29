package typings.pixiJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiText.libTextMetricsMod.IFontMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "TextMetrics")
@js.native
open class TextMetrics protected ()
  extends typings.pixiText.mod.TextMetrics {
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
  
  @JSImport("pixi.js", "TextMetrics")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "TextMetrics.BASELINE_MULTIPLIER")
  @js.native
  def BASELINE_MULTIPLIER: Double = js.native
  inline def BASELINE_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_MULTIPLIER")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TextMetrics.BASELINE_SYMBOL")
  @js.native
  def BASELINE_SYMBOL: String = js.native
  inline def BASELINE_SYMBOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_SYMBOL")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TextMetrics.HEIGHT_MULTIPLIER")
  @js.native
  def HEIGHT_MULTIPLIER: Double = js.native
  inline def HEIGHT_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_MULTIPLIER")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TextMetrics.METRICS_STRING")
  @js.native
  def METRICS_STRING: String = js.native
  inline def METRICS_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_STRING")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TextMetrics.__canvas")
  @js.native
  def __canvas: Any = js.native
  inline def __canvas_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__canvas")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TextMetrics.__context")
  @js.native
  def __context: Any = js.native
  inline def __context_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__context")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TextMetrics._breakingSpaces")
  @js.native
  def _breakingSpaces: js.Array[Double] = js.native
  inline def _breakingSpaces_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_breakingSpaces")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TextMetrics._fonts")
  @js.native
  def _fonts: StringDictionary[IFontMetrics] = js.native
  inline def _fonts_=(x: StringDictionary[IFontMetrics]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_fonts")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TextMetrics._newlines")
  @js.native
  def _newlines: js.Array[Double] = js.native
  inline def _newlines_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_newlines")(x.asInstanceOf[js.Any])
  
  /**
    * Convienience function for logging each line added during the wordWrap method.
    * @param line    - The line of text to add
    * @param newLine - Add new line character to end
    * @returns A formatted line
    */
  @JSImport("pixi.js", "TextMetrics.addLine")
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
  @JSImport("pixi.js", "TextMetrics.collapseNewlines")
  @js.native
  def collapseNewlines: Any = js.native
  inline def collapseNewlines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapseNewlines")(x.asInstanceOf[js.Any])
  
  /**
    * Determines whether we should collapse breaking spaces.
    * @param whiteSpace - The TextStyle property whiteSpace
    * @returns Should collapse
    */
  @JSImport("pixi.js", "TextMetrics.collapseSpaces")
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
  @JSImport("pixi.js", "TextMetrics.getFromCache")
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
  @JSImport("pixi.js", "TextMetrics.isNewline")
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
  @JSImport("pixi.js", "TextMetrics.tokenize")
  @js.native
  def tokenize: Any = js.native
  inline def tokenize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(x.asInstanceOf[js.Any])
  
  /**
    * Trims breaking whitespaces from string.
    * @param  text - The text
    * @returns Trimmed string
    */
  @JSImport("pixi.js", "TextMetrics.trimRight")
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
  @JSImport("pixi.js", "TextMetrics.wordWrap")
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
