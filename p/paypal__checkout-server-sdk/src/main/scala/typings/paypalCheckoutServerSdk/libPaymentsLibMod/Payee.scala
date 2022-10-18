package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payee extends StObject {
  
  var email_address: js.UndefOr[String] = js.undefined
  
  var merchant_id: js.UndefOr[String] = js.undefined
}
object Payee {
  
  inline def apply(): Payee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payee]
  }
  
  extension [Self <: Payee](x: Self) {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_addressUndefined: Self = StObject.set(x, "email_address", js.undefined)
    
    inline def setMerchant_id(value: String): Self = StObject.set(x, "merchant_id", value.asInstanceOf[js.Any])
    
    inline def setMerchant_idUndefined: Self = StObject.set(x, "merchant_id", js.undefined)
  }
}
