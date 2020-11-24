package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2HybridInspectJobTriggerRequest extends js.Object {
  
  /** The item to inspect. */
  var hybridItem: js.UndefOr[GooglePrivacyDlpV2HybridContentItem] = js.native
}
object GooglePrivacyDlpV2HybridInspectJobTriggerRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2HybridInspectJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridInspectJobTriggerRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2HybridInspectJobTriggerRequestOps[Self <: GooglePrivacyDlpV2HybridInspectJobTriggerRequest] (val x: Self) extends AnyVal {
    
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
    def setHybridItem(value: GooglePrivacyDlpV2HybridContentItem): Self = this.set("hybridItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHybridItem: Self = this.set("hybridItem", js.undefined)
  }
}
