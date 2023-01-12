package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DateTime extends StObject {
  
  /** One or more of the following must be set. Must be a valid date or time value. */
  var date: js.UndefOr[GoogleTypeDate] = js.undefined
  
  /** Day of week */
  var dayOfWeek: js.UndefOr[String] = js.undefined
  
  /** Time of day */
  var time: js.UndefOr[GoogleTypeTimeOfDay] = js.undefined
  
  /** Time zone */
  var timeZone: js.UndefOr[GooglePrivacyDlpV2TimeZone] = js.undefined
}
object GooglePrivacyDlpV2DateTime {
  
  inline def apply(): GooglePrivacyDlpV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DateTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2DateTime] (val x: Self) extends AnyVal {
    
    inline def setDate(value: GoogleTypeDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setTime(value: GoogleTypeTimeOfDay): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTimeZone(value: GooglePrivacyDlpV2TimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
