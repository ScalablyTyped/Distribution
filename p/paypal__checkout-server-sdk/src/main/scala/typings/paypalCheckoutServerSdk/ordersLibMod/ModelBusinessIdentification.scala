package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.BUSINESS_REGISTRATION_NUMBER
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.TAX_IDENTIFICATION_NUMBER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBusinessIdentification extends StObject {
  
  var identifier: String
  
  var issued_time: String
  
  var issuer: DocumentIssuer
  
  var `type`: TAX_IDENTIFICATION_NUMBER | BUSINESS_REGISTRATION_NUMBER
}
object ModelBusinessIdentification {
  
  inline def apply(
    identifier: String,
    issued_time: String,
    issuer: DocumentIssuer,
    `type`: TAX_IDENTIFICATION_NUMBER | BUSINESS_REGISTRATION_NUMBER
  ): ModelBusinessIdentification = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], issued_time = issued_time.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelBusinessIdentification]
  }
  
  extension [Self <: ModelBusinessIdentification](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIssued_time(value: String): Self = StObject.set(x, "issued_time", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: DocumentIssuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setType(value: TAX_IDENTIFICATION_NUMBER | BUSINESS_REGISTRATION_NUMBER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
