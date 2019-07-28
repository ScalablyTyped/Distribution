package typings.atNivoLegends.atNivoLegendsMod

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
    val __obj = js.Dynamic.literal(color = color, id = id.asInstanceOf[js.Any], label = label)
  
    __obj.asInstanceOf[LegendMouseHandlerData]
  }
}

