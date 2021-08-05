package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkspacesResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** All Workspaces of a GTM Container. */
  var workspace: js.UndefOr[js.Array[Workspace]] = js.undefined
}
object ListWorkspacesResponse {
  
  inline def apply(): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  
  extension [Self <: ListWorkspacesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkspace(value: js.Array[Workspace]): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    
    inline def setWorkspaceVarargs(value: Workspace*): Self = StObject.set(x, "workspace", js.Array(value :_*))
  }
}
