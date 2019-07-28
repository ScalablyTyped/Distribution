package typings.microeventDotTs.microeventLibEventMod

import typings.microeventDotTs.microeventLibEventInterfaceMod.EventInterface
import typings.microeventDotTs.microeventLibEventInterfaceMod.EventInterfaceNs.HandlerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

