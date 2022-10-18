package typings.orbitUiReactComponents.anon

import typings.react.mod.FocusEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlurOnFocus extends StObject {
  
  def onBlur(event: FocusEvent[Element, Element]): Unit
  
  def onFocus(event: FocusEvent[Element, Element]): Unit
}
object OnBlurOnFocus {
  
  inline def apply(onBlur: FocusEvent[Element, Element] => Unit, onFocus: FocusEvent[Element, Element] => Unit): OnBlurOnFocus = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus))
    __obj.asInstanceOf[OnBlurOnFocus]
  }
  
  extension [Self <: OnBlurOnFocus](x: Self) {
    
    inline def setOnBlur(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
  }
}
