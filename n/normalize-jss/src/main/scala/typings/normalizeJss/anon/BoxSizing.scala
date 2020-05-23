package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxSizing extends js.Object {
  var boxSizing: String
  var padding: Double
}

object BoxSizing {
  @scala.inline
  def apply(boxSizing: String, padding: Double): BoxSizing = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizing]
  }
}

