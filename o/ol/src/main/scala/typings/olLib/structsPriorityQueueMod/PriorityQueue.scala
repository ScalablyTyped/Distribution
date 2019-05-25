package typings
package olLib.structsPriorityQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueue[T] extends js.Object {
  def clear(): scala.Unit
  def dequeue(): T
  def enqueue(element: T): scala.Boolean
  def getCount(): scala.Double
  def isEmpty(): scala.Boolean
  def isKeyQueued(key: java.lang.String): scala.Boolean
  def isQueued(element: T): scala.Boolean
  def reprioritize(): scala.Unit
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    clear: () => scala.Unit,
    dequeue: () => T,
    enqueue: T => scala.Boolean,
    getCount: () => scala.Double,
    isEmpty: () => scala.Boolean,
    isKeyQueued: java.lang.String => scala.Boolean,
    isQueued: T => scala.Boolean,
    reprioritize: () => scala.Unit
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), getCount = js.Any.fromFunction0(getCount), isEmpty = js.Any.fromFunction0(isEmpty), isKeyQueued = js.Any.fromFunction1(isKeyQueued), isQueued = js.Any.fromFunction1(isQueued), reprioritize = js.Any.fromFunction0(reprioritize))
  
    __obj.asInstanceOf[PriorityQueue[T]]
  }
}

