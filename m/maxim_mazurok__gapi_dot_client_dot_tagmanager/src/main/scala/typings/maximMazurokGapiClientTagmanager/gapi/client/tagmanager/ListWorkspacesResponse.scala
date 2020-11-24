package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkspacesResponse extends js.Object {
  
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
  implicit class ListWorkspacesResponseOps[Self <: ListWorkspacesResponse] (val x: Self) extends AnyVal {
    
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
    def setWorkspaceVarargs(value: Workspace*): Self = this.set("workspace", js.Array(value :_*))
    
    @scala.inline
    def setWorkspace(value: js.Array[Workspace]): Self = this.set("workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
}
