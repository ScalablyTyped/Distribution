package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.SAVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveAction
  extends StObject
     with Action {
  
  var fields: js.Object
  
  var `type`: SAVE
}
object SaveAction {
  
  @scala.inline
  def apply(fields: js.Object, `type`: SAVE): SaveAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAction]
  }
  
  @scala.inline
  implicit class SaveActionMutableBuilder[Self <: SaveAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SAVE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
