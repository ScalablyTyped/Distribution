package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginTransactionResponse extends StObject {
  
  /** The transaction that was started. */
  var transaction: js.UndefOr[String] = js.native
}
object BeginTransactionResponse {
  
  @scala.inline
  def apply(): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionResponse]
  }
  
  @scala.inline
  implicit class BeginTransactionResponseMutableBuilder[Self <: BeginTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
