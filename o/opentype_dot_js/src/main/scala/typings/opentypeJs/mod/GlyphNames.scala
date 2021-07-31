package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentype.js", "GlyphNames")
@js.native
class GlyphNames protected () extends StObject {
  def this(post: Post) = this()
  
  def glyphIndexToName(gid: Double): String = js.native
  
  def nameToGlyphIndex(name: String): Double = js.native
  
  var names: js.Any = js.native
}
