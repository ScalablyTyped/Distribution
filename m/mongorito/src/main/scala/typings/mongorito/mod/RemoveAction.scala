package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REMOVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAction extends Action {
  
  var `type`: REMOVE = js.native
}
object RemoveAction {
  
  @scala.inline
  def apply(`type`: REMOVE): RemoveAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAction]
  }
  
  @scala.inline
  implicit class RemoveActionMutableBuilder[Self <: RemoveAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: REMOVE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
