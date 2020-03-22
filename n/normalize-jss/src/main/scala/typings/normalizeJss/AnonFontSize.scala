package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontSize extends js.Object {
  var fontFamily: String
  var fontSize: String
}

object AnonFontSize {
  @scala.inline
  def apply(fontFamily: String, fontSize: String): AnonFontSize = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontSize]
  }
}

