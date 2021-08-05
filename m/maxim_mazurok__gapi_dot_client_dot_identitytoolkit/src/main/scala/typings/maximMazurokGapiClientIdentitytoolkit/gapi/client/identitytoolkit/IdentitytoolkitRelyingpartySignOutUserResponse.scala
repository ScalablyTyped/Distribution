package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartySignOutUserResponse extends StObject {
  
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartySignOutUserResponse {
  
  inline def apply(): IdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignOutUserResponse]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartySignOutUserResponse](x: Self) {
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
