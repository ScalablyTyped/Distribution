package typings.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heap[T] extends js.Object {
  // Members
  var size: Double = js.native
  // Methods
  def clear(): Unit = js.native
  def consume(): js.Array[T] = js.native
  def inspect(): js.Any = js.native
  def peek(): js.UndefOr[T] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(item: T): Double = js.native
  def pushpop(): js.UndefOr[T] = js.native
  def replace(): js.UndefOr[T] = js.native
  def toArray(): js.Array[T] = js.native
}

object Heap {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    consume: () => js.Array[T],
    inspect: () => js.Any,
    peek: () => js.UndefOr[T],
    pop: () => js.UndefOr[T],
    push: T => Double,
    pushpop: () => js.UndefOr[T],
    replace: () => js.UndefOr[T],
    size: Double,
    toArray: () => js.Array[T]
  ): Heap[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), consume = js.Any.fromFunction0(consume), inspect = js.Any.fromFunction0(inspect), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), pushpop = js.Any.fromFunction0(pushpop), replace = js.Any.fromFunction0(replace), size = size.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Heap[T]]
  }
  @scala.inline
  implicit class HeapOps[Self <: Heap[_], T] (val x: Self with Heap[T]) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setConsume(value: () => js.Array[T]): Self = this.set("consume", js.Any.fromFunction0(value))
    @scala.inline
    def setInspect(value: () => js.Any): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setPeek(value: () => js.UndefOr[T]): Self = this.set("peek", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: () => js.UndefOr[T]): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: T => Double): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setPushpop(value: () => js.UndefOr[T]): Self = this.set("pushpop", js.Any.fromFunction0(value))
    @scala.inline
    def setReplace(value: () => js.UndefOr[T]): Self = this.set("replace", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
  
}

