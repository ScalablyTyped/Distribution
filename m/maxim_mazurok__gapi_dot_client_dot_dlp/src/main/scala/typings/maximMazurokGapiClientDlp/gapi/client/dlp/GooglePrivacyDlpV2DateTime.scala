package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DateTime extends StObject {
  
  /** One or more of the following must be set. Must be a valid date or time value. */
  var date: js.UndefOr[GoogleTypeDate] = js.native
  
  /** Day of week */
  var dayOfWeek: js.UndefOr[String] = js.native
  
  /** Time of day */
  var time: js.UndefOr[GoogleTypeTimeOfDay] = js.native
  
  /** Time zone */
  var timeZone: js.UndefOr[GooglePrivacyDlpV2TimeZone] = js.native
}
object GooglePrivacyDlpV2DateTime {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DateTime]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DateTimeMutableBuilder[Self <: GooglePrivacyDlpV2DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: GoogleTypeDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    @scala.inline
    def setTime(value: GoogleTypeTimeOfDay): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setTimeZone(value: GooglePrivacyDlpV2TimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
