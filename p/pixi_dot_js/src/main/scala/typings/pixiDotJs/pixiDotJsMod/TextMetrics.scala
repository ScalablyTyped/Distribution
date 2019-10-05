package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXI.FontMetrics
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "TextMetrics")
@js.native
class TextMetrics protected ()
  extends typings.pixiDotJs.PIXI.TextMetrics {
  def this(
    text: String,
    style: typings.pixiDotJs.PIXI.TextStyle,
    width: Double,
    height: Double,
    lines: js.Array[Double],
    lineWidths: js.Array[Double],
    lineHeight: Double,
    maxLineWidth: Double,
    fontProperties: js.Any
  ) = this()
}

/* static members */
@JSImport("pixi.js", "TextMetrics")
@js.native
object TextMetrics extends js.Object {
  var BASELINE_MULTIPLIER: Double = js.native
  var BASELINE_SYMBOL: String = js.native
  var METRICS_STRING: String = js.native
  var _breakingSpaces: js.Array[Double] = js.native
  var _canvas: HTMLCanvasElement = js.native
  var _context: CanvasRenderingContext2D = js.native
  var _fonts: FontMetrics = js.native
  var _newLines: js.Array[Double] = js.native
  def addLine(line: String): String = js.native
  def addLine(line: String, newLine: Boolean): String = js.native
  def canBreakChars(char: String, nextChar: String, token: String, index: Double): Boolean = js.native
  def canBreakChars(char: String, nextChar: String, token: String, index: Double, breakWords: Boolean): Boolean = js.native
  def canBreakWords(): Boolean = js.native
  def canBreakWords(token: String): Boolean = js.native
  def canBreakWords(token: String, breakWords: Boolean): Boolean = js.native
  def clearMetrics(font: String): Unit = js.native
  def collapseNewlines(): Boolean = js.native
  def collapseNewlines(whiteSpace: String): Boolean = js.native
  def collapseSpaces(): Boolean = js.native
  def collapseSpaces(whiteSpace: String): Boolean = js.native
  def getFromCache(key: String, letterSpacing: Double, cache: js.Any, context: CanvasRenderingContext2D): Double = js.native
  def isBreakingSpace(): Boolean = js.native
  def isBreakingSpace(char: String): Boolean = js.native
  def isNewline(): Boolean = js.native
  def isNewline(char: String): Boolean = js.native
  def measureFont(font: String): FontMetrics = js.native
  def measureText(text: String, style: typings.pixiDotJs.PIXI.TextStyle): typings.pixiDotJs.PIXI.TextMetrics = js.native
  def measureText(text: String, style: typings.pixiDotJs.PIXI.TextStyle, wordWrap: Boolean): typings.pixiDotJs.PIXI.TextMetrics = js.native
  def measureText(
    text: String,
    style: typings.pixiDotJs.PIXI.TextStyle,
    wordWrap: Boolean,
    canvas: HTMLCanvasElement
  ): typings.pixiDotJs.PIXI.TextMetrics = js.native
  def tokenize(): js.Array[String] = js.native
  def tokenize(text: String): js.Array[String] = js.native
  def trimRight(): String = js.native
  def trimRight(text: String): String = js.native
  def wordWrap(text: String, style: typings.pixiDotJs.PIXI.TextStyle): String = js.native
  def wordWrap(text: String, style: typings.pixiDotJs.PIXI.TextStyle, canvas: HTMLCanvasElement): String = js.native
}

