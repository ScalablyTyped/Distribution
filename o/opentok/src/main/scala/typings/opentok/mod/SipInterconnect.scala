package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipInterconnect extends StObject {
  
  var connectionId: String
  
  var id: String
  
  var streamId: String
}
object SipInterconnect {
  
  inline def apply(connectionId: String, id: String, streamId: String): SipInterconnect = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SipInterconnect]
  }
  
  extension [Self <: SipInterconnect](x: Self) {
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
