package typings.openfin.mod.fin

import typings.openfin.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowAuthRequested
  extends StObject
     with WindowEvent {
  
  var authInfo: Host
}
object WindowAuthRequested {
  
  inline def apply(authInfo: Host, name: String, topic: String, `type`: OpenFinApplicationEventType, uuid: String): WindowAuthRequested = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequested]
  }
  
  extension [Self <: WindowAuthRequested](x: Self) {
    
    inline def setAuthInfo(value: Host): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
  }
}
