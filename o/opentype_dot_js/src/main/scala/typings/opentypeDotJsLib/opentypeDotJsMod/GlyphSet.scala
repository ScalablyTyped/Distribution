package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "GlyphSet")
@js.native
class GlyphSet protected () extends js.Object {
  def this(font: Font, glyphs: js.Array[Glyph | js.Function0[Glyph]]) = this()
  var font: js.Any = js.native
  var glyphs: js.Any = js.native
  var length: scala.Double = js.native
  def get(index: scala.Double): Glyph = js.native
  def push(index: scala.Double, loader: js.Function0[Glyph]): scala.Unit = js.native
}

