package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentype.js", "GlyphSet")
@js.native
class GlyphSet protected () extends StObject {
  def this(font: Font, glyphs: js.Array[js.Function0[Glyph] | Glyph]) = this()
  
  var font: js.Any = js.native
  
  def get(index: Double): Glyph = js.native
  
  var glyphs: js.Any = js.native
  
  var length: Double = js.native
  
  def push(index: Double, loader: js.Function0[Glyph]): Unit = js.native
}
