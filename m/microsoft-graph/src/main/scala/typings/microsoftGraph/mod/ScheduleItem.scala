package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleItem extends js.Object {
  // The date, time, and time zone that the corresponding event ends.
  var end: js.UndefOr[DateTimeTimeZone] = js.native
  // The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
  var isPrivate: js.UndefOr[Boolean] = js.native
  // The location where the corresponding event is held or attended from. Optional.
  var location: js.UndefOr[String] = js.native
  // The date, time, and time zone that the corresponding event starts.
  var start: js.UndefOr[DateTimeTimeZone] = js.native
  /**
    * The availability status of the user or resource during the corresponding event. The possible values are: free,
    * tentative, busy, oof, workingElsewhere, unknown.
    */
  var status: js.UndefOr[FreeBusyStatus] = js.native
  // The corresponding event's subject line. Optional.
  var subject: js.UndefOr[String] = js.native
}

object ScheduleItem {
  @scala.inline
  def apply(): ScheduleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleItem]
  }
  @scala.inline
  implicit class ScheduleItemOps[Self <: ScheduleItem] (val x: Self) extends AnyVal {
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
    def setEnd(value: DateTimeTimeZone): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setIsPrivate(value: Boolean): Self = this.set("isPrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrivate: Self = this.set("isPrivate", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setStart(value: DateTimeTimeZone): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStatus(value: FreeBusyStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

