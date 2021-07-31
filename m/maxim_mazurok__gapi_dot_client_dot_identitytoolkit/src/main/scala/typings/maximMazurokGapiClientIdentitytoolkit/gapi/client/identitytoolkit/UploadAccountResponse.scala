package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typings.maximMazurokGapiClientIdentitytoolkit.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadAccountResponse extends StObject {
  
  /** The error encountered while processing the account info. */
  var error: js.UndefOr[js.Array[Index]] = js.undefined
  
  /** The fixed string "identitytoolkit#UploadAccountResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object UploadAccountResponse {
  
  @scala.inline
  def apply(): UploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAccountResponse]
  }
  
  @scala.inline
  implicit class UploadAccountResponseMutableBuilder[Self <: UploadAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Array[Index]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: Index*): Self = StObject.set(x, "error", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
