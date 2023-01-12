package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpirationPattern extends StObject {
  
  /**
    * The requestor's desired duration of access represented in ISO 8601 format for durations. For example, PT3H refers to
    * three hours. If specified in a request, endDateTime should not be present and the type property should be set to
    * afterDuration.
    */
  var duration: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Timestamp of date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on
    * Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The requestor's desired expiration pattern type. The possible values are: notSpecified, noExpiration, afterDateTime,
    * afterDuration.
    */
  var `type`: js.UndefOr[NullableOption[ExpirationPatternType]] = js.undefined
}
object ExpirationPattern {
  
  inline def apply(): ExpirationPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpirationPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpirationPattern] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: NullableOption[String]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setType(value: NullableOption[ExpirationPatternType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
