package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Money extends StObject {
  
  var currency_code: String
  
  var value: String
}
object Money {
  
  inline def apply(currency_code: String, value: String): Money = {
    val __obj = js.Dynamic.literal(currency_code = currency_code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Money]
  }
  
  extension [Self <: Money](x: Self) {
    
    inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
