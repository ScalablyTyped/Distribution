package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionSelector extends StObject {
  
  /** Begin a new transaction and execute this read or SQL query in it. The transaction ID of the new transaction is returned in ResultSetMetadata.transaction, which is a Transaction. */
  var begin: js.UndefOr[TransactionOptions] = js.native
  
  /** Execute the read or SQL query in a previously-started transaction. */
  var id: js.UndefOr[String] = js.native
  
  /** Execute the read or SQL query in a temporary transaction. This is the most efficient way to execute a transaction that consists of a single SQL query. */
  var singleUse: js.UndefOr[TransactionOptions] = js.native
}
object TransactionSelector {
  
  @scala.inline
  def apply(): TransactionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionSelector]
  }
  
  @scala.inline
  implicit class TransactionSelectorMutableBuilder[Self <: TransactionSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: TransactionOptions): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSingleUse(value: TransactionOptions): Self = StObject.set(x, "singleUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUseUndefined: Self = StObject.set(x, "singleUse", js.undefined)
  }
}
