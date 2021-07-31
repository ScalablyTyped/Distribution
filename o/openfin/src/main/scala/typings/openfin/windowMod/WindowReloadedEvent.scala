package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowReloadedEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var url: String
}
object WindowReloadedEvent {
  
  @scala.inline
  def apply[Topic, Type](name: String, topic: Topic, `type`: Type, url: String, uuid: String): WindowReloadedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowReloadedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowReloadedEventMutableBuilder[Self <: WindowReloadedEvent[?, ?], Topic, Type] (val x: Self & (WindowReloadedEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
