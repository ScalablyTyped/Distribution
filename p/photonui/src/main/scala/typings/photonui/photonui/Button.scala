package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button extends Widget {
  
  var appearance: String = js.native
  
   //  normal | flat
  var buttonColor: String = js.native
  
  var leftIcon: BaseIcon = js.native
  
  var leftIconName: String = js.native
  
  var leftIconVisible: Boolean = js.native
  
  var rightIcon: BaseIcon = js.native
  
  var rightIconName: String = js.native
  
  var rightIconVisible: Boolean = js.native
  
  var text: String = js.native
  
  var textVisible: Boolean = js.native
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
  
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    
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
    def setAppearance(value: String): Self = this.set("appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonColor(value: String): Self = this.set("buttonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIcon(value: BaseIcon): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconName(value: String): Self = this.set("leftIconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconVisible(value: Boolean): Self = this.set("leftIconVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIcon(value: BaseIcon): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconName(value: String): Self = this.set("rightIconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconVisible(value: Boolean): Self = this.set("rightIconVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVisible(value: Boolean): Self = this.set("textVisible", value.asInstanceOf[js.Any])
  }
}
