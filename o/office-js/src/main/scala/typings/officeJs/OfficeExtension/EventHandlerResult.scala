package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeExtension.EventHandlerResult")
@js.native
class EventHandlerResult[T] protected () extends js.Object {
  def this(
    context: ClientRequestContext,
    handlers: EventHandlers[T],
    handler: js.Function1[/* args */ T, js.Promise[_]]
  ) = this()
  /** The request context associated with the object */
  var context: ClientRequestContext = js.native
  def remove(): Unit = js.native
}

