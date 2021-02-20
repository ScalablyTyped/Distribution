package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncStatus extends StObject {
  
  /** Synchornization operation detected a merge conflict. */
  var mergeConflict: js.UndefOr[Boolean] = js.native
  
  /** An error occurred during the synchronization operation. */
  var syncError: js.UndefOr[Boolean] = js.native
}
object SyncStatus {
  
  @scala.inline
  def apply(): SyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncStatus]
  }
  
  @scala.inline
  implicit class SyncStatusMutableBuilder[Self <: SyncStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeConflict(value: Boolean): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
    
    @scala.inline
    def setSyncError(value: Boolean): Self = StObject.set(x, "syncError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncErrorUndefined: Self = StObject.set(x, "syncError", js.undefined)
  }
}
