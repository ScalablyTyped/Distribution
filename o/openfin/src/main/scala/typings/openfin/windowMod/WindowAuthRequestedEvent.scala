package typings.openfin.windowMod

import typings.openfin.anon.Host
import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowAuthRequestedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var authInfo: Host = js.native
}
object WindowAuthRequestedEvent {
  
  @scala.inline
  def apply[Topic, Type](authInfo: Host, name: String, topic: Topic, `type`: Type, uuid: String): WindowAuthRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowAuthRequestedEventMutableBuilder[Self <: WindowAuthRequestedEvent[_, _], Topic, Type] (val x: Self with (WindowAuthRequestedEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setAuthInfo(value: Host): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
  }
}
