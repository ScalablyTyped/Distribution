package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorder extends js.Object {
  var border: String
  var margin: js.Array[js.Array[Double]]
  var padding: js.Array[js.Array[String]]
}

object AnonBorder {
  @scala.inline
  def apply(border: String, margin: js.Array[js.Array[Double]], padding: js.Array[js.Array[String]]): AnonBorder = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBorder]
  }
}

