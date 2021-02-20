package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkspacesResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** All Workspaces of a GTM Container. */
  var workspace: js.UndefOr[js.Array[Workspace]] = js.native
}
object ListWorkspacesResponse {
  
  @scala.inline
  def apply(): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  
  @scala.inline
  implicit class ListWorkspacesResponseMutableBuilder[Self <: ListWorkspacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setWorkspace(value: js.Array[Workspace]): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    
    @scala.inline
    def setWorkspaceVarargs(value: Workspace*): Self = StObject.set(x, "workspace", js.Array(value :_*))
  }
}
