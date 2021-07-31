package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadWrite extends StObject {
  
  /** An optional transaction to retry. */
  var retryTransaction: js.UndefOr[String] = js.undefined
}
object ReadWrite {
  
  @scala.inline
  def apply(): ReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadWrite]
  }
  
  @scala.inline
  implicit class ReadWriteMutableBuilder[Self <: ReadWrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetryTransaction(value: String): Self = StObject.set(x, "retryTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryTransactionUndefined: Self = StObject.set(x, "retryTransaction", js.undefined)
  }
}
