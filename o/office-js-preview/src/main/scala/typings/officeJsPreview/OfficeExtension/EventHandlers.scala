package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventHandlers[T] extends js.Object {
  /**
    * Adds a function to be called when the event is triggered.
    * @param handler A promise-based function that takes in any relevant event arguments.
    */
  def add(handler: js.Function1[/* args */ T, js.Promise[_]]): EventHandlerResult[T]
  /**
    * Removes the specified function from the event handler list so that it will not be called on subsequent events. 
    * 
    * **Note**: The same {@link OfficeExtension.ClientRequestContext | RequestContext} object that the handler was added in must be used when removing the handler. 
    * More information can be found in {@link https://docs.microsoft.com/office/dev/add-ins/develop/common-coding-issues#removing-event-handlers | Coding guidance for common issues and unexpected platform behaviors}. 
    * 
    * @param handler A reference to a function previously provided to the `add` method as an event handler. 
    */
  def remove(handler: js.Function1[/* args */ T, js.Promise[_]]): Unit
}

object EventHandlers {
  @scala.inline
  def apply[T](
    add: js.Function1[/* args */ T, js.Promise[_]] => EventHandlerResult[T],
    remove: js.Function1[/* args */ T, js.Promise[_]] => Unit
  ): EventHandlers[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[EventHandlers[T]]
  }
}

