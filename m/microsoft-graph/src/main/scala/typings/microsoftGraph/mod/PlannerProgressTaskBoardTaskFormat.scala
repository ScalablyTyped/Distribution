package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerProgressTaskBoardTaskFormat extends Entity {
  // Hint value used to order the task on the Progress view of the Task Board. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.native
}

object PlannerProgressTaskBoardTaskFormat {
  @scala.inline
  def apply(): PlannerProgressTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerProgressTaskBoardTaskFormat]
  }
  @scala.inline
  implicit class PlannerProgressTaskBoardTaskFormatOps[Self <: PlannerProgressTaskBoardTaskFormat] (val x: Self) extends AnyVal {
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
    def setOrderHint(value: String): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
  }
  
}

