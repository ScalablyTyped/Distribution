package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FollowupFlag extends js.Object {
  // The date and time that the follow-up was finished.
  var completedDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  /**
    * The date and time that the follow up is to be finished. Note: To set the due date, you must also specify the
    * startDateTime; otherwise, you will get a 400 Bad Request response.
    */
  var dueDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  // The status for follow-up for an item. Possible values are notFlagged, complete, and flagged.
  var flagStatus: js.UndefOr[FollowupFlagStatus] = js.native
  // The date and time that the follow-up is to begin.
  var startDateTime: js.UndefOr[DateTimeTimeZone] = js.native
}

object FollowupFlag {
  @scala.inline
  def apply(): FollowupFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FollowupFlag]
  }
  @scala.inline
  implicit class FollowupFlagOps[Self <: FollowupFlag] (val x: Self) extends AnyVal {
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
    def setCompletedDateTime(value: DateTimeTimeZone): Self = this.set("completedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedDateTime: Self = this.set("completedDateTime", js.undefined)
    @scala.inline
    def setDueDateTime(value: DateTimeTimeZone): Self = this.set("dueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueDateTime: Self = this.set("dueDateTime", js.undefined)
    @scala.inline
    def setFlagStatus(value: FollowupFlagStatus): Self = this.set("flagStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlagStatus: Self = this.set("flagStatus", js.undefined)
    @scala.inline
    def setStartDateTime(value: DateTimeTimeZone): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
  }
  
}

