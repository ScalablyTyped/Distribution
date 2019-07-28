package typings.opentypeDotJs.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "GlyphSet")
@js.native
class GlyphSet protected () extends js.Object {
  def this(font: Font, glyphs: js.Array[js.Function0[Glyph] | Glyph]) = this()
  var font: js.Any = js.native
  var glyphs: js.Any = js.native
  var length: Double = js.native
  def get(index: Double): Glyph = js.native
  def push(index: Double, loader: js.Function0[Glyph]): Unit = js.native
}

