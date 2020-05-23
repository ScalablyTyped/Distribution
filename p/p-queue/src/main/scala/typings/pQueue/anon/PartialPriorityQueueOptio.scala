package typings.pQueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions> */
trait PartialPriorityQueueOptio extends js.Object {
  var priority: js.UndefOr[Double] = js.undefined
}

object PartialPriorityQueueOptio {
  @scala.inline
  def apply(priority: js.UndefOr[Double] = js.undefined): PartialPriorityQueueOptio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPriorityQueueOptio]
  }
}

