package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteBatchDmlRequest extends js.Object {
  
  /**
    * Required. A per-transaction sequence number used to identify this request. This field makes each request idempotent such that if the request is received multiple times, at most one
    * will succeed. The sequence number must be monotonically increasing within the transaction. If a request arrives for the first time with an out-of-order sequence number, the
    * transaction may be aborted. Replays of previously handled requests will yield the same response as the first execution.
    */
  var seqno: js.UndefOr[String] = js.native
  
  /**
    * Required. The list of statements to execute in this batch. Statements are executed serially, such that the effects of statement `i` are visible to statement `i+1`. Each statement
    * must be a DML statement. Execution stops at the first failed statement; the remaining statements are not executed. Callers must provide at least one statement.
    */
  var statements: js.UndefOr[js.Array[Statement]] = js.native
  
  /**
    * Required. The transaction to use. Must be a read-write transaction. To protect against replays, single-use transactions are not supported. The caller must either supply an existing
    * transaction ID or begin a new transaction.
    */
  var transaction: js.UndefOr[TransactionSelector] = js.native
}
object ExecuteBatchDmlRequest {
  
  @scala.inline
  def apply(): ExecuteBatchDmlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteBatchDmlRequest]
  }
  
  @scala.inline
  implicit class ExecuteBatchDmlRequestOps[Self <: ExecuteBatchDmlRequest] (val x: Self) extends AnyVal {
    
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
    def setSeqno(value: String): Self = this.set("seqno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeqno: Self = this.set("seqno", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: Statement*): Self = this.set("statements", js.Array(value :_*))
    
    @scala.inline
    def setStatements(value: js.Array[Statement]): Self = this.set("statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
    
    @scala.inline
    def setTransaction(value: TransactionSelector): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
