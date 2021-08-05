package typings.openfin.mod.fin

import typings.openfin.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowAuthRequestedEvent
  extends StObject
     with WindowBaseEvent {
  
  var authInfo: Host
}
object WindowAuthRequestedEvent {
  
  inline def apply(authInfo: Host, name: String, `type`: OpenFinWindowEventType, uuid: String): WindowAuthRequestedEvent = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = "window", uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent]
  }
  
  extension [Self <: WindowAuthRequestedEvent](x: Self) {
    
    inline def setAuthInfo(value: Host): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
  }
}
