package typings.mongorito.mod

import typings.mongorito.anon.Args
import typings.mongorito.mod.ActionTypes.CALL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallAction
  extends StObject
     with Action {
  
  var args: js.Array[Args]
  
  var method: String
  
  var `type`: CALL
}
object CallAction {
  
  inline def apply(args: js.Array[Args], method: String, `type`: CALL): CallAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallAction]
  }
  
  extension [Self <: CallAction](x: Self) {
    
    inline def setArgs(value: js.Array[Args]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Args*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setType(value: CALL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
