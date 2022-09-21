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
  
  inline def apply(): UploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAccountResponse]
  }
  
  extension [Self <: UploadAccountResponse](x: Self) {
    
    inline def setError(value: js.Array[Index]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: Index*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
