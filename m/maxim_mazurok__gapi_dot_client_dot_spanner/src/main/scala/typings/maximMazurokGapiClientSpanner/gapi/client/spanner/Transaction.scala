package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  /**
    * `id` may be used to identify the transaction in subsequent Read, ExecuteSql, Commit, or Rollback calls. Single-use read-only transactions do not have IDs, because single-use
    * transactions do not support multiple requests.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * For snapshot read-only transactions, the read timestamp chosen for the transaction. Not returned by default: see TransactionOptions.ReadOnly.return_read_timestamp. A timestamp in
    * RFC3339 UTC \"Zulu\" format, accurate to nanoseconds. Example: `"2014-10-02T15:01:23.045123456Z"`.
    */
  var readTimestamp: js.UndefOr[String] = js.undefined
}
object Transaction {
  
  @scala.inline
  def apply(): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setReadTimestamp(value: String): Self = StObject.set(x, "readTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimestampUndefined: Self = StObject.set(x, "readTimestamp", js.undefined)
  }
}
