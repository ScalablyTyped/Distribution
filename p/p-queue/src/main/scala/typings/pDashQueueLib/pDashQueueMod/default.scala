package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-queue", JSImport.Default)
@js.native
class default[QueueType /* <: pDashQueueLib.distQueueMod.Queue[EnqueueOptionsType] */, EnqueueOptionsType /* <: pDashQueueLib.distOptionsMod.QueueAddOptions */] () extends PQueue[QueueType, EnqueueOptionsType] {
  def this(options: pDashQueueLib.distOptionsMod.Options[QueueType, EnqueueOptionsType]) = this()
}

