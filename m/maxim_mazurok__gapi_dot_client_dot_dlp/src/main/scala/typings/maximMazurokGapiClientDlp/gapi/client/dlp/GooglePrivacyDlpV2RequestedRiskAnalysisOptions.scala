package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RequestedRiskAnalysisOptions extends js.Object {
  
  /** The job config for the risk job. */
  var jobConfig: js.UndefOr[GooglePrivacyDlpV2RiskAnalysisJobConfig] = js.native
}
object GooglePrivacyDlpV2RequestedRiskAnalysisOptions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RequestedRiskAnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RequestedRiskAnalysisOptions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RequestedRiskAnalysisOptionsOps[Self <: GooglePrivacyDlpV2RequestedRiskAnalysisOptions] (val x: Self) extends AnyVal {
    
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
    def setJobConfig(value: GooglePrivacyDlpV2RiskAnalysisJobConfig): Self = this.set("jobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobConfig: Self = this.set("jobConfig", js.undefined)
  }
}
