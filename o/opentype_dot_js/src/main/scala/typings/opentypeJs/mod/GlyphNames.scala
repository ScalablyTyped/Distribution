package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "GlyphNames")
@js.native
class GlyphNames protected () extends js.Object {
  def this(post: Post) = this()
  var names: js.Any = js.native
  def glyphIndexToName(gid: Double): String = js.native
  def nameToGlyphIndex(name: String): Double = js.native
}

