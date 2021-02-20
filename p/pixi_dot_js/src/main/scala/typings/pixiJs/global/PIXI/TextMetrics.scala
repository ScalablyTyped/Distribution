package typings.pixiJs.global.PIXI

import typings.pixiJs.PIXI.IFontMetrics
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  extends typings.pixiJs.PIXI.TextMetrics {
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
  @scala.inline
  def BASELINE_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_MULTIPLIER")(x.asInstanceOf[js.Any])
  
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
  @scala.inline
  def BASELINE_SYMBOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_SYMBOL")(x.asInstanceOf[js.Any])
  
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
  @scala.inline
  def METRICS_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_STRING")(x.asInstanceOf[js.Any])
  
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
  @JSGlobal("PIXI.TextMetrics.canBreakChars")
  @js.native
  def canBreakChars(char: String, nextChar: String, token: String, index: Double, breakWords: Boolean): Boolean = js.native
  
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
  @JSGlobal("PIXI.TextMetrics.canBreakWords")
  @js.native
  def canBreakWords(token: String, breakWords: Boolean): Boolean = js.native
  
  /**
    * Clear font metrics in metrics cache.
    *
    * @static
    * @param {string} [font] - font name. If font name not set then clear cache for all fonts.
    */
  /* static member */
  @JSGlobal("PIXI.TextMetrics.clearMetrics")
  @js.native
  def clearMetrics(): Unit = js.native
  @JSGlobal("PIXI.TextMetrics.clearMetrics")
  @js.native
  def clearMetrics(font: String): Unit = js.native
  
  /**
    * Calculates the ascent, descent and fontSize of a given font-style
    *
    * @static
    * @param {string} font - String representing the style of the font
    * @return {PIXI.IFontMetrics} Font properties object
    */
  /* static member */
  @JSGlobal("PIXI.TextMetrics.measureFont")
  @js.native
  def measureFont(font: String): IFontMetrics = js.native
  
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
  @JSGlobal("PIXI.TextMetrics.measureText")
  @js.native
  def measureText(text: String, style: typings.pixiJs.PIXI.TextStyle): typings.pixiJs.PIXI.TextMetrics = js.native
  @JSGlobal("PIXI.TextMetrics.measureText")
  @js.native
  def measureText(
    text: String,
    style: typings.pixiJs.PIXI.TextStyle,
    wordWrap: js.UndefOr[scala.Nothing],
    canvas: HTMLCanvasElement
  ): typings.pixiJs.PIXI.TextMetrics = js.native
  @JSGlobal("PIXI.TextMetrics.measureText")
  @js.native
  def measureText(text: String, style: typings.pixiJs.PIXI.TextStyle, wordWrap: Boolean): typings.pixiJs.PIXI.TextMetrics = js.native
  @JSGlobal("PIXI.TextMetrics.measureText")
  @js.native
  def measureText(text: String, style: typings.pixiJs.PIXI.TextStyle, wordWrap: Boolean, canvas: HTMLCanvasElement): typings.pixiJs.PIXI.TextMetrics = js.native
  
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
  @JSGlobal("PIXI.TextMetrics.wordWrapSplit")
  @js.native
  def wordWrapSplit(token: String): js.Array[String] = js.native
}
