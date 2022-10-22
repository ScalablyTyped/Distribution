package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.LIST_INDEXES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndexesAction
  extends StObject
     with Action {
  
  var args: js.Array[Any]
  
  var `type`: LIST_INDEXES
}
object ListIndexesAction {
  
  inline def apply(args: js.Array[Any], `type`: LIST_INDEXES): ListIndexesAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexesAction]
  }
  
  extension [Self <: ListIndexesAction](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setType(value: LIST_INDEXES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
