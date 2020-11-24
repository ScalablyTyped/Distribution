package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupOperationsResponse extends js.Object {
  
  /** `next_page_token` can be sent in a subsequent ListBackupOperations call to fetch more of the matching metadata. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of matching backup long-running operations. Each operation's name will be prefixed by the backup's name and the operation's metadata will be of type CreateBackupMetadata.
    * Operations returned include those that are pending or have completed/failed/canceled within the last 7 days. Operations returned are ordered by
    * `operation.metadata.value.progress.start_time` in descending order starting from the most recently started operation.
    */
  var operations: js.UndefOr[js.Array[Operation]] = js.native
}
object ListBackupOperationsResponse {
  
  @scala.inline
  def apply(): ListBackupOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupOperationsResponse]
  }
  
  @scala.inline
  implicit class ListBackupOperationsResponseOps[Self <: ListBackupOperationsResponse] (val x: Self) extends AnyVal {
    
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
    def setOperationsVarargs(value: Operation*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: js.Array[Operation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
}
