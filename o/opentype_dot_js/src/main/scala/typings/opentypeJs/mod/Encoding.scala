package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var charset: String
  var font: Font
  def charToGlyphIndex(c: String): Double
}

object Encoding {
  @scala.inline
  def apply(charToGlyphIndex: String => Double, charset: String, font: Font): Encoding = {
    val __obj = js.Dynamic.literal(charToGlyphIndex = js.Any.fromFunction1(charToGlyphIndex), charset = charset.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Encoding]
  }
}

