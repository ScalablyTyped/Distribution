package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccountResponse extends StObject {
  
  /** The fixed string "identitytoolkit#DeleteAccountResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object DeleteAccountResponse {
  
  inline def apply(): DeleteAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
