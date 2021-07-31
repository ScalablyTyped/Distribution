package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOptions extends StObject {
  
  /** The transaction can only be used for read operations. */
  var readOnly: js.UndefOr[ReadOnly] = js.undefined
  
  /** The transaction can be used for both read and write operations. */
  var readWrite: js.UndefOr[ReadWrite] = js.undefined
}
object TransactionOptions {
  
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  @scala.inline
  implicit class TransactionOptionsMutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: ReadOnly): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReadWrite(value: ReadWrite): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
