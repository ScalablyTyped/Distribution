package typings.microeventTs

import typings.microeventTs.eventInterfaceMod.EventInterface
import typings.microeventTs.eventInterfaceMod.EventInterface.HandlerInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("microevent/lib/Event", JSImport.Default)
  @js.native
  class default[EventPayload] () extends Event[EventPayload]
  
  @js.native
  trait Event[EventPayload] extends EventInterface[EventPayload] {
    
    var _contexts: js.Any = js.native
    
    var _createDispatcher: js.Any = js.native
    
    var _getHandlerIndex: js.Any = js.native
    
    var _handlers: js.Any = js.native
    
    var _updateHasHandlers: js.Any = js.native
    
    def dispatch(payload: EventPayload): Unit = js.native
    
    var hasHandlers: Boolean = js.native
    
    def isHandlerAttached[T](handler: HandlerInterface[EventPayload, T]): Boolean = js.native
    def isHandlerAttached[T](handler: HandlerInterface[EventPayload, T], context: T): Boolean = js.native
  }
}
