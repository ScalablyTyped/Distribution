package typings
package olLib.structsPriorityQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/structs/PriorityQueue", JSImport.Default)
@js.native
class default[T] protected () extends PriorityQueue[T] {
  def this(priorityFunction: js.Function1[/* param0 */ T, scala.Double], keyFunction: js.Function1[/* param0 */ T, java.lang.String]) = this()
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def dequeue(): T = js.native
  /* CompleteClass */
  override def enqueue(element: T): scala.Boolean = js.native
  /* CompleteClass */
  override def getCount(): scala.Double = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def isKeyQueued(key: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def isQueued(element: T): scala.Boolean = js.native
  /* CompleteClass */
  override def reprioritize(): scala.Unit = js.native
}

