package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.SET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAction
  extends StObject
     with Action {
  
  var fields: js.Object
  
  var `type`: SET
}
object SetAction {
  
  inline def apply(fields: js.Object, `type`: SET): SetAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetAction] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setType(value: SET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
