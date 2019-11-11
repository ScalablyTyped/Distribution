package typings.pDashQueue.distPriorityDashQueueMod

import typings.pDashQueue.distQueueMod.Queue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue extends Queue[PriorityQueueOptions] {
  val _queue: js.Any = js.native
  @JSName("size")
  def size_MPriorityQueue(): Double = js.native
}

