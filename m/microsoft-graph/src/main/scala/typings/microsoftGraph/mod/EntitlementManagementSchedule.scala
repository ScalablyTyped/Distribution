package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitlementManagementSchedule extends StObject {
  
  // When the access should expire.
  var expiration: js.UndefOr[NullableOption[ExpirationPattern]] = js.undefined
  
  // For recurring access reviews. Not used in access requests.
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object EntitlementManagementSchedule {
  
  inline def apply(): EntitlementManagementSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitlementManagementSchedule]
  }
  
  extension [Self <: EntitlementManagementSchedule](x: Self) {
    
    inline def setExpiration(value: NullableOption[ExpirationPattern]): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationNull: Self = StObject.set(x, "expiration", null)
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
