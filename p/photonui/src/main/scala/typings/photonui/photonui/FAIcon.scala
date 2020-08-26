package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FAIcon extends Widget {
  var color: String = js.native
  var iconName: String = js.native
  var size: String = js.native
}

object FAIcon {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    color: String,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    hide: () => Unit,
    html: HTMLElement,
    iconName: String,
    layoutOptions: StringDictionary[js.Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    size: String,
    tooltip: String,
    unparent: () => Unit,
    visible: Boolean
  ): FAIcon = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), color = color.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), size = size.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FAIcon]
  }
  @scala.inline
  implicit class FAIconOps[Self <: FAIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

