package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartySignOutUserRequest extends StObject {
  
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartySignOutUserRequest {
  
  inline def apply(): IdentitytoolkitRelyingpartySignOutUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignOutUserRequest]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartySignOutUserRequest](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
