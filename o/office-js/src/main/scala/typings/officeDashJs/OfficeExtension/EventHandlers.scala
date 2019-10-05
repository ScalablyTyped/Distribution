package typings.officeDashJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeExtension.EventHandlers")
@js.native
class EventHandlers[T] protected () extends js.Object {
  def this(context: ClientRequestContext, parentObject: ClientObject, name: String, eventInfo: EventInfo[T]) = this()
  def add(handler: js.Function1[/* args */ T, js.Promise[_]]): EventHandlerResult[T] = js.native
  def remove(handler: js.Function1[/* args */ T, js.Promise[_]]): Unit = js.native
}

