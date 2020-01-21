package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontFamily extends js.Object {
  var fontFamily: String
  var fontSize: String
  var lineHeight: String
  var margin: Double
}

object AnonFontFamily {
  @scala.inline
  def apply(fontFamily: String, fontSize: String, lineHeight: String, margin: Double): AnonFontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontFamily]
  }
}

