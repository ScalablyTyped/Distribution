package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteJobsRequest extends js.Object {
  
  /**
    * Required. The filter string specifies the jobs to be deleted. Supported operator: =, AND The fields eligible for filtering are: * `companyName` (Required) * `requisitionId`
    * (Required) Sample Query: companyName = "projects/api-test-project/companies/123" AND requisitionId = "req-1"
    */
  var filter: js.UndefOr[String] = js.native
}
object BatchDeleteJobsRequest {
  
  @scala.inline
  def apply(): BatchDeleteJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteJobsRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteJobsRequestOps[Self <: BatchDeleteJobsRequest] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
