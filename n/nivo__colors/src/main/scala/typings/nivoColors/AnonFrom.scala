package typings.nivoColors

import typings.nivoColors.mod.ColorModifier
import typings.nivoColors.mod._InheritedColorProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom
  extends _InheritedColorProp[js.Any] {
  var from: String
  var modifiers: js.UndefOr[js.Array[ColorModifier]] = js.undefined
}

object AnonFrom {
  @scala.inline
  def apply(from: String, modifiers: js.Array[ColorModifier] = null): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

