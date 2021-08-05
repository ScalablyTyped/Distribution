package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncWorkspaceResponse extends StObject {
  
  /** The merge conflict after sync. If this field is not empty, the sync is still treated as successful. But a version cannot be created until all conflicts are resolved. */
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
  
  /** Indicates whether synchronization caused a merge conflict or sync error. */
  var syncStatus: js.UndefOr[SyncStatus] = js.undefined
}
object SyncWorkspaceResponse {
  
  inline def apply(): SyncWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncWorkspaceResponse]
  }
  
  extension [Self <: SyncWorkspaceResponse](x: Self) {
    
    inline def setMergeConflict(value: js.Array[MergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    inline def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    inline def setMergeConflictVarargs(value: MergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value :_*))
    
    inline def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
    
    inline def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
  }
}
