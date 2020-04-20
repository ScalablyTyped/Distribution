package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpanded extends js.Object {
  var expanded: Boolean
  var focused: Boolean
  var hovered: Boolean
  var selected: Boolean
  var zoom: Double
}

object AnonExpanded {
  @scala.inline
  def apply(expanded: Boolean, focused: Boolean, hovered: Boolean, selected: Boolean, zoom: Double): AnonExpanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpanded]
  }
}

