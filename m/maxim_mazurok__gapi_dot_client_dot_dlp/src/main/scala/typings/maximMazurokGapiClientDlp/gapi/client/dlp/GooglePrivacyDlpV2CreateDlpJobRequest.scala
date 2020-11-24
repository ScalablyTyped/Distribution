package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CreateDlpJobRequest extends js.Object {
  
  /** Set to control what and how to inspect. */
  var inspectJob: js.UndefOr[GooglePrivacyDlpV2InspectJobConfig] = js.native
  
  /**
    * The job id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters.
    * Can be empty to allow the system to generate one.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.native
  
  /** Set to choose what metric to calculate. */
  var riskJob: js.UndefOr[GooglePrivacyDlpV2RiskAnalysisJobConfig] = js.native
}
object GooglePrivacyDlpV2CreateDlpJobRequest {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CreateDlpJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CreateDlpJobRequest]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CreateDlpJobRequestOps[Self <: GooglePrivacyDlpV2CreateDlpJobRequest] (val x: Self) extends AnyVal {
    
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
    def setInspectJob(value: GooglePrivacyDlpV2InspectJobConfig): Self = this.set("inspectJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectJob: Self = this.set("inspectJob", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setRiskJob(value: GooglePrivacyDlpV2RiskAnalysisJobConfig): Self = this.set("riskJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskJob: Self = this.set("riskJob", js.undefined)
  }
}
