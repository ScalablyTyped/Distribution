package typings
package pixiDotJsLib.PIXINs.extrasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.BitmapText")
@js.native
class BitmapText protected ()
  extends pixiDotJsLib.PIXINs.Container {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, style: BitmapTextStyle) = this()
  var _anchor: pixiDotJsLib.PIXINs.ObservablePoint = js.native
  var _font: java.lang.String | pixiDotJsLib.Anon_Size = js.native
  var _glyphs: js.Array[pixiDotJsLib.PIXINs.Sprite] = js.native
  var _letterSpacing: scala.Double = js.native
  var _maxLineHeight: scala.Double = js.native
  var _maxWidth: scala.Double = js.native
  var _text: java.lang.String = js.native
  var _textHeight: scala.Double = js.native
  var _textWidth: scala.Double = js.native
  var align: java.lang.String = js.native
  var anchor: pixiDotJsLib.PIXINs.Point | scala.Double = js.native
  var dirty: scala.Boolean = js.native
  var font: java.lang.String | pixiDotJsLib.Anon_Size = js.native
  var letterSpacing: scala.Double = js.native
  var maxLineHeight: scala.Double = js.native
  var maxWidth: scala.Double = js.native
  var text: java.lang.String = js.native
  var textHeight: scala.Double = js.native
  var textWidth: scala.Double = js.native
  var tint: scala.Double = js.native
  /* protected */ def updateText(): scala.Unit = js.native
  /* protected */ def validate(): scala.Unit = js.native
}

@JSGlobal("PIXI.extras.BitmapText")
@js.native
object BitmapText extends js.Object {
  var fonts: js.Any = js.native
  def registerFont(xml: stdLib.XMLDocument, textures: js.Array[pixiDotJsLib.PIXINs.Texture]): js.Any = js.native
  def registerFont(
    xml: stdLib.XMLDocument,
    textures: org.scalablytyped.runtime.StringDictionary[pixiDotJsLib.PIXINs.Texture]
  ): js.Any = js.native
  def registerFont(xml: stdLib.XMLDocument, textures: pixiDotJsLib.PIXINs.Texture): js.Any = js.native
}

