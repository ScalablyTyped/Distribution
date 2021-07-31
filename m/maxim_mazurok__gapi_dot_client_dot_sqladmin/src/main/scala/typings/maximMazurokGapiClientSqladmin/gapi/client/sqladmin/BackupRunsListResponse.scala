package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupRunsListResponse extends StObject {
  
  /** A list of backup runs in reverse chronological order of the enqueued time. */
  var items: js.UndefOr[js.Array[BackupRun]] = js.undefined
  
  /** This is always *sql#backupRunsList*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object BackupRunsListResponse {
  
  @scala.inline
  def apply(): BackupRunsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupRunsListResponse]
  }
  
  @scala.inline
  implicit class BackupRunsListResponseMutableBuilder[Self <: BackupRunsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[BackupRun]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BackupRun*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
