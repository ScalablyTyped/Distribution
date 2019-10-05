package typings.atOracleOraclejet.ojtagcloudMod.ojTagCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext extends js.Object {
  var color: String
  var label: String
  var selected: Boolean
  var tooltip: String
  var value: Double
}

object ItemContext {
  @scala.inline
  def apply(color: String, label: String, selected: Boolean, tooltip: String, value: Double): ItemContext = {
    val __obj = js.Dynamic.literal(color = color, label = label, selected = selected, tooltip = tooltip, value = value)
  
    __obj.asInstanceOf[ItemContext]
  }
}

