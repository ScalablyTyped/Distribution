package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends Base {
  var absolutePosition: X = js.native
   // readonly
  var contextMenu: PopupWindow = js.native
  var contextMenuName: String = js.native
  var html: HTMLElement = js.native
   // readonly
  var layoutOptions: StringDictionary[js.Any] = js.native
  var name: String = js.native
   // readonly
  var offsetHeight: Double = js.native
  var offsetWidth: Double = js.native
   // readonly
  var parent: Widget = js.native
  var parentName: String = js.native
  var tooltip: String = js.native
  var visible: Boolean = js.native
  def addClass(className: String): Unit = js.native
  def hide(): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def show(): Unit = js.native
  def unparent(): Unit = js.native
}

object Widget {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    hide: () => Unit,
    html: HTMLElement,
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
    tooltip: String,
    unparent: () => Unit,
    visible: Boolean
  ): Widget = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Widget]
  }
  @scala.inline
  implicit class WidgetOps[Self <: Widget] (val x: Self) extends AnyVal {
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
    def setAbsolutePosition(value: X): Self = this.set("absolutePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def setContextMenu(value: PopupWindow): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextMenuName(value: String): Self = this.set("contextMenuName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setHtml(value: HTMLElement): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutOptions(value: StringDictionary[js.Any]): Self = this.set("layoutOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetHeight(value: Double): Self = this.set("offsetHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetWidth(value: Double): Self = this.set("offsetWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Widget): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentName(value: String): Self = this.set("parentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnparent(value: () => Unit): Self = this.set("unparent", js.Any.fromFunction0(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

