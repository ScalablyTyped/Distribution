package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingTimeSuggestionsResult extends js.Object {
  /**
    * A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable,
    * attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string
    * if the meetingTimeSuggestions property does include any meeting suggestions.
    */
  var emptySuggestionsReason: js.UndefOr[String] = js.native
  // An array of meeting suggestions.
  var meetingTimeSuggestions: js.UndefOr[js.Array[MeetingTimeSuggestion]] = js.native
}

object MeetingTimeSuggestionsResult {
  @scala.inline
  def apply(): MeetingTimeSuggestionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingTimeSuggestionsResult]
  }
  @scala.inline
  implicit class MeetingTimeSuggestionsResultOps[Self <: MeetingTimeSuggestionsResult] (val x: Self) extends AnyVal {
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
    def setEmptySuggestionsReason(value: String): Self = this.set("emptySuggestionsReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptySuggestionsReason: Self = this.set("emptySuggestionsReason", js.undefined)
    @scala.inline
    def setMeetingTimeSuggestionsVarargs(value: MeetingTimeSuggestion*): Self = this.set("meetingTimeSuggestions", js.Array(value :_*))
    @scala.inline
    def setMeetingTimeSuggestions(value: js.Array[MeetingTimeSuggestion]): Self = this.set("meetingTimeSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeetingTimeSuggestions: Self = this.set("meetingTimeSuggestions", js.undefined)
  }
  
}

