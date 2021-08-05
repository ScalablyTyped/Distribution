package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeExtras extends StObject {
  
  /**
    * extra client assertion payload parameters to be sent as part of a client JWT assertion.
    * This is only used when the client's token_endpoint_auth_method is either client_secret_jwt or private_key_jwt.
    */
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
  
  /**
    * extra request body properties to be sent to the revocation endpoint.
    */
  var revokeBody: js.UndefOr[js.Object] = js.undefined
}
object RevokeExtras {
  
  inline def apply(): RevokeExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeExtras]
  }
  
  extension [Self <: RevokeExtras](x: Self) {
    
    inline def setClientAssertionPayload(value: js.Object): Self = StObject.set(x, "clientAssertionPayload", value.asInstanceOf[js.Any])
    
    inline def setClientAssertionPayloadUndefined: Self = StObject.set(x, "clientAssertionPayload", js.undefined)
    
    inline def setRevokeBody(value: js.Object): Self = StObject.set(x, "revokeBody", value.asInstanceOf[js.Any])
    
    inline def setRevokeBodyUndefined: Self = StObject.set(x, "revokeBody", js.undefined)
  }
}
