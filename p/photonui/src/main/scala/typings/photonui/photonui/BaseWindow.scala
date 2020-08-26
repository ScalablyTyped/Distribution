package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -----------------------------------
@js.native
trait BaseWindow extends Container {
  var height: Double = js.native
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
  var minHeight: Double = js.native
  var minWidth: Double = js.native
  var padding: Double = js.native
  var position: X = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def center(): Unit = js.native
}

object BaseWindow {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    center: () => Unit,
    child: Widget,
    childName: String,
    containerNode: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    height: Double,
    hide: () => Unit,
    horizontalChildExpansion: Boolean,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    padding: Double,
    parent: Widget,
    parentName: String,
    position: X,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeChild: Widget => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    tooltip: String,
    unparent: () => Unit,
    verticalChildExpansion: Boolean,
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): BaseWindow = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), center = js.Any.fromFunction0(center), child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), height = height.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeChild = js.Any.fromFunction1(removeChild), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWindow]
  }
  @scala.inline
  implicit class BaseWindowOps[Self <: BaseWindow] (val x: Self) extends AnyVal {
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
    def setCenter(value: () => Unit): Self = this.set("center", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: X): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

