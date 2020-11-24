package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadRequest extends js.Object {
  
  /** Required. The columns of table to be returned for each row matching this request. */
  var columns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If non-empty, the name of an index on table. This index is used instead of the table primary key when interpreting key_set and sorting result rows. See key_set for further
    * information.
    */
  var index: js.UndefOr[String] = js.native
  
  /**
    * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the rows in table to be yielded, unless index is present. If index is present, then
    * key_set instead names index keys in index. If the partition_token field is empty, rows are yielded in table primary key order (if index is empty) or index key order (if index is
    * non-empty). If the partition_token field is not empty, rows will be yielded in an unspecified order. It is not an error for the `key_set` to name rows that do not exist in the
    * database. Read yields nothing for nonexistent rows.
    */
  var keySet: js.UndefOr[KeySet] = js.native
  
  /** If greater than zero, only the first `limit` rows are yielded. If `limit` is zero, the default is no limit. A limit cannot be specified if `partition_token` is set. */
  var limit: js.UndefOr[String] = js.native
  
  /**
    * If present, results will be restricted to the specified partition previously created using PartitionRead(). There must be an exact match for the values of fields common to this
    * message and the PartitionReadRequest message used to create this partition_token.
    */
  var partitionToken: js.UndefOr[String] = js.native
  
  /**
    * If this request is resuming a previously interrupted read, `resume_token` should be copied from the last PartialResultSet yielded before the interruption. Doing this enables the new
    * read to resume where the last read left off. The rest of the request parameters must exactly match the request that yielded this token.
    */
  var resumeToken: js.UndefOr[String] = js.native
  
  /** Required. The name of the table in the database to be read. */
  var table: js.UndefOr[String] = js.native
  
  /** The transaction to use. If none is provided, the default is a temporary read-only transaction with strong concurrency. */
  var transaction: js.UndefOr[TransactionSelector] = js.native
}
object ReadRequest {
  
  @scala.inline
  def apply(): ReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadRequest]
  }
  
  @scala.inline
  implicit class ReadRequestOps[Self <: ReadRequest] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setKeySet(value: KeySet): Self = this.set("keySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySet: Self = this.set("keySet", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPartitionToken(value: String): Self = this.set("partitionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionToken: Self = this.set("partitionToken", js.undefined)
    
    @scala.inline
    def setResumeToken(value: String): Self = this.set("resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeToken: Self = this.set("resumeToken", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTransaction(value: TransactionSelector): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
