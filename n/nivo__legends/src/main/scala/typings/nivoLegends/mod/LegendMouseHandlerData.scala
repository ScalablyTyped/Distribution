package typings.nivoLegends.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendMouseHandlerData extends js.Object {
  var color: String
  var id: String | Double
  var label: String
}

object LegendMouseHandlerData {
  @scala.inline
  def apply(color: String, id: String | Double, label: String): LegendMouseHandlerData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendMouseHandlerData]
  }
}

