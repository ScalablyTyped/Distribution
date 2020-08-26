package typings.pQueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions>> */
@js.native
trait ReadonlyPartialPriorityQu extends js.Object {
  val priority: js.UndefOr[Double] = js.native
}

object ReadonlyPartialPriorityQu {
  @scala.inline
  def apply(): ReadonlyPartialPriorityQu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPartialPriorityQu]
  }
  @scala.inline
  implicit class ReadonlyPartialPriorityQuOps[Self <: ReadonlyPartialPriorityQu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

