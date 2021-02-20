package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowExternalProcessStartedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var processUuid: String = js.native
}
object WindowExternalProcessStartedEvent {
  
  @scala.inline
  def apply[Topic, Type](name: String, processUuid: String, topic: Topic, `type`: Type, uuid: String): WindowExternalProcessStartedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessStartedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowExternalProcessStartedEventMutableBuilder[Self <: WindowExternalProcessStartedEvent[_, _], Topic, Type] (val x: Self with (WindowExternalProcessStartedEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setProcessUuid(value: String): Self = StObject.set(x, "processUuid", value.asInstanceOf[js.Any])
  }
}
