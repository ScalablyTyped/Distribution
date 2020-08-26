package typings.naja.anon

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[T /* <: Event */] extends js.Object {
  def handleEvent(event: T): js.Promise[Unit] | Unit = js.native
}

object `0` {
  @scala.inline
  def apply[/* <: typings.std.Event */ T](handleEvent: T => js.Promise[Unit] | Unit): `0`[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[`0`[T]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], /* <: typings.std.Event */ T] (val x: Self with `0`[T]) extends AnyVal {
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
    def setHandleEvent(value: T => js.Promise[Unit] | Unit): Self = this.set("handleEvent", js.Any.fromFunction1(value))
  }
  
}

