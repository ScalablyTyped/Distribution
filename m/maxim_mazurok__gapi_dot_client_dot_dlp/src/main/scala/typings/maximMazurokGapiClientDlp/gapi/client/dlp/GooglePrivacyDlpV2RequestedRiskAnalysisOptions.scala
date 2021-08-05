package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RequestedRiskAnalysisOptions extends StObject {
  
  /** The job config for the risk job. */
  var jobConfig: js.UndefOr[GooglePrivacyDlpV2RiskAnalysisJobConfig] = js.undefined
}
object GooglePrivacyDlpV2RequestedRiskAnalysisOptions {
  
  inline def apply(): GooglePrivacyDlpV2RequestedRiskAnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RequestedRiskAnalysisOptions]
  }
  
  extension [Self <: GooglePrivacyDlpV2RequestedRiskAnalysisOptions](x: Self) {
    
    inline def setJobConfig(value: GooglePrivacyDlpV2RiskAnalysisJobConfig): Self = StObject.set(x, "jobConfig", value.asInstanceOf[js.Any])
    
    inline def setJobConfigUndefined: Self = StObject.set(x, "jobConfig", js.undefined)
  }
}
