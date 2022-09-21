package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkspaceStatusResponse extends StObject {
  
  /** The merge conflict after sync. */
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
  
  /** Entities that have been changed in the workspace. */
  var workspaceChange: js.UndefOr[js.Array[Entity]] = js.undefined
}
object GetWorkspaceStatusResponse {
  
  inline def apply(): GetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkspaceStatusResponse]
  }
  
  extension [Self <: GetWorkspaceStatusResponse](x: Self) {
    
    inline def setMergeConflict(value: js.Array[MergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    inline def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    inline def setMergeConflictVarargs(value: MergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value*))
    
    inline def setWorkspaceChange(value: js.Array[Entity]): Self = StObject.set(x, "workspaceChange", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceChangeUndefined: Self = StObject.set(x, "workspaceChange", js.undefined)
    
    inline def setWorkspaceChangeVarargs(value: Entity*): Self = StObject.set(x, "workspaceChange", js.Array(value*))
  }
}
