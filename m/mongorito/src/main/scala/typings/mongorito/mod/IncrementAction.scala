package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.INCREMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncrementAction extends Action {
  
  var fields: js.Object = js.native
  
  var `type`: INCREMENT = js.native
}
object IncrementAction {
  
  @scala.inline
  def apply(fields: js.Object, `type`: INCREMENT): IncrementAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementAction]
  }
  
  @scala.inline
  implicit class IncrementActionMutableBuilder[Self <: IncrementAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: INCREMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
