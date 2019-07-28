package typings.ol.structsPriorityQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueue[T] extends js.Object {
  def clear(): Unit
  def dequeue(): T
  def enqueue(element: T): Boolean
  def getCount(): Double
  def isEmpty(): Boolean
  def isKeyQueued(key: String): Boolean
  def isQueued(element: T): Boolean
  def reprioritize(): Unit
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
}

