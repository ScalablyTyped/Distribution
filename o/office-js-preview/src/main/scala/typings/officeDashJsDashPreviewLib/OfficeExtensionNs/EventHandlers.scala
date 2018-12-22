package typings
package officeDashJsDashPreviewLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeExtension.EventHandlers")
@js.native
class EventHandlers[T] protected () extends js.Object {
  def this(context: ClientRequestContext, parentObject: ClientObject, name: java.lang.String, eventInfo: EventInfo[T]) = this()
  def add(handler: js.Function1[/* args */ T, js.Promise[_]]): EventHandlerResult[T] = js.native
  def remove(handler: js.Function1[/* args */ T, js.Promise[_]]): scala.Unit = js.native
}

