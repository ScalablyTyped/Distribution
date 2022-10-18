package typings.microeventTs

import typings.microeventTs.microeventLibEventInterfaceMod.EventInterface
import typings.microeventTs.microeventLibEventInterfaceMod.EventInterface.HandlerInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object microeventLibEventMod {
  
  @JSImport("microevent/lib/Event", JSImport.Default)
  @js.native
  open class default[EventPayload] ()
    extends StObject
       with Event[EventPayload]
  
  @js.native
  trait Event[EventPayload]
    extends StObject
       with EventInterface[EventPayload] {
    
    /* private */ var _contexts: Any = js.native
    
    /* private */ var _createDispatcher: Any = js.native
    
    /* private */ var _getHandlerIndex: Any = js.native
    
    /* private */ var _handlers: Any = js.native
    
    /* private */ var _updateHasHandlers: Any = js.native
    
    def dispatch(payload: EventPayload): Unit = js.native
    
    var hasHandlers: Boolean = js.native
    
    def isHandlerAttached[T](handler: HandlerInterface[EventPayload, T]): Boolean = js.native
    def isHandlerAttached[T](handler: HandlerInterface[EventPayload, T], context: T): Boolean = js.native
  }
}
