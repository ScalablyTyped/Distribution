package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DlpJob extends js.Object {
  
  /** Time when the job was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Time when the job finished. */
  var endTime: js.UndefOr[String] = js.native
  
  /** A stream of errors encountered running the job. */
  var errors: js.UndefOr[js.Array[GooglePrivacyDlpV2Error]] = js.native
  
  /** Results from inspecting a data source. */
  var inspectDetails: js.UndefOr[GooglePrivacyDlpV2InspectDataSourceDetails] = js.native
  
  /** If created by a job trigger, the resource name of the trigger that instantiated the job. */
  var jobTriggerName: js.UndefOr[String] = js.native
  
  /** The server-assigned name. */
  var name: js.UndefOr[String] = js.native
  
  /** Results from analyzing risk of a data source. */
  var riskDetails: js.UndefOr[GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] = js.native
  
  /** Time when the job started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** State of a job. */
  var state: js.UndefOr[String] = js.native
  
  /** The type of job. */
  var `type`: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2DlpJob {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DlpJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DlpJob]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DlpJobOps[Self <: GooglePrivacyDlpV2DlpJob] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: GooglePrivacyDlpV2Error*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[GooglePrivacyDlpV2Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setInspectDetails(value: GooglePrivacyDlpV2InspectDataSourceDetails): Self = this.set("inspectDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectDetails: Self = this.set("inspectDetails", js.undefined)
    
    @scala.inline
    def setJobTriggerName(value: String): Self = this.set("jobTriggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTriggerName: Self = this.set("jobTriggerName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRiskDetails(value: GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails): Self = this.set("riskDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskDetails: Self = this.set("riskDetails", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
