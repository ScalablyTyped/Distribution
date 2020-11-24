package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.PopoverInstance
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.bottom
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.click
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.hover
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.modal
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.right
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoClose extends js.Object {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var content: String | (js.Function1[/* res */ PopoverInstance, Unit]) = js.native
  
  var delay: js.UndefOr[Hide] = js.native
  
  var direction: js.UndefOr[right | left | bottom | top] = js.native
  
  var interactive: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var target: JQuery[HTMLElement] = js.native
  
  var tooltip: js.UndefOr[Boolean] = js.native
  
  var trigger: js.UndefOr[hover | click | modal] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object AutoClose {
  
  @scala.inline
  def apply(content: String | (js.Function1[/* res */ PopoverInstance, Unit]), target: JQuery[HTMLElement]): AutoClose = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClose]
  }
  
  @scala.inline
  implicit class AutoCloseOps[Self <: AutoClose] (val x: Self) extends AnyVal {
    
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
    def setContentFunction1(value: /* res */ PopoverInstance => Unit): Self = this.set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(value: String | (js.Function1[/* res */ PopoverInstance, Unit])): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: JQuery[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setDelay(value: Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDirection(value: right | left | bottom | top): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTrigger(value: hover | click | modal): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
