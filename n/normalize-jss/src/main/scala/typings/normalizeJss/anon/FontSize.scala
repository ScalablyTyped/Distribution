package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSize extends js.Object {
  var fontFamily: String
  var fontSize: String
}

object FontSize {
  @scala.inline
  def apply(fontFamily: String, fontSize: String): FontSize = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSize]
  }
}

