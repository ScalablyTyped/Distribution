package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoxSizing extends js.Object {
  var boxSizing: String
  var padding: Double
}

object AnonBoxSizing {
  @scala.inline
  def apply(boxSizing: String, padding: Double): AnonBoxSizing = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoxSizing]
  }
}

