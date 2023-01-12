package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSchedule extends StObject {
  
  // When the eligible or active assignment expires.
  var expiration: js.UndefOr[NullableOption[ExpirationPattern]] = js.undefined
  
  // The frequency of the eligible or active assignment. This property is currently unsupported in PIM.
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.undefined
  
  // When the eligible or active assignment becomes active.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object RequestSchedule {
  
  inline def apply(): RequestSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestSchedule] (val x: Self) extends AnyVal {
    
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
