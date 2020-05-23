package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends Widget {
  var appearance: String
   //  normal | flat
  var buttonColor: String
  var leftIcon: BaseIcon
  var leftIconName: String
  var leftIconVisible: Boolean
  var rightIcon: BaseIcon
  var rightIconName: String
  var rightIconVisible: Boolean
  var text: String
  var textVisible: Boolean
}

object Button {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    appearance: String,
    buttonColor: String,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    hide: () => Unit,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    leftIcon: BaseIcon,
    leftIconName: String,
    leftIconVisible: Boolean,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    rightIcon: BaseIcon,
    rightIconName: String,
    rightIconVisible: Boolean,
    show: () => Unit,
    text: String,
    textVisible: Boolean,
    tooltip: String,
    unparent: () => Unit,
    visible: Boolean
  ): Button = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), appearance = appearance.asInstanceOf[js.Any], buttonColor = buttonColor.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], leftIcon = leftIcon.asInstanceOf[js.Any], leftIconName = leftIconName.asInstanceOf[js.Any], leftIconVisible = leftIconVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), rightIcon = rightIcon.asInstanceOf[js.Any], rightIconName = rightIconName.asInstanceOf[js.Any], rightIconVisible = rightIconVisible.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), text = text.asInstanceOf[js.Any], textVisible = textVisible.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

