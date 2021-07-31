package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudTalentV4JobResult extends StObject {
  
  /** Here Job only contains basic information including name, company, language_code and requisition_id, use getJob method to retrieve detailed information of the created/updated job. */
  var job: js.UndefOr[GoogleCloudTalentV4Job] = js.undefined
  
  /** The status of the job processed. This field is populated if the processing of the job fails. */
  var status: js.UndefOr[Status] = js.undefined
}
object GoogleCloudTalentV4JobResult {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4JobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4JobResult]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4JobResultMutableBuilder[Self <: GoogleCloudTalentV4JobResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: GoogleCloudTalentV4Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
