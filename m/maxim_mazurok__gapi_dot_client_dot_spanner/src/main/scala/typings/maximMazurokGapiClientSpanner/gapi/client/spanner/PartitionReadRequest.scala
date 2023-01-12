package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionReadRequest extends StObject {
  
  /** The columns of table to be returned for each row matching this request. */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If non-empty, the name of an index on table. This index is used instead of the table primary key when interpreting key_set and sorting result rows. See key_set for further
    * information.
    */
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the rows in table to be yielded, unless index is present. If index is present, then
    * key_set instead names index keys in index. It is not an error for the `key_set` to name rows that do not exist in the database. Read yields nothing for nonexistent rows.
    */
  var keySet: js.UndefOr[KeySet] = js.undefined
  
  /** Additional options that affect how many partitions are created. */
  var partitionOptions: js.UndefOr[PartitionOptions] = js.undefined
  
  /** Required. The name of the table in the database to be read. */
  var table: js.UndefOr[String] = js.undefined
  
  /** Read only snapshot transactions are supported, read/write and single use transactions are not. */
  var transaction: js.UndefOr[TransactionSelector] = js.undefined
}
object PartitionReadRequest {
  
  inline def apply(): PartitionReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionReadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionReadRequest] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKeySet(value: KeySet): Self = StObject.set(x, "keySet", value.asInstanceOf[js.Any])
    
    inline def setKeySetUndefined: Self = StObject.set(x, "keySet", js.undefined)
    
    inline def setPartitionOptions(value: PartitionOptions): Self = StObject.set(x, "partitionOptions", value.asInstanceOf[js.Any])
    
    inline def setPartitionOptionsUndefined: Self = StObject.set(x, "partitionOptions", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTransaction(value: TransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
