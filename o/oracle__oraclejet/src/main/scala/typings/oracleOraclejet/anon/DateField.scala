package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateField extends StObject {
  
  var dateField: js.UndefOr[String] = js.undefined
  
  var dateOnly: js.UndefOr[Boolean] = js.undefined
  
  var formatUsing: js.UndefOr[String] = js.undefined
  
  var relativeTime: js.UndefOr[String] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object DateField {
  
  inline def apply(): DateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateField]
  }
  
  extension [Self <: DateField](x: Self) {
    
    inline def setDateField(value: String): Self = StObject.set(x, "dateField", value.asInstanceOf[js.Any])
    
    inline def setDateFieldUndefined: Self = StObject.set(x, "dateField", js.undefined)
    
    inline def setDateOnly(value: Boolean): Self = StObject.set(x, "dateOnly", value.asInstanceOf[js.Any])
    
    inline def setDateOnlyUndefined: Self = StObject.set(x, "dateOnly", js.undefined)
    
    inline def setFormatUsing(value: String): Self = StObject.set(x, "formatUsing", value.asInstanceOf[js.Any])
    
    inline def setFormatUsingUndefined: Self = StObject.set(x, "formatUsing", js.undefined)
    
    inline def setRelativeTime(value: String): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    inline def setRelativeTimeUndefined: Self = StObject.set(x, "relativeTime", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
