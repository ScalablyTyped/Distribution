package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RiskAnalysisJobConfig extends js.Object {
  
  /** Actions to execute at the completion of the job. Are executed in the order provided. */
  var actions: js.UndefOr[js.Array[GooglePrivacyDlpV2Action]] = js.native
  
  /** Privacy metric to compute. */
  var privacyMetric: js.UndefOr[GooglePrivacyDlpV2PrivacyMetric] = js.native
  
  /** Input dataset to compute metrics over. */
  var sourceTable: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.native
}
object GooglePrivacyDlpV2RiskAnalysisJobConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RiskAnalysisJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RiskAnalysisJobConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RiskAnalysisJobConfigOps[Self <: GooglePrivacyDlpV2RiskAnalysisJobConfig] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: GooglePrivacyDlpV2Action*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[GooglePrivacyDlpV2Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setPrivacyMetric(value: GooglePrivacyDlpV2PrivacyMetric): Self = this.set("privacyMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyMetric: Self = this.set("privacyMetric", js.undefined)
    
    @scala.inline
    def setSourceTable(value: GooglePrivacyDlpV2BigQueryTable): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
  }
}
