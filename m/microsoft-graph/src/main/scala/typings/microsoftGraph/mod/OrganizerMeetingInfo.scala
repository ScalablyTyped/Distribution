package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizerMeetingInfo extends MeetingInfo {
  // The organizer Azure Active Directory identity.
  var organizer: js.UndefOr[IdentitySet] = js.native
}

object OrganizerMeetingInfo {
  @scala.inline
  def apply(): OrganizerMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizerMeetingInfo]
  }
  @scala.inline
  implicit class OrganizerMeetingInfoOps[Self <: OrganizerMeetingInfo] (val x: Self) extends AnyVal {
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
    def setOrganizer(value: IdentitySet): Self = this.set("organizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizer: Self = this.set("organizer", js.undefined)
  }
  
}

