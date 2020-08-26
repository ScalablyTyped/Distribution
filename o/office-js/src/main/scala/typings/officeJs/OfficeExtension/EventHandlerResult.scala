package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandlerResult[T] extends js.Object {
  /** The request context associated with the object */
  var context: ClientRequestContext = js.native
  def remove(): Unit = js.native
}

object EventHandlerResult {
  @scala.inline
  def apply[T](context: ClientRequestContext, remove: () => Unit): EventHandlerResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[EventHandlerResult[T]]
  }
  @scala.inline
  implicit class EventHandlerResultOps[Self <: EventHandlerResult[_], T] (val x: Self with EventHandlerResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: ClientRequestContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

