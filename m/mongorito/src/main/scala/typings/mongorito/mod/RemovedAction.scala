package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REMOVED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovedAction
  extends StObject
     with Action {
  
  var `type`: REMOVED
}
object RemovedAction {
  
  @scala.inline
  def apply(`type`: REMOVED): RemovedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedAction]
  }
  
  @scala.inline
  implicit class RemovedActionMutableBuilder[Self <: RemovedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: REMOVED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
