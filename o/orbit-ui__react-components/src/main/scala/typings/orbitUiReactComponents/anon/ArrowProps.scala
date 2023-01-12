package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedMod.DomScope
import typings.orbitUiReactComponents.distSharedMod.FocusManager
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowProps extends StObject {
  
  var arrowProps: RefUndefined | RefMergedRef
  
  var focusManager: FocusManager
  
  var focusScope: DomScope
  
  var isOpen: Boolean
  
  var overlayProps: Ref
  
  def setIsOpen(event: SyntheticEvent[Element, Event], newValue: Boolean): Unit
  
  var triggerProps: Ariacontrols
}
object ArrowProps {
  
  inline def apply(
    arrowProps: RefUndefined | RefMergedRef,
    focusManager: FocusManager,
    focusScope: DomScope,
    isOpen: Boolean,
    overlayProps: Ref,
    setIsOpen: (SyntheticEvent[Element, Event], Boolean) => Unit,
    triggerProps: Ariacontrols
  ): ArrowProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], focusManager = focusManager.asInstanceOf[js.Any], focusScope = focusScope.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], overlayProps = overlayProps.asInstanceOf[js.Any], setIsOpen = js.Any.fromFunction2(setIsOpen), triggerProps = triggerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowProps] (val x: Self) extends AnyVal {
    
    inline def setArrowProps(value: RefUndefined | RefMergedRef): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
    
    inline def setFocusManager(value: FocusManager): Self = StObject.set(x, "focusManager", value.asInstanceOf[js.Any])
    
    inline def setFocusScope(value: DomScope): Self = StObject.set(x, "focusScope", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOverlayProps(value: Ref): Self = StObject.set(x, "overlayProps", value.asInstanceOf[js.Any])
    
    inline def setSetIsOpen(value: (SyntheticEvent[Element, Event], Boolean) => Unit): Self = StObject.set(x, "setIsOpen", js.Any.fromFunction2(value))
    
    inline def setTriggerProps(value: Ariacontrols): Self = StObject.set(x, "triggerProps", value.asInstanceOf[js.Any])
  }
}
