package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocused extends js.Object {
  var focused: Boolean
  var hovered: Boolean
  var selected: Boolean
}

object AnonFocused {
  @scala.inline
  def apply(focused: Boolean, hovered: Boolean, selected: Boolean): AnonFocused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocused]
  }
}

