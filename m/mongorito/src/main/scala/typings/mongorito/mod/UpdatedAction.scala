package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.UPDATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatedAction
  extends StObject
     with Action {
  
  var fields: js.Object
  
  var `type`: UPDATED
}
object UpdatedAction {
  
  inline def apply(fields: js.Object, `type`: UPDATED): UpdatedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatedAction] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setType(value: UPDATED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
