package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderStyle extends js.Object {
  var borderStyle: String
  var padding: Double
}

object BorderStyle {
  @scala.inline
  def apply(borderStyle: String, padding: Double): BorderStyle = {
    val __obj = js.Dynamic.literal(borderStyle = borderStyle.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStyle]
  }
}

