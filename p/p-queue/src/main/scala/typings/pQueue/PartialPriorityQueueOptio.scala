package typings.pQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions> */
trait PartialPriorityQueueOptio extends js.Object {
  var priority: js.UndefOr[Double] = js.undefined
}

object PartialPriorityQueueOptio {
  @scala.inline
  def apply(priority: Int | Double = null): PartialPriorityQueueOptio = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPriorityQueueOptio]
  }
}

