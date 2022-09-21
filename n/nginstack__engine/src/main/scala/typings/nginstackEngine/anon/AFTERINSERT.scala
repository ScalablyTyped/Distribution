package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AFTERINSERT extends StObject {
  
  var AFTER_INSERT: Double
  
  var ALWAYS: Double
  
  var FILLED: Double
  
  var NEVER: Double
  
  var ONEDIT: Double
}
object AFTERINSERT {
  
  inline def apply(AFTER_INSERT: Double, ALWAYS: Double, FILLED: Double, NEVER: Double, ONEDIT: Double): AFTERINSERT = {
    val __obj = js.Dynamic.literal(AFTER_INSERT = AFTER_INSERT.asInstanceOf[js.Any], ALWAYS = ALWAYS.asInstanceOf[js.Any], FILLED = FILLED.asInstanceOf[js.Any], NEVER = NEVER.asInstanceOf[js.Any], ONEDIT = ONEDIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFTERINSERT]
  }
  
  extension [Self <: AFTERINSERT](x: Self) {
    
    inline def setAFTER_INSERT(value: Double): Self = StObject.set(x, "AFTER_INSERT", value.asInstanceOf[js.Any])
    
    inline def setALWAYS(value: Double): Self = StObject.set(x, "ALWAYS", value.asInstanceOf[js.Any])
    
    inline def setFILLED(value: Double): Self = StObject.set(x, "FILLED", value.asInstanceOf[js.Any])
    
    inline def setNEVER(value: Double): Self = StObject.set(x, "NEVER", value.asInstanceOf[js.Any])
    
    inline def setONEDIT(value: Double): Self = StObject.set(x, "ONEDIT", value.asInstanceOf[js.Any])
  }
}
