package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOffRequest extends ScheduleChangeRequest {
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var endDateTime: js.UndefOr[String] = js.native
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[String] = js.native
  // The reason for the time off.
  var timeOffReasonId: js.UndefOr[String] = js.native
}

object TimeOffRequest {
  @scala.inline
  def apply(): TimeOffRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOffRequest]
  }
  @scala.inline
  implicit class TimeOffRequestOps[Self <: TimeOffRequest] (val x: Self) extends AnyVal {
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
    def setEndDateTime(value: String): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    @scala.inline
    def setTimeOffReasonId(value: String): Self = this.set("timeOffReasonId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOffReasonId: Self = this.set("timeOffReasonId", js.undefined)
  }
  
}

