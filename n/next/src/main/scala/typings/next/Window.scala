package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var MSInputMethodContext: js.UndefOr[Any] = js.undefined
  
  var __NEXT_HMR_CB: js.UndefOr[Null | (js.Function1[/* message */ js.UndefOr[String], Unit])] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setMSInputMethodContext(value: Any): Self = StObject.set(x, "MSInputMethodContext", value.asInstanceOf[js.Any])
    
    inline def setMSInputMethodContextUndefined: Self = StObject.set(x, "MSInputMethodContext", js.undefined)
    
    inline def set__NEXT_HMR_CB(value: /* message */ js.UndefOr[String] => Unit): Self = StObject.set(x, "__NEXT_HMR_CB", js.Any.fromFunction1(value))
    
    inline def set__NEXT_HMR_CBNull: Self = StObject.set(x, "__NEXT_HMR_CB", null)
    
    inline def set__NEXT_HMR_CBUndefined: Self = StObject.set(x, "__NEXT_HMR_CB", js.undefined)
  }
}
