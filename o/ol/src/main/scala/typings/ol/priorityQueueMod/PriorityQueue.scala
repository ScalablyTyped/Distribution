package typings.ol.priorityQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue[T] extends js.Object {
  def clear(): Unit = js.native
  def dequeue(): T = js.native
  def enqueue(element: T): Boolean = js.native
  def getCount(): Double = js.native
  def isEmpty(): Boolean = js.native
  def isKeyQueued(key: String): Boolean = js.native
  def isQueued(element: T): Boolean = js.native
  def reprioritize(): Unit = js.native
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    dequeue: () => T,
    enqueue: T => Boolean,
    getCount: () => Double,
    isEmpty: () => Boolean,
    isKeyQueued: String => Boolean,
    isQueued: T => Boolean,
    reprioritize: () => Unit
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), getCount = js.Any.fromFunction0(getCount), isEmpty = js.Any.fromFunction0(isEmpty), isKeyQueued = js.Any.fromFunction1(isKeyQueued), isQueued = js.Any.fromFunction1(isQueued), reprioritize = js.Any.fromFunction0(reprioritize))
    __obj.asInstanceOf[PriorityQueue[T]]
  }
  @scala.inline
  implicit class PriorityQueueOps[Self <: PriorityQueue[_], T] (val x: Self with PriorityQueue[T]) extends AnyVal {
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
    def setDequeue(value: () => T): Self = this.set("dequeue", js.Any.fromFunction0(value))
    @scala.inline
    def setEnqueue(value: T => Boolean): Self = this.set("enqueue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setIsKeyQueued(value: String => Boolean): Self = this.set("isKeyQueued", js.Any.fromFunction1(value))
    @scala.inline
    def setIsQueued(value: T => Boolean): Self = this.set("isQueued", js.Any.fromFunction1(value))
    @scala.inline
    def setReprioritize(value: () => Unit): Self = this.set("reprioritize", js.Any.fromFunction0(value))
  }
  
}

