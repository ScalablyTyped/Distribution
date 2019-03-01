package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var charset: java.lang.String
  var font: Font
  def charToGlyphIndex(c: java.lang.String): scala.Double
}

object Encoding {
  @scala.inline
  def apply(
    charToGlyphIndex: js.Function1[java.lang.String, scala.Double],
    charset: java.lang.String,
    font: Font
  ): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charToGlyphIndex")(charToGlyphIndex)
    __obj.updateDynamic("charset")(charset)
    __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[Encoding]
  }
}

