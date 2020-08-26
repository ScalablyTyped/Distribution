package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarSharingMessage extends Message {
  var canAccept: js.UndefOr[Boolean] = js.native
  var sharingMessageAction: js.UndefOr[CalendarSharingMessageAction] = js.native
  var sharingMessageActions: js.UndefOr[js.Array[CalendarSharingMessageAction]] = js.native
  var suggestedCalendarName: js.UndefOr[String] = js.native
}

object CalendarSharingMessage {
  @scala.inline
  def apply(): CalendarSharingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSharingMessage]
  }
  @scala.inline
  implicit class CalendarSharingMessageOps[Self <: CalendarSharingMessage] (val x: Self) extends AnyVal {
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
    def setCanAccept(value: Boolean): Self = this.set("canAccept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanAccept: Self = this.set("canAccept", js.undefined)
    @scala.inline
    def setSharingMessageAction(value: CalendarSharingMessageAction): Self = this.set("sharingMessageAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharingMessageAction: Self = this.set("sharingMessageAction", js.undefined)
    @scala.inline
    def setSharingMessageActionsVarargs(value: CalendarSharingMessageAction*): Self = this.set("sharingMessageActions", js.Array(value :_*))
    @scala.inline
    def setSharingMessageActions(value: js.Array[CalendarSharingMessageAction]): Self = this.set("sharingMessageActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharingMessageActions: Self = this.set("sharingMessageActions", js.undefined)
    @scala.inline
    def setSuggestedCalendarName(value: String): Self = this.set("suggestedCalendarName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedCalendarName: Self = this.set("suggestedCalendarName", js.undefined)
  }
  
}

