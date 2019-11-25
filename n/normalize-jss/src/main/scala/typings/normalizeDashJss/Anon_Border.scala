package typings.normalizeDashJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Border extends js.Object {
  var border: String
  var margin: js.Array[js.Array[Double]]
  var padding: js.Array[js.Array[String]]
}

object Anon_Border {
  @scala.inline
  def apply(border: String, margin: js.Array[js.Array[Double]], padding: js.Array[js.Array[String]]): Anon_Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Border]
  }
}

