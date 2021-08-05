package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.CREATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAction
  extends StObject
     with Action {
  
  var id: js.Object
  
  var `type`: CREATE
}
object CreateAction {
  
  inline def apply(id: js.Object, `type`: CREATE): CreateAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAction]
  }
  
  extension [Self <: CreateAction](x: Self) {
    
    inline def setId(value: js.Object): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: CREATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
