package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteJobsRequest extends StObject {
  
  /**
    * Required. The filter string specifies the jobs to be deleted. Supported operator: =, AND The fields eligible for filtering are: * `companyName` (Required) * `requisitionId`
    * (Required) Sample Query: companyName = "projects/api-test-project/companies/123" AND requisitionId = "req-1"
    */
  var filter: js.UndefOr[String] = js.undefined
}
object BatchDeleteJobsRequest {
  
  inline def apply(): BatchDeleteJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteJobsRequest]
  }
  
  extension [Self <: BatchDeleteJobsRequest](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
