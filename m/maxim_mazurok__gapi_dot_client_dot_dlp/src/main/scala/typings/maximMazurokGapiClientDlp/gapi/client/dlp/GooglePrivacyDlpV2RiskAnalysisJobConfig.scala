package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RiskAnalysisJobConfig extends StObject {
  
  /** Actions to execute at the completion of the job. Are executed in the order provided. */
  var actions: js.UndefOr[js.Array[GooglePrivacyDlpV2Action]] = js.undefined
  
  /** Privacy metric to compute. */
  var privacyMetric: js.UndefOr[GooglePrivacyDlpV2PrivacyMetric] = js.undefined
  
  /** Input dataset to compute metrics over. */
  var sourceTable: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object GooglePrivacyDlpV2RiskAnalysisJobConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RiskAnalysisJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RiskAnalysisJobConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RiskAnalysisJobConfigMutableBuilder[Self <: GooglePrivacyDlpV2RiskAnalysisJobConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[GooglePrivacyDlpV2Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: GooglePrivacyDlpV2Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setPrivacyMetric(value: GooglePrivacyDlpV2PrivacyMetric): Self = StObject.set(x, "privacyMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyMetricUndefined: Self = StObject.set(x, "privacyMetric", js.undefined)
    
    @scala.inline
    def setSourceTable(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
  }
}
