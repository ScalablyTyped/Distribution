package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focused extends js.Object {
  var focused: Boolean
  var hovered: Boolean
  var selected: Boolean
}

object Focused {
  @scala.inline
  def apply(focused: Boolean, hovered: Boolean, selected: Boolean): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
}

