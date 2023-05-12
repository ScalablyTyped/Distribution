package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.anon.FilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEvent extends StObject {
  
  var eventsQueue: EventsQueue
  
  var logger: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootPerfLogger */ Any) | Null
}
object ChangeEvent {
  
  inline def apply(eventsQueue: EventsQueue): ChangeEvent = {
    val __obj = js.Dynamic.literal(eventsQueue = eventsQueue.asInstanceOf[js.Any], logger = null)
    __obj.asInstanceOf[ChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setEventsQueue(value: EventsQueue): Self = StObject.set(x, "eventsQueue", value.asInstanceOf[js.Any])
    
    inline def setEventsQueueVarargs(value: FilePath*): Self = StObject.set(x, "eventsQueue", js.Array(value*))
    
    inline def setLogger(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootPerfLogger */ Any
    ): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerNull: Self = StObject.set(x, "logger", null)
  }
}
