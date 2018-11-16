package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "GlyphNames")
@js.native
class GlyphNames protected () extends js.Object {
  def this(post: Post) = this()
  var names: js.Any = js.native
  def glyphIndexToName(gid: scala.Double): java.lang.String = js.native
  def nameToGlyphIndex(name: java.lang.String): scala.Double = js.native
}

