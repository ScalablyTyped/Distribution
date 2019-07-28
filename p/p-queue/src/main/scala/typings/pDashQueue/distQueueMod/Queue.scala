package typings.pDashQueue.distQueueMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue[Options] extends js.Object {
  var size: Double = js.native
  def dequeue(): js.UndefOr[RunFunction] = js.native
  def enqueue(run: RunFunction): Unit = js.native
  def enqueue(run: RunFunction, options: Partial[Options]): Unit = js.native
}

