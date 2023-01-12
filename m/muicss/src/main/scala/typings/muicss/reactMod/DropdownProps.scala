package typings.muicss.reactMod

import typings.muicss.muicssStrings.left
import typings.muicss.muicssStrings.right
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownProps
  extends StObject
     with HTMLAttributes[HTMLDivElement] {
  
  var alignMenu: js.UndefOr[left | right] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var onOutsideClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var variant: js.UndefOr[String] = js.undefined
}
object DropdownProps {
  
  inline def apply(): DropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
    
    inline def setAlignMenu(value: left | right): Self = StObject.set(x, "alignMenu", value.asInstanceOf[js.Any])
    
    inline def setAlignMenuUndefined: Self = StObject.set(x, "alignMenu", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnOutsideClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction1(value))
    
    inline def setOnOutsideClickUndefined: Self = StObject.set(x, "onOutsideClick", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
