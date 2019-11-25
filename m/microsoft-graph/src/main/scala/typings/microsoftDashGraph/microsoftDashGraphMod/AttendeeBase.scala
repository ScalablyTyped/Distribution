package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttendeeBase extends Recipient {
  /**
    * The type of attendee. The possible values are: required, optional, resource. Currently if the attendee is a person,
    * findMeetingTimes always considers the person is of the Required type.
    */
  var `type`: js.UndefOr[AttendeeType] = js.undefined
}

object AttendeeBase {
  @scala.inline
  def apply(emailAddress: EmailAddress = null, `type`: AttendeeType = null): AttendeeBase = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttendeeBase]
  }
}

