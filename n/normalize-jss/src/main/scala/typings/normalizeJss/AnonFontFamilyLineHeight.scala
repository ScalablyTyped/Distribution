package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontFamilyLineHeight extends js.Object {
  var fontFamily: String
  var lineHeight: String
  var textSizeAdjust: String
}

object AnonFontFamilyLineHeight {
  @scala.inline
  def apply(fontFamily: String, lineHeight: String, textSizeAdjust: String): AnonFontFamilyLineHeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], textSizeAdjust = textSizeAdjust.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontFamilyLineHeight]
  }
}

