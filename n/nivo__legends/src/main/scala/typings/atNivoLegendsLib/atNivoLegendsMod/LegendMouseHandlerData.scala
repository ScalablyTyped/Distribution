package typings
package atNivoLegendsLib.atNivoLegendsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendMouseHandlerData extends js.Object {
  var color: java.lang.String
  var id: java.lang.String | scala.Double
  var label: java.lang.String
}

object LegendMouseHandlerData {
  @scala.inline
  def apply(color: java.lang.String, id: java.lang.String | scala.Double, label: java.lang.String): LegendMouseHandlerData = {
    val __obj = js.Dynamic.literal(color = color, id = id.asInstanceOf[js.Any], label = label)
  
    __obj.asInstanceOf[LegendMouseHandlerData]
  }
}

