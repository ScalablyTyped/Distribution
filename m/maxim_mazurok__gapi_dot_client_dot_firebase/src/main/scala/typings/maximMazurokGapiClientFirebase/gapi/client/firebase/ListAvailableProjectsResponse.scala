package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAvailableProjectsResponse extends js.Object {
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used
    * in a subsequent calls to `ListAvailableProjects` to find the next group of Projects. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of GCP `Projects` which can have Firebase resources added to them. */
  var projectInfo: js.UndefOr[js.Array[ProjectInfo]] = js.native
}
object ListAvailableProjectsResponse {
  
  @scala.inline
  def apply(): ListAvailableProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableProjectsResponse]
  }
  
  @scala.inline
  implicit class ListAvailableProjectsResponseOps[Self <: ListAvailableProjectsResponse] (val x: Self) extends AnyVal {
    
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
    def setProjectInfoVarargs(value: ProjectInfo*): Self = this.set("projectInfo", js.Array(value :_*))
    
    @scala.inline
    def setProjectInfo(value: js.Array[ProjectInfo]): Self = this.set("projectInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectInfo: Self = this.set("projectInfo", js.undefined)
  }
}
