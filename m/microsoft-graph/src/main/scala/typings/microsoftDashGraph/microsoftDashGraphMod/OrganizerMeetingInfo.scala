package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizerMeetingInfo extends MeetingInfo {
  var organizer: js.UndefOr[IdentitySet] = js.undefined
}

object OrganizerMeetingInfo {
  @scala.inline
  def apply(organizer: IdentitySet = null): OrganizerMeetingInfo = {
    val __obj = js.Dynamic.literal()
    if (organizer != null) __obj.updateDynamic("organizer")(organizer)
    __obj.asInstanceOf[OrganizerMeetingInfo]
  }
}

