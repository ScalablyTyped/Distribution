package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ALWAYS extends StObject {
  
  var ALWAYS: String
  
  var NEVER: String
  
  var ON_DEMAND: String
}
object ALWAYS {
  
  inline def apply(ALWAYS: String, NEVER: String, ON_DEMAND: String): ALWAYS = {
    val __obj = js.Dynamic.literal(ALWAYS = ALWAYS.asInstanceOf[js.Any], NEVER = NEVER.asInstanceOf[js.Any], ON_DEMAND = ON_DEMAND.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALWAYS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ALWAYS] (val x: Self) extends AnyVal {
    
    inline def setALWAYS(value: String): Self = StObject.set(x, "ALWAYS", value.asInstanceOf[js.Any])
    
    inline def setNEVER(value: String): Self = StObject.set(x, "NEVER", value.asInstanceOf[js.Any])
    
    inline def setON_DEMAND(value: String): Self = StObject.set(x, "ON_DEMAND", value.asInstanceOf[js.Any])
  }
}
