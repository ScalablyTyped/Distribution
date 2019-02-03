package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "TextMetrics")
@js.native
class TextMetrics protected ()
  extends pixiDotJsLib.PIXINs.TextMetrics {
  def this(text: java.lang.String, style: pixiDotJsLib.PIXINs.TextStyle, width: scala.Double, height: scala.Double, lines: js.Array[scala.Double], lineWidths: js.Array[scala.Double], lineHeight: scala.Double, maxLineWidth: scala.Double, fontProperties: js.Any) = this()
}

/* static members */
@JSImport("pixi.js", "TextMetrics")
@js.native
object TextMetrics extends js.Object {
  var BASELINE_MULTIPLIER: scala.Double = js.native
  var BASELINE_SYMBOL: java.lang.String = js.native
  var METRICS_STRING: java.lang.String = js.native
  var _breakingSpaces: js.Array[scala.Double] = js.native
  var _canvas: stdLib.HTMLCanvasElement = js.native
  var _context: stdLib.CanvasRenderingContext2D = js.native
  var _fonts: pixiDotJsLib.PIXINs.FontMetrics = js.native
  var _newLines: js.Array[scala.Double] = js.native
  def addLine(line: java.lang.String): java.lang.String = js.native
  def addLine(line: java.lang.String, newLine: scala.Boolean): java.lang.String = js.native
  def canBreakChars(char: java.lang.String, nextChar: java.lang.String, token: java.lang.String, index: scala.Double): scala.Boolean = js.native
  def canBreakChars(
    char: java.lang.String,
    nextChar: java.lang.String,
    token: java.lang.String,
    index: scala.Double,
    breakWords: scala.Boolean
  ): scala.Boolean = js.native
  def canBreakWords(): scala.Boolean = js.native
  def canBreakWords(token: java.lang.String): scala.Boolean = js.native
  def canBreakWords(token: java.lang.String, breakWords: scala.Boolean): scala.Boolean = js.native
  def clearMetrics(font: java.lang.String): scala.Unit = js.native
  def collapseNewlines(): scala.Boolean = js.native
  def collapseNewlines(whiteSpace: java.lang.String): scala.Boolean = js.native
  def collapseSpaces(): scala.Boolean = js.native
  def collapseSpaces(whiteSpace: java.lang.String): scala.Boolean = js.native
  def getFromCache(
    key: java.lang.String,
    letterSpacing: scala.Double,
    cache: js.Any,
    context: stdLib.CanvasRenderingContext2D
  ): scala.Double = js.native
  def isBreakingSpace(): scala.Boolean = js.native
  def isBreakingSpace(char: java.lang.String): scala.Boolean = js.native
  def isNewline(): scala.Boolean = js.native
  def isNewline(char: java.lang.String): scala.Boolean = js.native
  def measureFont(font: java.lang.String): pixiDotJsLib.PIXINs.FontMetrics = js.native
  def measureText(text: java.lang.String, style: pixiDotJsLib.PIXINs.TextStyle): pixiDotJsLib.PIXINs.TextMetrics = js.native
  def measureText(text: java.lang.String, style: pixiDotJsLib.PIXINs.TextStyle, wordWrap: scala.Boolean): pixiDotJsLib.PIXINs.TextMetrics = js.native
  def measureText(
    text: java.lang.String,
    style: pixiDotJsLib.PIXINs.TextStyle,
    wordWrap: scala.Boolean,
    canvas: stdLib.HTMLCanvasElement
  ): pixiDotJsLib.PIXINs.TextMetrics = js.native
  def tokenize(): js.Array[java.lang.String] = js.native
  def tokenize(text: java.lang.String): js.Array[java.lang.String] = js.native
  def trimRight(): java.lang.String = js.native
  def trimRight(text: java.lang.String): java.lang.String = js.native
  def wordWrap(text: java.lang.String, style: pixiDotJsLib.PIXINs.TextStyle): java.lang.String = js.native
  def wordWrap(text: java.lang.String, style: pixiDotJsLib.PIXINs.TextStyle, canvas: stdLib.HTMLCanvasElement): java.lang.String = js.native
}

