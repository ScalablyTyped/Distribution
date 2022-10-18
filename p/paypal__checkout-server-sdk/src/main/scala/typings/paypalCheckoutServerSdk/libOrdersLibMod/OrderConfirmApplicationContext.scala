package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderConfirmApplicationContext extends StObject {
  
  var brand_name: String
  
  var cancel_url: String
  
  var locale: String
  
  var return_url: String
}
object OrderConfirmApplicationContext {
  
  inline def apply(brand_name: String, cancel_url: String, locale: String, return_url: String): OrderConfirmApplicationContext = {
    val __obj = js.Dynamic.literal(brand_name = brand_name.asInstanceOf[js.Any], cancel_url = cancel_url.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderConfirmApplicationContext]
  }
  
  extension [Self <: OrderConfirmApplicationContext](x: Self) {
    
    inline def setBrand_name(value: String): Self = StObject.set(x, "brand_name", value.asInstanceOf[js.Any])
    
    inline def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
  }
}
