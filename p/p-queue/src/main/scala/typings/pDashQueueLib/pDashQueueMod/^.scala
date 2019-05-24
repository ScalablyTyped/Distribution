package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Promise queue with concurrency control.
*/
@JSImport("p-queue", JSImport.Namespace)
@js.native
class ^[EnqueueOptionsType /* <: QueueAddOptions */] () extends PQueue[EnqueueOptionsType] {
  def this(options: Options[EnqueueOptionsType]) = this()
}

