package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeetingTimeSuggestionsResult extends js.Object {
  /**
    * A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable,
    * attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string
    * if the meetingTimeSuggestions property does include any meeting suggestions.
    */
  var emptySuggestionsReason: js.UndefOr[String] = js.undefined
  // An array of meeting suggestions.
  var meetingTimeSuggestions: js.UndefOr[js.Array[MeetingTimeSuggestion]] = js.undefined
}

object MeetingTimeSuggestionsResult {
  @scala.inline
  def apply(
    emptySuggestionsReason: String = null,
    meetingTimeSuggestions: js.Array[MeetingTimeSuggestion] = null
  ): MeetingTimeSuggestionsResult = {
    val __obj = js.Dynamic.literal()
    if (emptySuggestionsReason != null) __obj.updateDynamic("emptySuggestionsReason")(emptySuggestionsReason)
    if (meetingTimeSuggestions != null) __obj.updateDynamic("meetingTimeSuggestions")(meetingTimeSuggestions)
    __obj.asInstanceOf[MeetingTimeSuggestionsResult]
  }
}

