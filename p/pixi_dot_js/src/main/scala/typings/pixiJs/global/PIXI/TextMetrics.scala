package typings.pixiJs.global.PIXI

import typings.pixiJs.PIXI.IFontMetrics
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TextMetrics object represents the measurement of a block of text with a specified style.
  *
  * ```js
  * let style = new PIXI.TextStyle({fontFamily : 'Arial', fontSize: 24, fill : 0xff1010, align : 'center'})
  * let textMetrics = PIXI.TextMetrics.measureText('Your text', style)
  * ```
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.TextMetrics")
@js.native
class TextMetrics protected ()
  extends StObject
     with typings.pixiJs.PIXI.TextMetrics {
  def this(
    text: String,
    style: typings.pixiJs.PIXI.TextStyle,
    width: Double,
    height: Double,
    lines: js.Array[String],
    lineWidths: js.Array[Double],
    lineHeight: Double,
    maxLineWidth: Double,
    fontProperties: js.Any
  ) = this()
  
  /**
    * The font properties object from TextMetrics.measureFont
    *
    * @member {PIXI.IFontMetrics} PIXI.TextMetrics#fontProperties
    */
  /* CompleteClass */
  var fontProperties: IFontMetrics = js.native
  
  /**
    * The measured height of the text
    *
    * @member {number} PIXI.TextMetrics#height
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * The measured line height for this style
    *
    * @member {number} PIXI.TextMetrics#lineHeight
    */
  /* CompleteClass */
  var lineHeight: Double = js.native
  
  /**
    * An array of the line widths for each line matched to `lines`
    *
    * @member {number[]} PIXI.TextMetrics#lineWidths
    */
  /* CompleteClass */
  var lineWidths: js.Array[Double] = js.native
  
  /**
    * An array of lines of the text broken by new lines and wrapping is specified in style
    *
    * @member {string[]} PIXI.TextMetrics#lines
    */
  /* CompleteClass */
  var lines: js.Array[String] = js.native
  
  /**
    * The maximum line width for all measured lines
    *
    * @member {number} PIXI.TextMetrics#maxLineWidth
    */
  /* CompleteClass */
  var maxLineWidth: Double = js.native
  
  /**
    * The style that was measured
    *
    * @member {PIXI.TextStyle} PIXI.TextMetrics#style
    */
  /* CompleteClass */
  var style: typings.pixiJs.PIXI.TextStyle = js.native
  
  /**
    * The text that was measured
    *
    * @member {string} PIXI.TextMetrics#text
    */
  /* CompleteClass */
  var text: String = js.native
  
  /**
    * The measured width of the text
    *
    * @member {number} PIXI.TextMetrics#width
    */
  /* CompleteClass */
  var width: Double = js.native
}
object TextMetrics {
  
  @JSGlobal("PIXI.TextMetrics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Baseline multiplier for calculate font metrics.
    *
    * @static
    * @memberof PIXI.TextMetrics
    * @name BASELINE_MULTIPLIER
    * @type {number}
    * @default 1.4
    */
  /* static member */
  @JSGlobal("PIXI.TextMetrics.BASELINE_MULTIPLIER")
  @js.native
  def BASELINE_MULTIPLIER: Double = js.native
  inline def BASELINE_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_MULTIPLIER")(x.asInstanceOf[js.Any])
  
  /**
    * Baseline symbol for calculate font metrics.
    *
    * @static
    * @memberof PIXI.TextMetrics
    * @name BASELINE_SYMBOL
    * @type {string}
    * @default M
    */
  /* static member */
  @JSGlobal("PIXI.TextMetrics.BASELINE_SYMBOL")
  @js.native
  def BASELINE_SYMBOL: String = js.native
  inline def BASELINE_SYMBOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_SYMBOL")(x.asInstanceOf[js.Any])
  
  /**
    * String used for calculate font metrics.
    * These characters are all tall to help calculate the height required for text.
    *
    * @static
    * @memberof PIXI.TextMetrics
    * @name METRICS_STRING
    * @type {string}
    * @default |ÉqÅ
    */
  /* static member */
  @JSGlobal("PIXI.TextMetrics.METRICS_STRING")
  @js.native
  def METRICS_STRING: String = js.native
  inline def METRICS_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_STRING")(x.asInstanceOf[js.Any])
  
  /**
    * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
    *
    * It allows one to determine whether a pair of characters
    * should be broken by newlines
    * For example certain characters in CJK langs or numbers.
    * It must return a boolean.
    *
    * @param  {string}  char        - The character
    * @param  {string}  nextChar    - The next character
    * @param  {string}  token       - The token/word the characters are from
    * @param  {number}  index       - The index in the token of the char
    * @param  {boolean}  breakWords - The style attr break words
    * @return {boolean} whether to break word or not
    */
  /* static member */
  inline def canBreakChars(char: String, nextChar: String, token: String, index: Double, breakWords: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canBreakChars")(char.asInstanceOf[js.Any], nextChar.asInstanceOf[js.Any], token.asInstanceOf[js.Any], index.asInstanceOf[js.Any], breakWords.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
    *
    * It allows one to customise which words should break
    * Examples are if the token is CJK or numbers.
    * It must return a boolean.
    *
    * @param  {string}  token       - The token
    * @param  {boolean}  breakWords - The style attr break words
    * @return {boolean} whether to break word or not
    */
  /* static member */
  inline def canBreakWords(token: String, breakWords: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canBreakWords")(token.asInstanceOf[js.Any], breakWords.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Clear font metrics in metrics cache.
    *
    * @static
    * @param {string} [font] - font name. If font name not set then clear cache for all fonts.
    */
  /* static member */
  inline def clearMetrics(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMetrics")().asInstanceOf[Unit]
  inline def clearMetrics(font: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMetrics")(font.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Calculates the ascent, descent and fontSize of a given font-style
    *
    * @static
    * @param {string} font - String representing the style of the font
    * @return {PIXI.IFontMetrics} Font properties object
    */
  /* static member */
  inline def measureFont(font: String): IFontMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("measureFont")(font.asInstanceOf[js.Any]).asInstanceOf[IFontMetrics]
  
  /**
    * Measures the supplied string of text and returns a Rectangle.
    *
    * @param {string} text - the text to measure.
    * @param {PIXI.TextStyle} style - the text style to use for measuring
    * @param {boolean} [wordWrap] - optional override for if word-wrap should be applied to the text.
    * @param {HTMLCanvasElement} [canvas] - optional specification of the canvas to use for measuring.
    * @return {PIXI.TextMetrics} measured width and height of the text.
    */
  /* static member */
  inline def measureText(text: String, style: typings.pixiJs.PIXI.TextStyle): typings.pixiJs.PIXI.TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.TextMetrics]
  inline def measureText(text: String, style: typings.pixiJs.PIXI.TextStyle, wordWrap: Boolean): typings.pixiJs.PIXI.TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.TextMetrics]
  inline def measureText(text: String, style: typings.pixiJs.PIXI.TextStyle, wordWrap: Boolean, canvas: HTMLCanvasElement): typings.pixiJs.PIXI.TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.TextMetrics]
  inline def measureText(text: String, style: typings.pixiJs.PIXI.TextStyle, wordWrap: Unit, canvas: HTMLCanvasElement): typings.pixiJs.PIXI.TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.TextMetrics]
  
  /**
    * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
    *
    * It is called when a token (usually a word) has to be split into separate pieces
    * in order to determine the point to break a word.
    * It must return an array of characters.
    *
    * @example
    * // Correctly splits emojis, eg "🤪🤪" will result in two element array, each with one emoji.
    * TextMetrics.wordWrapSplit = (token) => [...token];
    *
    * @param  {string}  token - The token to split
    * @return {string[]} The characters of the token
    */
  /* static member */
  inline def wordWrapSplit(token: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("wordWrapSplit")(token.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
