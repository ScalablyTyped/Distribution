package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionSelector extends js.Object {
  
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
  implicit class TransactionSelectorOps[Self <: TransactionSelector] (val x: Self) extends AnyVal {
    
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
    def setBegin(value: TransactionOptions): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSingleUse(value: TransactionOptions): Self = this.set("singleUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleUse: Self = this.set("singleUse", js.undefined)
  }
}
