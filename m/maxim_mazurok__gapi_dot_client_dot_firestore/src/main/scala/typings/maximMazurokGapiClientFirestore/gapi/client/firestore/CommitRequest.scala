package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitRequest extends StObject {
  
  /** If set, applies all writes in this transaction, and commits it. */
  var transaction: js.UndefOr[String] = js.undefined
  
  /** The writes to apply. Always executed atomically and in order. */
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}
object CommitRequest {
  
  @scala.inline
  def apply(): CommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitRequest]
  }
  
  @scala.inline
  implicit class CommitRequestMutableBuilder[Self <: CommitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    @scala.inline
    def setWrites(value: js.Array[Write]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    @scala.inline
    def setWritesVarargs(value: Write*): Self = StObject.set(x, "writes", js.Array(value :_*))
  }
}
