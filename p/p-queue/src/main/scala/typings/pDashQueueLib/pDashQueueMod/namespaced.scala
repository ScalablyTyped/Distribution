package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Promise queue with concurrency control.
  */
@JSImport("p-queue", JSImport.Namespace)
@js.native
class namespaced[TEnqueueOptions /* <: pDashQueueLib.pDashQueueMod.PQueueNs.QueueAddOptions */] () extends PQueue[TEnqueueOptions] {
  def this(opts: pDashQueueLib.pDashQueueMod.PQueueNs.Options[TEnqueueOptions]) = this()
}

