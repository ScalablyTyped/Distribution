package typings.nats.typesMod

import typings.nats.anon.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var data: String | ServersChanged | Double
  
  var permissionContext: js.UndefOr[Operation] = js.undefined
  
  var `type`: Events | DebugEvents
}
object Status {
  
  inline def apply(data: String | ServersChanged | Double, `type`: Events | DebugEvents): Status = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setData(value: String | ServersChanged | Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPermissionContext(value: Operation): Self = StObject.set(x, "permissionContext", value.asInstanceOf[js.Any])
    
    inline def setPermissionContextUndefined: Self = StObject.set(x, "permissionContext", js.undefined)
    
    inline def setType(value: Events | DebugEvents): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
