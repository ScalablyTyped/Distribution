package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventInfo[T] extends js.Object {
  def eventArgsTransformFunc(args: js.Any): js.Promise[T] = js.native
  def registerFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_] = js.native
  def unregisterFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_] = js.native
}

object EventInfo {
  @scala.inline
  def apply[T](
    eventArgsTransformFunc: js.Any => js.Promise[T],
    registerFunc: js.Function1[/* args */ js.Any, Unit] => js.Promise[_],
    unregisterFunc: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]
  ): EventInfo[T] = {
    val __obj = js.Dynamic.literal(eventArgsTransformFunc = js.Any.fromFunction1(eventArgsTransformFunc), registerFunc = js.Any.fromFunction1(registerFunc), unregisterFunc = js.Any.fromFunction1(unregisterFunc))
    __obj.asInstanceOf[EventInfo[T]]
  }
  @scala.inline
  implicit class EventInfoOps[Self <: EventInfo[_], T] (val x: Self with EventInfo[T]) extends AnyVal {
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
    def setEventArgsTransformFunc(value: js.Any => js.Promise[T]): Self = this.set("eventArgsTransformFunc", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterFunc(value: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]): Self = this.set("registerFunc", js.Any.fromFunction1(value))
    @scala.inline
    def setUnregisterFunc(value: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]): Self = this.set("unregisterFunc", js.Any.fromFunction1(value))
  }
  
}

