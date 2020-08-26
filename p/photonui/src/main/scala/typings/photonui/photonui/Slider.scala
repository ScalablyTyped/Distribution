package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider extends NumericField {
  var fieldVisible: Boolean = js.native
}

object Slider {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    contextMenu: PopupWindow,
    contextMenuName: String,
    decimalDigits: Double,
    decimalSymbol: String,
    destroy: () => Unit,
    fieldVisible: Boolean,
    hide: () => Unit,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    max: Double,
    min: Double,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    placeholder: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    step: Double,
    tooltip: String,
    unparent: () => Unit,
    value: Boolean,
    visible: Boolean
  ): Slider = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], decimalDigits = decimalDigits.asInstanceOf[js.Any], decimalSymbol = decimalSymbol.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), fieldVisible = fieldVisible.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), step = step.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
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
    def setFieldVisible(value: Boolean): Self = this.set("fieldVisible", value.asInstanceOf[js.Any])
  }
  
}

