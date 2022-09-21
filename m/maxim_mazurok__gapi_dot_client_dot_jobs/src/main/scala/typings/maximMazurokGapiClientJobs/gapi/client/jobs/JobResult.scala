package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobResult extends StObject {
  
  /** Here Job only contains basic information including name, company, language_code and requisition_id, use getJob method to retrieve detailed information of the created/updated job. */
  var job: js.UndefOr[Job] = js.undefined
  
  /** The status of the job processed. This field is populated if the processing of the job fails. */
  var status: js.UndefOr[Status] = js.undefined
}
object JobResult {
  
  inline def apply(): JobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobResult]
  }
  
  extension [Self <: JobResult](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
