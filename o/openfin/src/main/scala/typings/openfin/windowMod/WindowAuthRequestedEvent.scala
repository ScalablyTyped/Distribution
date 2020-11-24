package typings.openfin.windowMod

import typings.openfin.anon.Host
import typings.openfin.eventsBaseMod.WindowEvent
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
  implicit class WindowAuthRequestedEventOps[Self <: WindowAuthRequestedEvent[_, _], Topic, Type] (val x: Self with (WindowAuthRequestedEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthInfo(value: Host): Self = this.set("authInfo", value.asInstanceOf[js.Any])
  }
}
