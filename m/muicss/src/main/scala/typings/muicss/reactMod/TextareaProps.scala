package typings.muicss.reactMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextareaProps
  extends StObject
     with TextareaHTMLAttributes[HTMLTextAreaElement] {
  
  var floatingLabel: js.UndefOr[Boolean] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var inputRef: js.UndefOr[Ref[HTMLTextAreaElement]] = js.undefined
  
  var invalid: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var onLabelClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
}
object TextareaProps {
  
  @scala.inline
  def apply(): TextareaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaProps]
  }
  
  @scala.inline
  implicit class TextareaPropsMutableBuilder[Self <: TextareaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloatingLabel(value: Boolean): Self = StObject.set(x, "floatingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelUndefined: Self = StObject.set(x, "floatingLabel", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setInputRef(value: Ref[HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLTextAreaElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    @scala.inline
    def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    @scala.inline
    def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnLabelClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLabelClickUndefined: Self = StObject.set(x, "onLabelClick", js.undefined)
  }
}
