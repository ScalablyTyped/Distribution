package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.CREATE_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexAction
  extends StObject
     with Action {
  
  var args: js.Array[js.Any]
  
  var `type`: CREATE_INDEX
}
object CreateIndexAction {
  
  inline def apply(args: js.Array[js.Any], `type`: CREATE_INDEX): CreateIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexAction]
  }
  
  extension [Self <: CreateIndexAction](x: Self) {
    
    inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setType(value: CREATE_INDEX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
