package typings.orbitUiReactComponents.anon

import typings.react.mod.FocusEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMouseEnter extends StObject {
  
  def onBlur(event: FocusEvent[Element, Element]): Unit
  
  var onClick: Unit
  
  def onFocus(event: FocusEvent[Element, Element]): Unit
  
  var onKeyDown: Unit
  
  var onKeyUp: Unit
  
  def onMouseEnter(event: MouseEvent[Element, NativeMouseEvent]): Unit
}
object OnMouseEnter {
  
  inline def apply(
    onBlur: FocusEvent[Element, Element] => Unit,
    onClick: Unit,
    onFocus: FocusEvent[Element, Element] => Unit,
    onKeyDown: Unit,
    onKeyUp: Unit,
    onMouseEnter: MouseEvent[Element, NativeMouseEvent] => Unit
  ): OnMouseEnter = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onClick = onClick.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus), onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], onMouseEnter = js.Any.fromFunction1(onMouseEnter))
    __obj.asInstanceOf[OnMouseEnter]
  }
  
  extension [Self <: OnMouseEnter](x: Self) {
    
    inline def setOnBlur(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnClick(value: Unit): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: Unit): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUp(value: Unit): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnter(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
  }
}
