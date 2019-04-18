package typings
package microeventDotTsLib.microeventLibEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event[EventPayload]
  extends microeventDotTsLib.microeventLibEventInterfaceMod.EventInterface[EventPayload] {
  var _contexts: js.Any = js.native
  var _handlers: js.Any = js.native
  var hasHandlers: scala.Boolean = js.native
  /* private */ def _createDispatcher(): js.Any = js.native
  /* private */ def _getHandlerIndex[T](handler: js.Any): js.Any = js.native
  /* private */ def _getHandlerIndex[T](handler: js.Any, context: js.Any): js.Any = js.native
  /* private */ def _updateHasHandlers(): js.Any = js.native
  def dispatch(payload: EventPayload): scala.Unit = js.native
  def isHandlerAttached[T](
    handler: microeventDotTsLib.microeventLibEventInterfaceMod.EventInterfaceNs.HandlerInterface[EventPayload, T]
  ): scala.Boolean = js.native
  def isHandlerAttached[T](
    handler: microeventDotTsLib.microeventLibEventInterfaceMod.EventInterfaceNs.HandlerInterface[EventPayload, T],
    context: T
  ): scala.Boolean = js.native
}

