package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Schedule extends StObject {
  
  /**
    * With this option a job is started on a regular periodic basis. For example: every day (86400 seconds). A scheduled start time will be skipped if the previous execution has not ended
    * when its scheduled time occurs. This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
    */
  var recurrencePeriodDuration: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2Schedule {
  
  inline def apply(): GooglePrivacyDlpV2Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Schedule]
  }
  
  extension [Self <: GooglePrivacyDlpV2Schedule](x: Self) {
    
    inline def setRecurrencePeriodDuration(value: String): Self = StObject.set(x, "recurrencePeriodDuration", value.asInstanceOf[js.Any])
    
    inline def setRecurrencePeriodDurationUndefined: Self = StObject.set(x, "recurrencePeriodDuration", js.undefined)
  }
}
