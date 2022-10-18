package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayerBase extends StObject {
  
  var email_address: String
  
  var payer_id: String
}
object PayerBase {
  
  inline def apply(email_address: String, payer_id: String): PayerBase = {
    val __obj = js.Dynamic.literal(email_address = email_address.asInstanceOf[js.Any], payer_id = payer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayerBase]
  }
  
  extension [Self <: PayerBase](x: Self) {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
  }
}
