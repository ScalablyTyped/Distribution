package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventHandlers[T] extends js.Object {
  def add(handler: js.Function1[/* args */ T, js.Promise[_]]): EventHandlerResult[T]
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

