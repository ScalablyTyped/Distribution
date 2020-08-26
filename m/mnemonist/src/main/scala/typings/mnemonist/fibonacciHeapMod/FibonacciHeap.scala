package typings.mnemonist.fibonacciHeapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FibonacciHeap[T] extends js.Object {
  // Members
  var size: Double = js.native
  // Methods
  def clear(): Unit = js.native
  def inspect(): js.Any = js.native
  def peek(): js.UndefOr[T] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(item: T): Double = js.native
}

object FibonacciHeap {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    inspect: () => js.Any,
    peek: () => js.UndefOr[T],
    pop: () => js.UndefOr[T],
    push: T => Double,
    size: Double
  ): FibonacciHeap[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), inspect = js.Any.fromFunction0(inspect), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FibonacciHeap[T]]
  }
  @scala.inline
  implicit class FibonacciHeapOps[Self <: FibonacciHeap[_], T] (val x: Self with FibonacciHeap[T]) extends AnyVal {
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
    def setInspect(value: () => js.Any): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setPeek(value: () => js.UndefOr[T]): Self = this.set("peek", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: () => js.UndefOr[T]): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: T => Double): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

