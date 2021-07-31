package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectExtras extends StObject {
  
  /**
    * extra client assertion payload parameters to be sent as part of a client JWT assertion.
    * This is only used when the client's token_endpoint_auth_method is either client_secret_jwt or private_key_jwt.
    */
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
  
  /**
    * extra request body properties to be sent to the introspection endpoint.
    */
  var introspectBody: js.UndefOr[js.Object] = js.undefined
}
object IntrospectExtras {
  
  @scala.inline
  def apply(): IntrospectExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrospectExtras]
  }
  
  @scala.inline
  implicit class IntrospectExtrasMutableBuilder[Self <: IntrospectExtras] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAssertionPayload(value: js.Object): Self = StObject.set(x, "clientAssertionPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAssertionPayloadUndefined: Self = StObject.set(x, "clientAssertionPayload", js.undefined)
    
    @scala.inline
    def setIntrospectBody(value: js.Object): Self = StObject.set(x, "introspectBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntrospectBodyUndefined: Self = StObject.set(x, "introspectBody", js.undefined)
  }
}
