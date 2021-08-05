package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationResponse extends StObject {
  
  /**
    * Additional PayPal account details.
    */
  var details: AuthorizationResponseDetails
  
  /**
    * The payment method nonce.
    */
  var nonce: String
  
  /**
    * The payment method type, always `PayPalAccount`.
    */
  var `type`: String
}
object AuthorizationResponse {
  
  inline def apply(details: AuthorizationResponseDetails, nonce: String, `type`: String): AuthorizationResponse = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResponse]
  }
  
  extension [Self <: AuthorizationResponse](x: Self) {
    
    inline def setDetails(value: AuthorizationResponseDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
