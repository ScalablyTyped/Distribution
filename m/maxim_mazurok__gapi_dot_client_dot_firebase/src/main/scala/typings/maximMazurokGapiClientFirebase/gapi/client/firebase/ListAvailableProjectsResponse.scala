package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAvailableProjectsResponse extends StObject {
  
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
  implicit class ListAvailableProjectsResponseMutableBuilder[Self <: ListAvailableProjectsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProjectInfo(value: js.Array[ProjectInfo]): Self = StObject.set(x, "projectInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectInfoUndefined: Self = StObject.set(x, "projectInfo", js.undefined)
    
    @scala.inline
    def setProjectInfoVarargs(value: ProjectInfo*): Self = StObject.set(x, "projectInfo", js.Array(value :_*))
  }
}
