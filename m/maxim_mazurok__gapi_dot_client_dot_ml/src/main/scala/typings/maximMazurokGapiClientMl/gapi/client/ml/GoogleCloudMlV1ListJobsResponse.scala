package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ListJobsResponse extends js.Object {
  
  /** The list of jobs. */
  var jobs: js.UndefOr[js.Array[GoogleCloudMlV1Job]] = js.native
  
  /** Optional. Pass this token as the `page_token` field of the request for a subsequent call. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1ListJobsResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListJobsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ListJobsResponseOps[Self <: GoogleCloudMlV1ListJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setJobsVarargs(value: GoogleCloudMlV1Job*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: js.Array[GoogleCloudMlV1Job]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
