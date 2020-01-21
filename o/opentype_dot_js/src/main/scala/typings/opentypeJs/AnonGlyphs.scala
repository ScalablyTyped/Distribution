package typings.opentypeJs

import typings.opentypeJs.mod.Glyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlyphs extends js.Object {
  var glyphs: js.Array[Glyph]
}

object AnonGlyphs {
  @scala.inline
  def apply(glyphs: js.Array[Glyph]): AnonGlyphs = {
    val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGlyphs]
  }
}

