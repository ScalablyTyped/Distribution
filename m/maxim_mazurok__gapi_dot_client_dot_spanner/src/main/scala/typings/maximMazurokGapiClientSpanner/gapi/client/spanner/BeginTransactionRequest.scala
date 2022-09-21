package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginTransactionRequest extends StObject {
  
  /** Required. Options for the new transaction. */
  var options: js.UndefOr[TransactionOptions] = js.undefined
  
  /**
    * Common options for this request. Priority is ignored for this request. Setting the priority in this request_options struct will not do anything. To set the priority for a
    * transaction, set it on the reads and writes that are part of this transaction instead.
    */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
}
object BeginTransactionRequest {
  
  inline def apply(): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  
  extension [Self <: BeginTransactionRequest](x: Self) {
    
    inline def setOptions(value: TransactionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
  }
}
