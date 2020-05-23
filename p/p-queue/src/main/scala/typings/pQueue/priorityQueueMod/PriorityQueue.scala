package typings.pQueue.priorityQueueMod

import typings.pQueue.anon.PartialPriorityQueueOptio
import typings.pQueue.anon.ReadonlyPartialPriorityQu
import typings.pQueue.queueMod.Queue
import typings.pQueue.queueMod.RunFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue extends Queue[RunFunction, PriorityQueueOptions] {
  val _queue: js.Any = js.native
  def enqueue(run: RunFunction, options: PartialPriorityQueueOptio): Unit = js.native
  def filter(options: ReadonlyPartialPriorityQu): js.Array[RunFunction] = js.native
  @JSName("size")
  def size_MPriorityQueue: Double = js.native
}

