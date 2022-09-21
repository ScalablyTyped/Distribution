package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.Handles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  var enter: Handles
  
  var exit: Handles
}
object Enter {
  
  inline def apply(enter: Handles, exit: Handles): Enter = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enter]
  }
  
  extension [Self <: Enter](x: Self) {
    
    inline def setEnter(value: Handles): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setExit(value: Handles): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
