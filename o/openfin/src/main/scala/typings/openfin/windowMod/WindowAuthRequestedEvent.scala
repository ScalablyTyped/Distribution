package typings.openfin.windowMod

import typings.openfin.anon.Host
import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowAuthRequestedEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var authInfo: Host
}
object WindowAuthRequestedEvent {
  
  inline def apply[Topic, Type](authInfo: Host, name: String, topic: Topic, `type`: Type, uuid: String): WindowAuthRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent[Topic, Type]]
  }
  
  extension [Self <: WindowAuthRequestedEvent[?, ?], Topic, Type](x: Self & (WindowAuthRequestedEvent[Topic, Type])) {
    
    inline def setAuthInfo(value: Host): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
  }
}
