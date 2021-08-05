package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadWrite extends StObject {
  
  /** An optional transaction to retry. */
  var retryTransaction: js.UndefOr[String] = js.undefined
}
object ReadWrite {
  
  inline def apply(): ReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadWrite]
  }
  
  extension [Self <: ReadWrite](x: Self) {
    
    inline def setRetryTransaction(value: String): Self = StObject.set(x, "retryTransaction", value.asInstanceOf[js.Any])
    
    inline def setRetryTransactionUndefined: Self = StObject.set(x, "retryTransaction", js.undefined)
  }
}
