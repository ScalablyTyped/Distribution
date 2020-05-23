package typings.pQueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions>> */
trait ReadonlyPartialPriorityQu extends js.Object {
  val priority: js.UndefOr[Double] = js.undefined
}

object ReadonlyPartialPriorityQu {
  @scala.inline
  def apply(priority: js.UndefOr[Double] = js.undefined): ReadonlyPartialPriorityQu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPartialPriorityQu]
  }
}

