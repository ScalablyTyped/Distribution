package typings.mirrorx.mod

import typings.mirrorx.mirrorxStrings.`@@routerSlashCALL_HISTORY_METHOD`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterAction extends StObject {
  
  var payload: LocationActionPayload
  
  var `type`: `@@routerSlashCALL_HISTORY_METHOD`
}
object RouterAction {
  
  inline def apply(payload: LocationActionPayload): RouterAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("@@router/CALL_HISTORY_METHOD")
    __obj.asInstanceOf[RouterAction]
  }
  
  extension [Self <: RouterAction](x: Self) {
    
    inline def setPayload(value: LocationActionPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: `@@routerSlashCALL_HISTORY_METHOD`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
