package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Trigger extends StObject {
  
  /**
    * For use with hybrid jobs. Jobs must be manually created and finished. Early access feature is in a pre-release state and might change or have limited support. For more information,
    * see https://cloud.google.com/products#product-launch-stages.
    */
  var manual: js.UndefOr[js.Any] = js.undefined
  
  /** Create a job on a repeating basis based on the elapse of time. */
  var schedule: js.UndefOr[GooglePrivacyDlpV2Schedule] = js.undefined
}
object GooglePrivacyDlpV2Trigger {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Trigger]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TriggerMutableBuilder[Self <: GooglePrivacyDlpV2Trigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManual(value: js.Any): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
    
    @scala.inline
    def setSchedule(value: GooglePrivacyDlpV2Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
