package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarSharingMessageAction extends js.Object {
  var action: js.UndefOr[CalendarSharingAction] = js.native
  var actionType: js.UndefOr[CalendarSharingActionType] = js.native
  var importance: js.UndefOr[CalendarSharingActionImportance] = js.native
}

object CalendarSharingMessageAction {
  @scala.inline
  def apply(): CalendarSharingMessageAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSharingMessageAction]
  }
  @scala.inline
  implicit class CalendarSharingMessageActionOps[Self <: CalendarSharingMessageAction] (val x: Self) extends AnyVal {
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
    def setAction(value: CalendarSharingAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setActionType(value: CalendarSharingActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    @scala.inline
    def setImportance(value: CalendarSharingActionImportance): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
  }
  
}

