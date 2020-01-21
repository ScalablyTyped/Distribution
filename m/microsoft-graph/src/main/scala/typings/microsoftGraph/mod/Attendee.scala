package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attendee extends AttendeeBase {
  // The attendee's response (none, accepted, declined, etc.) for the event and date-time that the response was sent.
  var status: js.UndefOr[ResponseStatus] = js.undefined
}

object Attendee {
  @scala.inline
  def apply(emailAddress: EmailAddress = null, status: ResponseStatus = null, `type`: AttendeeType = null): Attendee = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attendee]
  }
}

