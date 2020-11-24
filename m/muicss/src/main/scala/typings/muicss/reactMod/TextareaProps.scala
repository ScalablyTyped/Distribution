package typings.muicss.reactMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextareaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  
  var floatingLabel: js.UndefOr[Boolean] = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var inputRef: js.UndefOr[Ref[HTMLTextAreaElement]] = js.native
  
  var invalid: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[ReactNode] = js.native
  
  var onLabelClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
}
object TextareaProps {
  
  @scala.inline
  def apply(): TextareaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaProps]
  }
  
  @scala.inline
  implicit class TextareaPropsOps[Self <: TextareaProps] (val x: Self) extends AnyVal {
    
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
    def setFloatingLabel(value: Boolean): Self = this.set("floatingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabel: Self = this.set("floatingLabel", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLTextAreaElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRef(value: Ref[HTMLTextAreaElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnLabelClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLabelClick: Self = this.set("onLabelClick", js.undefined)
  }
}
