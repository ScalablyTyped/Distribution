package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSizeMargin extends js.Object {
  var fontSize: String
  var margin: js.Array[js.Array[String]]
}

object FontSizeMargin {
  @scala.inline
  def apply(fontSize: String, margin: js.Array[js.Array[String]]): FontSizeMargin = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeMargin]
  }
}

