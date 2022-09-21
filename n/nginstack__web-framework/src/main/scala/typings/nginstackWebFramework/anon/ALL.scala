package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ALL extends StObject {
  
  var ALL: String
  
  var FILLED: String
  
  var NONE: String
}
object ALL {
  
  inline def apply(ALL: String, FILLED: String, NONE: String): ALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], FILLED = FILLED.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALL]
  }
  
  extension [Self <: ALL](x: Self) {
    
    inline def setALL(value: String): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
    
    inline def setFILLED(value: String): Self = StObject.set(x, "FILLED", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: String): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
  }
}
