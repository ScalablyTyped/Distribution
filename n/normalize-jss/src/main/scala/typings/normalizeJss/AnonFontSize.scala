package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontSize extends js.Object {
  var fontSize: String
  var margin: js.Array[js.Array[String]]
}

object AnonFontSize {
  @scala.inline
  def apply(fontSize: String, margin: js.Array[js.Array[String]]): AnonFontSize = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontSize]
  }
}

