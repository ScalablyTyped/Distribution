package typings.mnemonist.fixedReverseHeapMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedReverseHeap[T] extends js.Object {
  // Members
  var capacity: Double = js.native
  var size: Double = js.native
  // Methods
  def clear(): Unit = js.native
  def consume(): Iterable[T] = js.native
  def inspect(): js.Any = js.native
  def push(item: T): Double = js.native
  def toArray(): Iterable[T] = js.native
}

object FixedReverseHeap {
  @scala.inline
  def apply[T](
    capacity: Double,
    clear: () => Unit,
    consume: () => Iterable[T],
    inspect: () => js.Any,
    push: T => Double,
    size: Double,
    toArray: () => Iterable[T]
  ): FixedReverseHeap[T] = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), consume = js.Any.fromFunction0(consume), inspect = js.Any.fromFunction0(inspect), push = js.Any.fromFunction1(push), size = size.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[FixedReverseHeap[T]]
  }
  @scala.inline
  implicit class FixedReverseHeapOps[Self <: FixedReverseHeap[_], T] (val x: Self with FixedReverseHeap[T]) extends AnyVal {
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
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setConsume(value: () => Iterable[T]): Self = this.set("consume", js.Any.fromFunction0(value))
    @scala.inline
    def setInspect(value: () => js.Any): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: T => Double): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setToArray(value: () => Iterable[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
  
}

