package typings.pixiDotJs.PIXI

import typings.std.CanvasGradient
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Text")
@js.native
class Text () extends Sprite {
  def this(text: String) = this()
  def this(text: String, style: TextStyleOptions) = this()
  def this(text: String, style: TextStyleOptions, canvas: HTMLCanvasElement) = this()
  var _font: String = js.native
  var _style: TextStyle = js.native
  var _text: String = js.native
  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var dirty: Boolean = js.native
  var localStyleID: Double = js.native
  var resolution: Double = js.native
  var style: TextStyle = js.native
  var text: String = js.native
  /* protected */ def _generateFillStyle(style: TextStyle, lines: js.Array[String]): String | Double | CanvasGradient = js.native
  /* protected */ def _onStyleChange(): Unit = js.native
  /* protected */ def _styleListener(args: js.Any*): js.Any = js.native
  /* protected */ def drawLetterSpacing(text: String, x: Double, y: Double): Unit = js.native
  /* protected */ def drawLetterSpacing(text: String, x: Double, y: Double, isStroke: Boolean): Unit = js.native
  /* protected */ def updateText(): Unit = js.native
  /* protected */ def updateText(respectDirty: Boolean): Unit = js.native
  /* protected */ def updateTexture(): Unit = js.native
}

