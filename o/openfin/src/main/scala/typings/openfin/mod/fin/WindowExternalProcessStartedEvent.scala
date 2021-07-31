package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`external-process-started`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowExternalProcessStartedEvent
  extends StObject
     with WindowBaseEvent {
  
  /**
    * the process handle uuid
    */
  var processUuid: String
  
  @JSName("type")
  var type_WindowExternalProcessStartedEvent: `external-process-started`
}
object WindowExternalProcessStartedEvent {
  
  @scala.inline
  def apply(name: String, processUuid: String, uuid: String): WindowExternalProcessStartedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = "window", uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("external-process-started")
    __obj.asInstanceOf[WindowExternalProcessStartedEvent]
  }
  
  @scala.inline
  implicit class WindowExternalProcessStartedEventMutableBuilder[Self <: WindowExternalProcessStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessUuid(value: String): Self = StObject.set(x, "processUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `external-process-started`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
