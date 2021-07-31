package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.CREATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedAction
  extends StObject
     with Action {
  
  var id: js.Object
  
  var `type`: CREATED
}
object CreatedAction {
  
  @scala.inline
  def apply(id: js.Object, `type`: CREATED): CreatedAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedAction]
  }
  
  @scala.inline
  implicit class CreatedActionMutableBuilder[Self <: CreatedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Object): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CREATED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
