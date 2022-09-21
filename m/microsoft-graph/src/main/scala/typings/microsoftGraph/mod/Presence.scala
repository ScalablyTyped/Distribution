package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Presence
  extends StObject
     with Entity {
  
  /**
    * The supplemental information to a user's availability. Possible values are Available, Away, BeRightBack, Busy,
    * DoNotDisturb, InACall, InAConferenceCall, Inactive, InAMeeting, Offline, OffWork, OutOfOffice, PresenceUnknown,
    * Presenting, UrgentInterruptionsOnly.
    */
  var activity: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The base presence information for a user. Possible values are Available, AvailableIdle, Away, BeRightBack, Busy,
    * BusyIdle, DoNotDisturb, Offline, PresenceUnknown
    */
  var availability: js.UndefOr[NullableOption[String]] = js.undefined
}
object Presence {
  
  inline def apply(): Presence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Presence]
  }
  
  extension [Self <: Presence](x: Self) {
    
    inline def setActivity(value: NullableOption[String]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setAvailability(value: NullableOption[String]): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
  }
}
