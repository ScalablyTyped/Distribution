package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EscPressed extends StObject {
  
  /**
    * Indicates that `ESC` key has triggered the event.
    */
  var escPressed: js.UndefOr[Boolean] = js.undefined
}
object EscPressed {
  
  inline def apply(): EscPressed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EscPressed]
  }
  
  extension [Self <: EscPressed](x: Self) {
    
    inline def setEscPressed(value: Boolean): Self = StObject.set(x, "escPressed", value.asInstanceOf[js.Any])
    
    inline def setEscPressedUndefined: Self = StObject.set(x, "escPressed", js.undefined)
  }
}
