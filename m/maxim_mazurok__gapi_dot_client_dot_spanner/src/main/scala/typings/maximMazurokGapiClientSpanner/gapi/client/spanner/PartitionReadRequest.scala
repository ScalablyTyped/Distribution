package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionReadRequest extends js.Object {
  
  /** The columns of table to be returned for each row matching this request. */
  var columns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If non-empty, the name of an index on table. This index is used instead of the table primary key when interpreting key_set and sorting result rows. See key_set for further
    * information.
    */
  var index: js.UndefOr[String] = js.native
  
  /**
    * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the rows in table to be yielded, unless index is present. If index is present, then
    * key_set instead names index keys in index. It is not an error for the `key_set` to name rows that do not exist in the database. Read yields nothing for nonexistent rows.
    */
  var keySet: js.UndefOr[KeySet] = js.native
  
  /** Additional options that affect how many partitions are created. */
  var partitionOptions: js.UndefOr[PartitionOptions] = js.native
  
  /** Required. The name of the table in the database to be read. */
  var table: js.UndefOr[String] = js.native
  
  /** Read only snapshot transactions are supported, read/write and single use transactions are not. */
  var transaction: js.UndefOr[TransactionSelector] = js.native
}
object PartitionReadRequest {
  
  @scala.inline
  def apply(): PartitionReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionReadRequest]
  }
  
  @scala.inline
  implicit class PartitionReadRequestOps[Self <: PartitionReadRequest] (val x: Self) extends AnyVal {
    
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
    def setPartitionOptions(value: PartitionOptions): Self = this.set("partitionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionOptions: Self = this.set("partitionOptions", js.undefined)
    
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
