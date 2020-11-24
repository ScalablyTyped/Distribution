package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttendeeAvailability extends js.Object {
  
  /**
    * The email address and type of attendee - whether it's a person or a resource, and whether required or optional if it's
    * a person.
    */
  var attendee: js.UndefOr[NullableOption[AttendeeBase]] = js.native
  
  /**
    * The availability status of the attendee. The possible values are: free, tentative, busy, oof, workingElsewhere,
    * unknown.
    */
  var availability: js.UndefOr[NullableOption[FreeBusyStatus]] = js.native
}
object AttendeeAvailability {
  
  @scala.inline
  def apply(): AttendeeAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttendeeAvailability]
  }
  
  @scala.inline
  implicit class AttendeeAvailabilityOps[Self <: AttendeeAvailability] (val x: Self) extends AnyVal {
    
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
    def setAttendee(value: NullableOption[AttendeeBase]): Self = this.set("attendee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttendee: Self = this.set("attendee", js.undefined)
    
    @scala.inline
    def setAttendeeNull: Self = this.set("attendee", null)
    
    @scala.inline
    def setAvailability(value: NullableOption[FreeBusyStatus]): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setAvailabilityNull: Self = this.set("availability", null)
  }
}
