package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitRequest extends js.Object {
  
  /** The mutations to be executed when this transaction commits. All mutations are applied atomically, in the order they appear in this list. */
  var mutations: js.UndefOr[js.Array[Mutation]] = js.native
  
  /**
    * Execute mutations in a temporary transaction. Note that unlike commit of a previously-started transaction, commit with a temporary transaction is non-idempotent. That is, if the
    * `CommitRequest` is sent to Cloud Spanner more than once (for instance, due to retries in the application, or in the transport library), it is possible that the mutations are
    * executed more than once. If this is undesirable, use BeginTransaction and Commit instead.
    */
  var singleUseTransaction: js.UndefOr[TransactionOptions] = js.native
  
  /** Commit a previously-started transaction. */
  var transactionId: js.UndefOr[String] = js.native
}
object CommitRequest {
  
  @scala.inline
  def apply(): CommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitRequest]
  }
  
  @scala.inline
  implicit class CommitRequestOps[Self <: CommitRequest] (val x: Self) extends AnyVal {
    
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
    def setMutationsVarargs(value: Mutation*): Self = this.set("mutations", js.Array(value :_*))
    
    @scala.inline
    def setMutations(value: js.Array[Mutation]): Self = this.set("mutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutations: Self = this.set("mutations", js.undefined)
    
    @scala.inline
    def setSingleUseTransaction(value: TransactionOptions): Self = this.set("singleUseTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleUseTransaction: Self = this.set("singleUseTransaction", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
  }
}
