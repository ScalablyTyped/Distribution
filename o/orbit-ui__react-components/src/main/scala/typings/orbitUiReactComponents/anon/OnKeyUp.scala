package typings.orbitUiReactComponents.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyUp extends StObject {
  
  var onBlur: Unit
  
  def onClick(event: SyntheticEvent[Element, Event]): Unit
  
  var onFocus: Unit
  
  def onKeyDown(event: KeyboardEvent[Element]): Unit
  
  def onKeyUp(event: KeyboardEvent[Element]): Unit
  
  var onMouseEnter: Unit
}
object OnKeyUp {
  
  inline def apply(
    onBlur: Unit,
    onClick: SyntheticEvent[Element, Event] => Unit,
    onFocus: Unit,
    onKeyDown: KeyboardEvent[Element] => Unit,
    onKeyUp: KeyboardEvent[Element] => Unit,
    onMouseEnter: Unit
  ): OnKeyUp = {
    val __obj = js.Dynamic.literal(onBlur = onBlur.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onFocus = onFocus.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), onMouseEnter = onMouseEnter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyUp]
  }
  
  extension [Self <: OnKeyUp](x: Self) {
    
    inline def setOnBlur(value: Unit): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: Unit): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyUp(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnter(value: Unit): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
  }
}
