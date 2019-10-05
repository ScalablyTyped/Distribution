package typings.pixiDotJs.PIXI.extras

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.Anon_Name
import typings.pixiDotJs.PIXI.Container
import typings.pixiDotJs.PIXI.ObservablePoint
import typings.pixiDotJs.PIXI.Point
import typings.pixiDotJs.PIXI.Sprite
import typings.pixiDotJs.PIXI.Texture
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.BitmapText")
@js.native
class BitmapText protected () extends Container {
  def this(text: String) = this()
  def this(text: String, style: BitmapTextStyle) = this()
  var _anchor: ObservablePoint = js.native
  var _font: String | Anon_Name = js.native
  var _glyphs: js.Array[Sprite] = js.native
  var _letterSpacing: Double = js.native
  var _maxLineHeight: Double = js.native
  var _maxWidth: Double = js.native
  var _text: String = js.native
  var _textHeight: Double = js.native
  var _textWidth: Double = js.native
  var align: String = js.native
  var anchor: Point | Double = js.native
  var dirty: Boolean = js.native
  var font: String | Anon_Name = js.native
  var letterSpacing: Double = js.native
  var maxLineHeight: Double = js.native
  var maxWidth: Double = js.native
  var text: String = js.native
  var textHeight: Double = js.native
  var textWidth: Double = js.native
  var tint: Double = js.native
  /* protected */ def updateText(): Unit = js.native
  /* protected */ def validate(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.extras.BitmapText")
@js.native
object BitmapText extends js.Object {
  var fonts: js.Any = js.native
  def registerFont(xml: XMLDocument, textures: js.Array[Texture]): js.Any = js.native
  def registerFont(xml: XMLDocument, textures: StringDictionary[Texture]): js.Any = js.native
  def registerFont(xml: XMLDocument, textures: Texture): js.Any = js.native
}

