package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RequestedRiskAnalysisOptions extends StObject {
  
  /** The job config for the risk job. */
  var jobConfig: js.UndefOr[GooglePrivacyDlpV2RiskAnalysisJobConfig] = js.undefined
}
object GooglePrivacyDlpV2RequestedRiskAnalysisOptions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RequestedRiskAnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RequestedRiskAnalysisOptions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RequestedRiskAnalysisOptionsMutableBuilder[Self <: GooglePrivacyDlpV2RequestedRiskAnalysisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobConfig(value: GooglePrivacyDlpV2RiskAnalysisJobConfig): Self = StObject.set(x, "jobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobConfigUndefined: Self = StObject.set(x, "jobConfig", js.undefined)
  }
}
