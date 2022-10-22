package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.DROP_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropIndexAction
  extends StObject
     with Action {
  
  var args: js.Array[Any]
  
  var `type`: DROP_INDEX
}
object DropIndexAction {
  
  inline def apply(args: js.Array[Any], `type`: DROP_INDEX): DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexAction]
  }
  
  extension [Self <: DropIndexAction](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setType(value: DROP_INDEX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
