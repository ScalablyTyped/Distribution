package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBar extends Widget {
  var orientation: String = js.native
  var pulsate: Boolean = js.native
  var textVisible: Boolean = js.native
  var value: Double = js.native
}

object ProgressBar {
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
    orientation: String,
    parent: Widget,
    parentName: String,
    pulsate: Boolean,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    textVisible: Boolean,
    tooltip: String,
    unparent: () => Unit,
    value: Double,
    visible: Boolean
  ): ProgressBar = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], pulsate = pulsate.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), textVisible = textVisible.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBar]
  }
  @scala.inline
  implicit class ProgressBarOps[Self <: ProgressBar] (val x: Self) extends AnyVal {
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
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPulsate(value: Boolean): Self = this.set("pulsate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextVisible(value: Boolean): Self = this.set("textVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

