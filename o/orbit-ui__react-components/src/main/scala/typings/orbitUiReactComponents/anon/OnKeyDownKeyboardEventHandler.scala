package typings.orbitUiReactComponents.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyDownKeyboardEventHandler extends StObject {
  
  var onKeyDown: KeyboardEventHandler[Element]
}
object OnKeyDownKeyboardEventHandler {
  
  inline def apply(onKeyDown: KeyboardEvent[Element] => Unit): OnKeyDownKeyboardEventHandler = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[OnKeyDownKeyboardEventHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnKeyDownKeyboardEventHandler] (val x: Self) extends AnyVal {
    
    inline def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
  }
}
