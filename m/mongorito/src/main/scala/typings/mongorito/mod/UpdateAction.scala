package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAction
  extends StObject
     with Action {
  
  var fields: js.Object
  
  var `type`: UPDATE
}
object UpdateAction {
  
  inline def apply(fields: js.Object, `type`: UPDATE): UpdateAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAction] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setType(value: UPDATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
