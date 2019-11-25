package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeetingParticipants extends js.Object {
  var attendees: js.UndefOr[js.Array[MeetingParticipantInfo]] = js.undefined
  var organizer: js.UndefOr[MeetingParticipantInfo] = js.undefined
}

object MeetingParticipants {
  @scala.inline
  def apply(attendees: js.Array[MeetingParticipantInfo] = null, organizer: MeetingParticipantInfo = null): MeetingParticipants = {
    val __obj = js.Dynamic.literal()
    if (attendees != null) __obj.updateDynamic("attendees")(attendees.asInstanceOf[js.Any])
    if (organizer != null) __obj.updateDynamic("organizer")(organizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingParticipants]
  }
}

