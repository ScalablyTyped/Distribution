package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeTimeZone extends StObject {
  
  /**
    * A single point of time in a combined date and time representation ({date}T{time}; for example,
    * 2017-08-29T04:00:00.0000000).
    */
  var dateTime: js.UndefOr[String] = js.undefined
  
  // Represents a time zone, for example, 'Pacific Standard Time'. See below for more possible values.
  var timeZone: js.UndefOr[NullableOption[String]] = js.undefined
}
object DateTimeTimeZone {
  
  inline def apply(): DateTimeTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeTimeZone]
  }
  
  extension [Self <: DateTimeTimeZone](x: Self) {
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setTimeZone(value: NullableOption[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
