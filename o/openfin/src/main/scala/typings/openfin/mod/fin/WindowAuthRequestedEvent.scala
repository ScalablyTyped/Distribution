package typings.openfin.mod.fin

import typings.openfin.anon.Host
import typings.openfin.openfinStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowAuthRequestedEvent extends WindowBaseEvent {
  
  var authInfo: Host = js.native
}
object WindowAuthRequestedEvent {
  
  @scala.inline
  def apply(authInfo: Host, name: String, topic: window, `type`: OpenFinWindowEventType, uuid: String): WindowAuthRequestedEvent = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent]
  }
  
  @scala.inline
  implicit class WindowAuthRequestedEventMutableBuilder[Self <: WindowAuthRequestedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthInfo(value: Host): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
  }
}
