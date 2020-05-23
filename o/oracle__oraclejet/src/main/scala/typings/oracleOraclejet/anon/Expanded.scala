package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expanded extends js.Object {
  var expanded: Boolean
  var focused: Boolean
  var hovered: Boolean
  var selected: Boolean
  var zoom: Double
}

object Expanded {
  @scala.inline
  def apply(expanded: Boolean, focused: Boolean, hovered: Boolean, selected: Boolean, zoom: Double): Expanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
}

