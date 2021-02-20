package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAction extends Action {
  
  var fields: js.Object = js.native
  
  var `type`: UPDATE = js.native
}
object UpdateAction {
  
  @scala.inline
  def apply(fields: js.Object, `type`: UPDATE): UpdateAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAction]
  }
  
  @scala.inline
  implicit class UpdateActionMutableBuilder[Self <: UpdateAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UPDATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
