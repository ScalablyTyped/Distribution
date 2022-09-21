package typings.mercadopago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPayloadMod {
  
  trait CreateCardPayload extends StObject {
    
    /** Customer's id */
    var customer_id: String
    
    /** Card token */
    var token: String
  }
  object CreateCardPayload {
    
    inline def apply(customer_id: String, token: String): CreateCardPayload = {
      val __obj = js.Dynamic.literal(customer_id = customer_id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardPayload]
    }
    
    extension [Self <: CreateCardPayload](x: Self) {
      
      inline def setCustomer_id(value: String): Self = StObject.set(x, "customer_id", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
