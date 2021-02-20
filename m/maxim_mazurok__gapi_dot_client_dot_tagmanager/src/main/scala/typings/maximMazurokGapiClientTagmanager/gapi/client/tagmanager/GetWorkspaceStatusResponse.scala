package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkspaceStatusResponse extends StObject {
  
  /** The merge conflict after sync. */
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.native
  
  /** Entities that have been changed in the workspace. */
  var workspaceChange: js.UndefOr[js.Array[Entity]] = js.native
}
object GetWorkspaceStatusResponse {
  
  @scala.inline
  def apply(): GetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkspaceStatusResponse]
  }
  
  @scala.inline
  implicit class GetWorkspaceStatusResponseMutableBuilder[Self <: GetWorkspaceStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeConflict(value: js.Array[MergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    @scala.inline
    def setMergeConflictVarargs(value: MergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value :_*))
    
    @scala.inline
    def setWorkspaceChange(value: js.Array[Entity]): Self = StObject.set(x, "workspaceChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceChangeUndefined: Self = StObject.set(x, "workspaceChange", js.undefined)
    
    @scala.inline
    def setWorkspaceChangeVarargs(value: Entity*): Self = StObject.set(x, "workspaceChange", js.Array(value :_*))
  }
}
