package typings.mirrorx.mod

import typings.mirrorx.mirrorxStrings.`@@routerSlashCALL_HISTORY_METHOD`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterAction extends StObject {
  
  var payload: LocationActionPayload = js.native
  
  var `type`: `@@routerSlashCALL_HISTORY_METHOD` = js.native
}
object RouterAction {
  
  @scala.inline
  def apply(payload: LocationActionPayload, `type`: `@@routerSlashCALL_HISTORY_METHOD`): RouterAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterAction]
  }
  
  @scala.inline
  implicit class RouterActionMutableBuilder[Self <: RouterAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: LocationActionPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `@@routerSlashCALL_HISTORY_METHOD`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
