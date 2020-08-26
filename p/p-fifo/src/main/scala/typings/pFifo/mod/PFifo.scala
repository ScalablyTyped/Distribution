package typings.pFifo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PFifo[T] extends js.Object {
  def isEmpty(): Boolean = js.native
  def push(chunk: T): js.Promise[Unit] = js.native
  def shift(): js.Promise[T] = js.native
}

object PFifo {
  @scala.inline
  def apply[T](isEmpty: () => Boolean, push: T => js.Promise[Unit], shift: () => js.Promise[T]): PFifo[T] = {
    val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift))
    __obj.asInstanceOf[PFifo[T]]
  }
  @scala.inline
  implicit class PFifoOps[Self <: PFifo[_], T] (val x: Self with PFifo[T]) extends AnyVal {
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
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: T => js.Promise[Unit]): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setShift(value: () => js.Promise[T]): Self = this.set("shift", js.Any.fromFunction0(value))
  }
  
}

