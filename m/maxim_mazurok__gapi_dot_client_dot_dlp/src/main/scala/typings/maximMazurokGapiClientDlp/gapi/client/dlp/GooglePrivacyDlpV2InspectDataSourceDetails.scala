package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InspectDataSourceDetails extends js.Object {
  
  /** The configuration used for this job. */
  var requestedOptions: js.UndefOr[GooglePrivacyDlpV2RequestedOptions] = js.native
  
  /** A summary of the outcome of this inspect job. */
  var result: js.UndefOr[GooglePrivacyDlpV2Result] = js.native
}
object GooglePrivacyDlpV2InspectDataSourceDetails {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectDataSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectDataSourceDetails]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectDataSourceDetailsOps[Self <: GooglePrivacyDlpV2InspectDataSourceDetails] (val x: Self) extends AnyVal {
    
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
    def setRequestedOptions(value: GooglePrivacyDlpV2RequestedOptions): Self = this.set("requestedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedOptions: Self = this.set("requestedOptions", js.undefined)
    
    @scala.inline
    def setResult(value: GooglePrivacyDlpV2Result): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
}
