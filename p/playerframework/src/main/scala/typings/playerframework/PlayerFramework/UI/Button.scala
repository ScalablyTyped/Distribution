package typings.playerframework.PlayerFramework.UI

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var content: String
  var disabled: Boolean
  var element: HTMLElement
  var flyout: Element
  var hidden: Boolean
  var hoverContent: String
  var label: String
  var tooltip: String
  var `type`: String
}

object Button {
  @scala.inline
  def apply(
    content: String,
    disabled: Boolean,
    element: HTMLElement,
    flyout: Element,
    hidden: Boolean,
    hoverContent: String,
    label: String,
    tooltip: String,
    `type`: String
  ): Button = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], flyout = flyout.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hoverContent = hoverContent.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

