package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderStyle extends js.Object {
  var borderStyle: String
  var padding: Double
}

object AnonBorderStyle {
  @scala.inline
  def apply(borderStyle: String, padding: Double): AnonBorderStyle = {
    val __obj = js.Dynamic.literal(borderStyle = borderStyle.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderStyle]
  }
}

