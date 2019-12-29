package typings.microeventDotTs

import typings.microeventDotTs.microeventLibEventInterfaceMod.EventInterface
import typings.microeventDotTs.microeventLibEventInterfaceMod.EventInterface.HandlerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microevent/lib/Event", JSImport.Namespace)
@js.native
object microeventLibEventMod extends js.Object {
  @js.native
  trait Event[EventPayload] extends EventInterface[EventPayload] {
    var _contexts: js.Any = js.native
    var _createDispatcher: js.Any = js.native
    var _getHandlerIndex: js.Any = js.native
    var _handlers: js.Any = js.native
    var _updateHasHandlers: js.Any = js.native
    var hasHandlers: Boolean = js.native
    def dispatch(payload: EventPayload): Unit = js.native
    def isHandlerAttached[T](handler: HandlerInterface[EventPayload, T]): Boolean = js.native
    def isHandlerAttached[T](handler: HandlerInterface[EventPayload, T], context: T): Boolean = js.native
  }
  
  @js.native
  class default[EventPayload] () extends Event[EventPayload]
  
}

