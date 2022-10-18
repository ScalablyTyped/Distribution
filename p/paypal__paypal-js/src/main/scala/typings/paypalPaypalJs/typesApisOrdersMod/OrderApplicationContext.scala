package typings.paypalPaypalJs.typesApisOrdersMod

import typings.paypalPaypalJs.paypalPaypalJsStrings.BILLING
import typings.paypalPaypalJs.paypalPaypalJsStrings.CONTINUE
import typings.paypalPaypalJs.paypalPaypalJsStrings.LOGIN
import typings.paypalPaypalJs.paypalPaypalJsStrings.NO_PREFERENCE
import typings.paypalPaypalJs.paypalPaypalJsStrings.PAY_NOW
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderApplicationContext extends StObject {
  
  var brand_name: js.UndefOr[String] = js.undefined
  
  var cancel_url: js.UndefOr[String] = js.undefined
  
  var landing_page: js.UndefOr[LOGIN | BILLING | NO_PREFERENCE] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var payment_method: js.UndefOr[Record[String, Any]] = js.undefined
  
  var return_url: js.UndefOr[String] = js.undefined
  
  var shipping_preference: js.UndefOr[SHIPPING_PREFERENCE] = js.undefined
  
  var stored_payment_source: js.UndefOr[Record[String, Any]] = js.undefined
  
  var user_action: js.UndefOr[CONTINUE | PAY_NOW] = js.undefined
}
object OrderApplicationContext {
  
  inline def apply(): OrderApplicationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderApplicationContext]
  }
  
  extension [Self <: OrderApplicationContext](x: Self) {
    
    inline def setBrand_name(value: String): Self = StObject.set(x, "brand_name", value.asInstanceOf[js.Any])
    
    inline def setBrand_nameUndefined: Self = StObject.set(x, "brand_name", js.undefined)
    
    inline def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    inline def setCancel_urlUndefined: Self = StObject.set(x, "cancel_url", js.undefined)
    
    inline def setLanding_page(value: LOGIN | BILLING | NO_PREFERENCE): Self = StObject.set(x, "landing_page", value.asInstanceOf[js.Any])
    
    inline def setLanding_pageUndefined: Self = StObject.set(x, "landing_page", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPayment_method(value: Record[String, Any]): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    inline def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    
    inline def setShipping_preference(value: SHIPPING_PREFERENCE): Self = StObject.set(x, "shipping_preference", value.asInstanceOf[js.Any])
    
    inline def setShipping_preferenceUndefined: Self = StObject.set(x, "shipping_preference", js.undefined)
    
    inline def setStored_payment_source(value: Record[String, Any]): Self = StObject.set(x, "stored_payment_source", value.asInstanceOf[js.Any])
    
    inline def setStored_payment_sourceUndefined: Self = StObject.set(x, "stored_payment_source", js.undefined)
    
    inline def setUser_action(value: CONTINUE | PAY_NOW): Self = StObject.set(x, "user_action", value.asInstanceOf[js.Any])
    
    inline def setUser_actionUndefined: Self = StObject.set(x, "user_action", js.undefined)
  }
}
