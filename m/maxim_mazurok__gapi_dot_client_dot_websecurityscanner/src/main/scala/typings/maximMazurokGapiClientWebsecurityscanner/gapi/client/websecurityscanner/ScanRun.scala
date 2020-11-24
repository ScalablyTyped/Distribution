package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanRun extends js.Object {
  
  /** Output only. The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Output only. If result_state is an ERROR, this field provides the primary reason for scan's termination and more details, if such are available. */
  var errorTrace: js.UndefOr[ScanRunErrorTrace] = js.native
  
  /** Output only. The execution state of the ScanRun. */
  var executionState: js.UndefOr[String] = js.native
  
  /** Output only. Whether the scan run has found any vulnerabilities. */
  var hasVulnerabilities: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The resource name of the ScanRun. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. The ScanRun IDs are generated
    * by the system.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan
    * is finished, the value is 100.
    */
  var progressPercent: js.UndefOr[Double] = js.native
  
  /** Output only. The result state of the ScanRun. This field is only available after the execution state reaches "FINISHED". */
  var resultState: js.UndefOr[String] = js.native
  
  /** Output only. The time at which the ScanRun started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now. */
  var urlsCrawledCount: js.UndefOr[String] = js.native
  
  /**
    * Output only. The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is
    * usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
    */
  var urlsTestedCount: js.UndefOr[String] = js.native
  
  /** Output only. A list of warnings, if such are encountered during this scan run. */
  var warningTraces: js.UndefOr[js.Array[ScanRunWarningTrace]] = js.native
}
object ScanRun {
  
  @scala.inline
  def apply(): ScanRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanRun]
  }
  
  @scala.inline
  implicit class ScanRunOps[Self <: ScanRun] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setErrorTrace(value: ScanRunErrorTrace): Self = this.set("errorTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorTrace: Self = this.set("errorTrace", js.undefined)
    
    @scala.inline
    def setExecutionState(value: String): Self = this.set("executionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionState: Self = this.set("executionState", js.undefined)
    
    @scala.inline
    def setHasVulnerabilities(value: Boolean): Self = this.set("hasVulnerabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasVulnerabilities: Self = this.set("hasVulnerabilities", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = this.set("progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressPercent: Self = this.set("progressPercent", js.undefined)
    
    @scala.inline
    def setResultState(value: String): Self = this.set("resultState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultState: Self = this.set("resultState", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setUrlsCrawledCount(value: String): Self = this.set("urlsCrawledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlsCrawledCount: Self = this.set("urlsCrawledCount", js.undefined)
    
    @scala.inline
    def setUrlsTestedCount(value: String): Self = this.set("urlsTestedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlsTestedCount: Self = this.set("urlsTestedCount", js.undefined)
    
    @scala.inline
    def setWarningTracesVarargs(value: ScanRunWarningTrace*): Self = this.set("warningTraces", js.Array(value :_*))
    
    @scala.inline
    def setWarningTraces(value: js.Array[ScanRunWarningTrace]): Self = this.set("warningTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningTraces: Self = this.set("warningTraces", js.undefined)
  }
}
