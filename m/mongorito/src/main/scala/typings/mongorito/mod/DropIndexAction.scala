package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.DROP_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropIndexAction
  extends StObject
     with Action {
  
  var args: js.Array[js.Any]
  
  var `type`: DROP_INDEX
}
object DropIndexAction {
  
  inline def apply(args: js.Array[js.Any], `type`: DROP_INDEX): DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexAction]
  }
  
  extension [Self <: DropIndexAction](x: Self) {
    
    inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setType(value: DROP_INDEX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
