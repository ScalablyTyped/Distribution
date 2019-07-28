package typings.pDashQueue.pDashQueueMod

import typings.pDashQueue.distOptionsMod.Options
import typings.pDashQueue.distOptionsMod.QueueAddOptions
import typings.pDashQueue.distQueueMod.Queue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-queue", JSImport.Default)
@js.native
class default[QueueType /* <: Queue[EnqueueOptionsType] */, EnqueueOptionsType /* <: QueueAddOptions */] () extends PQueue[QueueType, EnqueueOptionsType] {
  def this(options: Options[QueueType, EnqueueOptionsType]) = this()
}

