package typings.oracleOraclejet.ojthematicmapMod.ojThematicMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DataContext extends js.Object {
  var color: String
  var label: String
  var selected: Boolean
  var tooltip: String
}

object DataContext {
  @scala.inline
  def apply(color: String, label: String, selected: Boolean, tooltip: String): DataContext = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataContext]
  }
}

