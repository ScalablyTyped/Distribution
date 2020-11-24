package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Trigger extends js.Object {
  
  /**
    * For use with hybrid jobs. Jobs must be manually created and finished. Early access feature is in a pre-release state and might change or have limited support. For more information,
    * see https://cloud.google.com/products#product-launch-stages.
    */
  var manual: js.UndefOr[js.Any] = js.native
  
  /** Create a job on a repeating basis based on the elapse of time. */
  var schedule: js.UndefOr[GooglePrivacyDlpV2Schedule] = js.native
}
object GooglePrivacyDlpV2Trigger {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Trigger]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TriggerOps[Self <: GooglePrivacyDlpV2Trigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManual(value: js.Any): Self = this.set("manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManual: Self = this.set("manual", js.undefined)
    
    @scala.inline
    def setSchedule(value: GooglePrivacyDlpV2Schedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
}
