package typings
package pDashQueueLib.pDashQueueMod.PQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueClass[O /* <: QueueAddOptions */] extends js.Object {
  var size: scala.Double = js.native
  def dequeue(): js.UndefOr[js.Function0[scala.Unit]] = js.native
  def enqueue(run: js.Function0[scala.Unit]): scala.Unit = js.native
  def enqueue(run: js.Function0[scala.Unit], options: O): scala.Unit = js.native
}

