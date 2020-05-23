package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalAlign extends js.Object {
  var borderStyle: String
  var verticalAlign: String
}

object VerticalAlign {
  @scala.inline
  def apply(borderStyle: String, verticalAlign: String): VerticalAlign = {
    val __obj = js.Dynamic.literal(borderStyle = borderStyle.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalAlign]
  }
}

