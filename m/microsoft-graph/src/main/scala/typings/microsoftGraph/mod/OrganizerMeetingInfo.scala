package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizerMeetingInfo
  extends StObject
     with MeetingInfo {
  
  // The organizer Azure Active Directory identity.
  var organizer: js.UndefOr[IdentitySet] = js.undefined
}
object OrganizerMeetingInfo {
  
  inline def apply(): OrganizerMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizerMeetingInfo]
  }
  
  extension [Self <: OrganizerMeetingInfo](x: Self) {
    
    inline def setOrganizer(value: IdentitySet): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
  }
}
