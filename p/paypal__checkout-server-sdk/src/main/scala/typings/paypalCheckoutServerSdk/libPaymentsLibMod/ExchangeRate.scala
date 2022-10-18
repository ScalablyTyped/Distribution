package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeRate extends StObject {
  
  var source_currency: String
  
  var target_currency: String
  
  var value: String
}
object ExchangeRate {
  
  inline def apply(source_currency: String, target_currency: String, value: String): ExchangeRate = {
    val __obj = js.Dynamic.literal(source_currency = source_currency.asInstanceOf[js.Any], target_currency = target_currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRate]
  }
  
  extension [Self <: ExchangeRate](x: Self) {
    
    inline def setSource_currency(value: String): Self = StObject.set(x, "source_currency", value.asInstanceOf[js.Any])
    
    inline def setTarget_currency(value: String): Self = StObject.set(x, "target_currency", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
