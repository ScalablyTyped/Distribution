package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPatchJobsResponse extends js.Object {
  
  /** A pagination token that can be used to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of patch jobs. */
  var patchJobs: js.UndefOr[js.Array[PatchJob]] = js.native
}
object ListPatchJobsResponse {
  
  @scala.inline
  def apply(): ListPatchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatchJobsResponse]
  }
  
  @scala.inline
  implicit class ListPatchJobsResponseOps[Self <: ListPatchJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPatchJobsVarargs(value: PatchJob*): Self = this.set("patchJobs", js.Array(value :_*))
    
    @scala.inline
    def setPatchJobs(value: js.Array[PatchJob]): Self = this.set("patchJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchJobs: Self = this.set("patchJobs", js.undefined)
  }
}
