package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginTransactionRequest extends StObject {
  
  /** The options for the transaction. Defaults to a read-write transaction. */
  var options: js.UndefOr[TransactionOptions] = js.native
}
object BeginTransactionRequest {
  
  @scala.inline
  def apply(): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  
  @scala.inline
  implicit class BeginTransactionRequestMutableBuilder[Self <: BeginTransactionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: TransactionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
