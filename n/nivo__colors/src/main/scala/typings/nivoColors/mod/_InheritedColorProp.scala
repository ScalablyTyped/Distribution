package typings.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InheritedColorProp[D] extends js.Object

object _InheritedColorProp {
  @scala.inline
  def AnonTheme[D](theme: String): _InheritedColorProp[D] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InheritedColorProp[D]]
  }
  @scala.inline
  def AnonFrom[D](from: String, modifiers: js.Array[ColorModifier] = null): _InheritedColorProp[D] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InheritedColorProp[D]]
  }
}

