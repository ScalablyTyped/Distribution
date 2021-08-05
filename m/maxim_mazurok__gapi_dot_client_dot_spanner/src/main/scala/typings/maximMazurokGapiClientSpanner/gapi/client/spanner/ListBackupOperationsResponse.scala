package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupOperationsResponse extends StObject {
  
  /** `next_page_token` can be sent in a subsequent ListBackupOperations call to fetch more of the matching metadata. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of matching backup long-running operations. Each operation's name will be prefixed by the backup's name and the operation's metadata will be of type CreateBackupMetadata.
    * Operations returned include those that are pending or have completed/failed/canceled within the last 7 days. Operations returned are ordered by
    * `operation.metadata.value.progress.start_time` in descending order starting from the most recently started operation.
    */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
}
object ListBackupOperationsResponse {
  
  inline def apply(): ListBackupOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupOperationsResponse]
  }
  
  extension [Self <: ListBackupOperationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
