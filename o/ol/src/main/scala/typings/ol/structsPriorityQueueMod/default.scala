package typings.ol.structsPriorityQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/structs/PriorityQueue", JSImport.Default)
@js.native
class default[T] protected () extends PriorityQueue[T] {
  def this(priorityFunction: js.Function1[/* p0 */ T, Double], keyFunction: js.Function1[/* p0 */ T, String]) = this()
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def dequeue(): T = js.native
  /* CompleteClass */
  override def enqueue(element: T): Boolean = js.native
  /* CompleteClass */
  override def getCount(): Double = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def isKeyQueued(key: String): Boolean = js.native
  /* CompleteClass */
  override def isQueued(element: T): Boolean = js.native
  /* CompleteClass */
  override def reprioritize(): Unit = js.native
}

