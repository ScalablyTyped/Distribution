package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedMod.DomScope
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  def close(event: SyntheticEvent[Element, Event]): Unit
  
  var focusScope: DomScope
  
  var isOpen: Boolean
  
  var listboxProps: Arialabel
  
  def open(event: SyntheticEvent[Element, Event], focusTarget: String): Unit
  
  var overlayProps: About
  
  var selectedItem: Avatar
  
  var selectedKey: String
  
  def setSelectedKey(event: SyntheticEvent[Element, Event], newKeys: js.Array[String]): Unit
  
  var triggerProps: Ariaexpanded
}
object Close {
  
  inline def apply(
    close: SyntheticEvent[Element, Event] => Unit,
    focusScope: DomScope,
    isOpen: Boolean,
    listboxProps: Arialabel,
    open: (SyntheticEvent[Element, Event], String) => Unit,
    overlayProps: About,
    selectedItem: Avatar,
    selectedKey: String,
    setSelectedKey: (SyntheticEvent[Element, Event], js.Array[String]) => Unit,
    triggerProps: Ariaexpanded
  ): Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), focusScope = focusScope.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], listboxProps = listboxProps.asInstanceOf[js.Any], open = js.Any.fromFunction2(open), overlayProps = overlayProps.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any], selectedKey = selectedKey.asInstanceOf[js.Any], setSelectedKey = js.Any.fromFunction2(setSelectedKey), triggerProps = triggerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setFocusScope(value: DomScope): Self = StObject.set(x, "focusScope", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setListboxProps(value: Arialabel): Self = StObject.set(x, "listboxProps", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: (SyntheticEvent[Element, Event], String) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
    
    inline def setOverlayProps(value: About): Self = StObject.set(x, "overlayProps", value.asInstanceOf[js.Any])
    
    inline def setSelectedItem(value: Avatar): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedKey(value: (SyntheticEvent[Element, Event], js.Array[String]) => Unit): Self = StObject.set(x, "setSelectedKey", js.Any.fromFunction2(value))
    
    inline def setTriggerProps(value: Ariaexpanded): Self = StObject.set(x, "triggerProps", value.asInstanceOf[js.Any])
  }
}
