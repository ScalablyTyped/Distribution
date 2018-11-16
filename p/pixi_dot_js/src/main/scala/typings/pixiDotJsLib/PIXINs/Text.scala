package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Text")
@js.native
class Text () extends Sprite {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, style: TextStyleOptions) = this()
  def this(text: java.lang.String, style: TextStyleOptions, canvas: stdLib.HTMLCanvasElement) = this()
  var _font: java.lang.String = js.native
  var _style: TextStyle = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _styleListener: js.Function = js.native
  var _text: java.lang.String = js.native
  var canvas: stdLib.HTMLCanvasElement = js.native
  var context: stdLib.CanvasRenderingContext2D = js.native
  var dirty: scala.Boolean = js.native
  var localStyleID: scala.Double = js.native
  var resolution: scala.Double = js.native
  var style: TextStyle = js.native
  var text: java.lang.String = js.native
  /* protected */ def _generateFillStyle(style: TextStyle, lines: js.Array[java.lang.String]): java.lang.String | scala.Double | stdLib.CanvasGradient = js.native
  /* protected */ def _onStyleChange(): scala.Unit = js.native
  /* protected */ def drawLetterSpacing(text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /* protected */ def drawLetterSpacing(text: java.lang.String, x: scala.Double, y: scala.Double, isStroke: scala.Boolean): scala.Unit = js.native
  /* protected */ def updateText(): scala.Unit = js.native
  /* protected */ def updateText(respectDirty: scala.Boolean): scala.Unit = js.native
  /* protected */ def updateTexture(): scala.Unit = js.native
}

