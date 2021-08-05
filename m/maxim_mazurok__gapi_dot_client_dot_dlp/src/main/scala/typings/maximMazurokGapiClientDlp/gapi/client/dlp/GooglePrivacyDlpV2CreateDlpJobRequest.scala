package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CreateDlpJobRequest extends StObject {
  
  /** Set to control what and how to inspect. */
  var inspectJob: js.UndefOr[GooglePrivacyDlpV2InspectJobConfig] = js.undefined
  
  /**
    * The job id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters.
    * Can be empty to allow the system to generate one.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.undefined
  
  /** Set to choose what metric to calculate. */
  var riskJob: js.UndefOr[GooglePrivacyDlpV2RiskAnalysisJobConfig] = js.undefined
}
object GooglePrivacyDlpV2CreateDlpJobRequest {
  
  inline def apply(): GooglePrivacyDlpV2CreateDlpJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CreateDlpJobRequest]
  }
  
  extension [Self <: GooglePrivacyDlpV2CreateDlpJobRequest](x: Self) {
    
    inline def setInspectJob(value: GooglePrivacyDlpV2InspectJobConfig): Self = StObject.set(x, "inspectJob", value.asInstanceOf[js.Any])
    
    inline def setInspectJobUndefined: Self = StObject.set(x, "inspectJob", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setRiskJob(value: GooglePrivacyDlpV2RiskAnalysisJobConfig): Self = StObject.set(x, "riskJob", value.asInstanceOf[js.Any])
    
    inline def setRiskJobUndefined: Self = StObject.set(x, "riskJob", js.undefined)
  }
}
