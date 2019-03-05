package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueClass[EnqueueOptionsType /* <: QueueAddOptions */] extends js.Object {
  var size: scala.Double = js.native
  def dequeue(): js.UndefOr[js.Function0[scala.Unit]] = js.native
  def enqueue(run: js.Function0[scala.Unit]): scala.Unit = js.native
  def enqueue(run: js.Function0[scala.Unit], options: EnqueueOptionsType): scala.Unit = js.native
}

