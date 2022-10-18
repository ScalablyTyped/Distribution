package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var MSInputMethodContext: js.UndefOr[Any] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setMSInputMethodContext(value: Any): Self = StObject.set(x, "MSInputMethodContext", value.asInstanceOf[js.Any])
    
    inline def setMSInputMethodContextUndefined: Self = StObject.set(x, "MSInputMethodContext", js.undefined)
  }
}
