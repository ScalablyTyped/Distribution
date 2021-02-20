package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttendeeAvailability extends StObject {
  
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
  implicit class AttendeeAvailabilityMutableBuilder[Self <: AttendeeAvailability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendee(value: NullableOption[AttendeeBase]): Self = StObject.set(x, "attendee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeeNull: Self = StObject.set(x, "attendee", null)
    
    @scala.inline
    def setAttendeeUndefined: Self = StObject.set(x, "attendee", js.undefined)
    
    @scala.inline
    def setAvailability(value: NullableOption[FreeBusyStatus]): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
  }
}
