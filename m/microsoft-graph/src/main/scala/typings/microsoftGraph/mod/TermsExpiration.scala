package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermsExpiration extends StObject {
  
  /**
    * Represents the frequency at which the terms will expire, after its first expiration as set in startDateTime. The value
    * is represented in ISO 8601 format for durations. For example, PT1M represents a time period of 1 month.
    */
  var frequency: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The DateTime when the agreement is set to expire for all users. The Timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object TermsExpiration {
  
  inline def apply(): TermsExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsExpiration]
  }
  
  extension [Self <: TermsExpiration](x: Self) {
    
    inline def setFrequency(value: NullableOption[String]): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyNull: Self = StObject.set(x, "frequency", null)
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
