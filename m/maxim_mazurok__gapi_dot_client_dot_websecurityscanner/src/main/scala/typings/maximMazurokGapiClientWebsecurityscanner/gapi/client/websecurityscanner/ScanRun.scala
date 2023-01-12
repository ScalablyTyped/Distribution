package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanRun extends StObject {
  
  /** Output only. The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Output only. If result_state is an ERROR, this field provides the primary reason for scan's termination and more details, if such are available. */
  var errorTrace: js.UndefOr[ScanRunErrorTrace] = js.undefined
  
  /** Output only. The execution state of the ScanRun. */
  var executionState: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether the scan run has found any vulnerabilities. */
  var hasVulnerabilities: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The resource name of the ScanRun. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. The ScanRun IDs are generated
    * by the system.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan
    * is finished, the value is 100.
    */
  var progressPercent: js.UndefOr[Double] = js.undefined
  
  /** Output only. The result state of the ScanRun. This field is only available after the execution state reaches "FINISHED". */
  var resultState: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which the ScanRun started. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now. */
  var urlsCrawledCount: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is
    * usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
    */
  var urlsTestedCount: js.UndefOr[String] = js.undefined
  
  /** Output only. A list of warnings, if such are encountered during this scan run. */
  var warningTraces: js.UndefOr[js.Array[ScanRunWarningTrace]] = js.undefined
}
object ScanRun {
  
  inline def apply(): ScanRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanRun] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setErrorTrace(value: ScanRunErrorTrace): Self = StObject.set(x, "errorTrace", value.asInstanceOf[js.Any])
    
    inline def setErrorTraceUndefined: Self = StObject.set(x, "errorTrace", js.undefined)
    
    inline def setExecutionState(value: String): Self = StObject.set(x, "executionState", value.asInstanceOf[js.Any])
    
    inline def setExecutionStateUndefined: Self = StObject.set(x, "executionState", js.undefined)
    
    inline def setHasVulnerabilities(value: Boolean): Self = StObject.set(x, "hasVulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setHasVulnerabilitiesUndefined: Self = StObject.set(x, "hasVulnerabilities", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setResultState(value: String): Self = StObject.set(x, "resultState", value.asInstanceOf[js.Any])
    
    inline def setResultStateUndefined: Self = StObject.set(x, "resultState", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUrlsCrawledCount(value: String): Self = StObject.set(x, "urlsCrawledCount", value.asInstanceOf[js.Any])
    
    inline def setUrlsCrawledCountUndefined: Self = StObject.set(x, "urlsCrawledCount", js.undefined)
    
    inline def setUrlsTestedCount(value: String): Self = StObject.set(x, "urlsTestedCount", value.asInstanceOf[js.Any])
    
    inline def setUrlsTestedCountUndefined: Self = StObject.set(x, "urlsTestedCount", js.undefined)
    
    inline def setWarningTraces(value: js.Array[ScanRunWarningTrace]): Self = StObject.set(x, "warningTraces", value.asInstanceOf[js.Any])
    
    inline def setWarningTracesUndefined: Self = StObject.set(x, "warningTraces", js.undefined)
    
    inline def setWarningTracesVarargs(value: ScanRunWarningTrace*): Self = StObject.set(x, "warningTraces", js.Array(value*))
  }
}
