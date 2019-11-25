package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttendeeAvailability extends js.Object {
  /**
    * The email address and type of attendee - whether it's a person or a resource, and whether required or optional if it's
    * a person.
    */
  var attendee: js.UndefOr[AttendeeBase] = js.undefined
  /**
    * The availability status of the attendee. The possible values are: free, tentative, busy, oof, workingElsewhere,
    * unknown.
    */
  var availability: js.UndefOr[FreeBusyStatus] = js.undefined
}

object AttendeeAvailability {
  @scala.inline
  def apply(attendee: AttendeeBase = null, availability: FreeBusyStatus = null): AttendeeAvailability = {
    val __obj = js.Dynamic.literal()
    if (attendee != null) __obj.updateDynamic("attendee")(attendee.asInstanceOf[js.Any])
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttendeeAvailability]
  }
}

