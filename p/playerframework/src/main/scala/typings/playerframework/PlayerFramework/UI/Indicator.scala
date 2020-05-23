package typings.playerframework.PlayerFramework.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indicator extends js.Object {
  var disabled: Boolean
  var element: HTMLElement
  var hidden: Boolean
  var label: String
  var tooltip: String
  var value: String
}

object Indicator {
  @scala.inline
  def apply(
    disabled: Boolean,
    element: HTMLElement,
    hidden: Boolean,
    label: String,
    tooltip: String,
    value: String
  ): Indicator = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indicator]
  }
}

