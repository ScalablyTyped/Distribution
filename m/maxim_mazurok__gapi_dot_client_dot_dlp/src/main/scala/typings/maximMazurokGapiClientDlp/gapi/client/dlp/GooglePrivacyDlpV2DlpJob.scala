package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DlpJob extends StObject {
  
  /** Time when the job was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Time when the job finished. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** A stream of errors encountered running the job. */
  var errors: js.UndefOr[js.Array[GooglePrivacyDlpV2Error]] = js.undefined
  
  /** Results from inspecting a data source. */
  var inspectDetails: js.UndefOr[GooglePrivacyDlpV2InspectDataSourceDetails] = js.undefined
  
  /** If created by a job trigger, the resource name of the trigger that instantiated the job. */
  var jobTriggerName: js.UndefOr[String] = js.undefined
  
  /** The server-assigned name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Results from analyzing risk of a data source. */
  var riskDetails: js.UndefOr[GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] = js.undefined
  
  /** Time when the job started. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** State of a job. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The type of job. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2DlpJob {
  
  inline def apply(): GooglePrivacyDlpV2DlpJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DlpJob]
  }
  
  extension [Self <: GooglePrivacyDlpV2DlpJob](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setErrors(value: js.Array[GooglePrivacyDlpV2Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GooglePrivacyDlpV2Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setInspectDetails(value: GooglePrivacyDlpV2InspectDataSourceDetails): Self = StObject.set(x, "inspectDetails", value.asInstanceOf[js.Any])
    
    inline def setInspectDetailsUndefined: Self = StObject.set(x, "inspectDetails", js.undefined)
    
    inline def setJobTriggerName(value: String): Self = StObject.set(x, "jobTriggerName", value.asInstanceOf[js.Any])
    
    inline def setJobTriggerNameUndefined: Self = StObject.set(x, "jobTriggerName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRiskDetails(value: GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails): Self = StObject.set(x, "riskDetails", value.asInstanceOf[js.Any])
    
    inline def setRiskDetailsUndefined: Self = StObject.set(x, "riskDetails", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
