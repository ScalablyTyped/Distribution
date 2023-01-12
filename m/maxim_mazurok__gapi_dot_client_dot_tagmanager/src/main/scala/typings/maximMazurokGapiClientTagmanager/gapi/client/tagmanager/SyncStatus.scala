package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncStatus extends StObject {
  
  /** Synchornization operation detected a merge conflict. */
  var mergeConflict: js.UndefOr[Boolean] = js.undefined
  
  /** An error occurred during the synchronization operation. */
  var syncError: js.UndefOr[Boolean] = js.undefined
}
object SyncStatus {
  
  inline def apply(): SyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncStatus] (val x: Self) extends AnyVal {
    
    inline def setMergeConflict(value: Boolean): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    inline def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    inline def setSyncError(value: Boolean): Self = StObject.set(x, "syncError", value.asInstanceOf[js.Any])
    
    inline def setSyncErrorUndefined: Self = StObject.set(x, "syncError", js.undefined)
  }
}
