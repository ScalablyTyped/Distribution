package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontSizeMargin extends js.Object {
  var fontSize: String
  var margin: js.Array[js.Array[String]]
}

object AnonFontSizeMargin {
  @scala.inline
  def apply(fontSize: String, margin: js.Array[js.Array[String]]): AnonFontSizeMargin = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontSizeMargin]
  }
}

