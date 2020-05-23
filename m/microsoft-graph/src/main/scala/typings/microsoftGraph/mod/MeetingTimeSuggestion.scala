package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeetingTimeSuggestion extends js.Object {
  // An array that shows the availability status of each attendee for this meeting suggestion.
  var attendeeAvailability: js.UndefOr[js.Array[AttendeeAvailability]] = js.undefined
  // A percentage that represents the likelhood of all the attendees attending.
  var confidence: js.UndefOr[Double] = js.undefined
  // An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  // A time period suggested for the meeting.
  var meetingTimeSlot: js.UndefOr[TimeSlot] = js.undefined
  /**
    * Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if
    * there are suggestions with the same confidence.
    */
  var order: js.UndefOr[Double] = js.undefined
  /**
    * Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof,
    * workingElsewhere, unknown.
    */
  var organizerAvailability: js.UndefOr[FreeBusyStatus] = js.undefined
  // Reason for suggesting the meeting time.
  var suggestionReason: js.UndefOr[String] = js.undefined
}

object MeetingTimeSuggestion {
  @scala.inline
  def apply(
    attendeeAvailability: js.Array[AttendeeAvailability] = null,
    confidence: js.UndefOr[Double] = js.undefined,
    locations: js.Array[Location] = null,
    meetingTimeSlot: TimeSlot = null,
    order: js.UndefOr[Double] = js.undefined,
    organizerAvailability: FreeBusyStatus = null,
    suggestionReason: String = null
  ): MeetingTimeSuggestion = {
    val __obj = js.Dynamic.literal()
    if (attendeeAvailability != null) __obj.updateDynamic("attendeeAvailability")(attendeeAvailability.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (meetingTimeSlot != null) __obj.updateDynamic("meetingTimeSlot")(meetingTimeSlot.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (organizerAvailability != null) __obj.updateDynamic("organizerAvailability")(organizerAvailability.asInstanceOf[js.Any])
    if (suggestionReason != null) __obj.updateDynamic("suggestionReason")(suggestionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingTimeSuggestion]
  }
}

