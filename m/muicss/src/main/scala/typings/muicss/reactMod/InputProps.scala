package typings.muicss.reactMod

import typings.react.mod.InputHTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProps
  extends StObject
     with InputHTMLAttributes[HTMLInputElement] {
  
  var floatingLabel: js.UndefOr[Boolean] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  var invalid: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var onLabelClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
}
object InputProps {
  
  inline def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  
  extension [Self <: InputProps](x: Self) {
    
    inline def setFloatingLabel(value: Boolean): Self = StObject.set(x, "floatingLabel", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelUndefined: Self = StObject.set(x, "floatingLabel", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnLabelClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLabelClick", js.Any.fromFunction1(value))
    
    inline def setOnLabelClickUndefined: Self = StObject.set(x, "onLabelClick", js.undefined)
  }
}
