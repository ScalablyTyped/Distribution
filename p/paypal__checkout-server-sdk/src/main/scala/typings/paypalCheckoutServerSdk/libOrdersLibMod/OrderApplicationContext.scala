package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderApplicationContext extends StObject {
  
  var brand_name: js.UndefOr[String] = js.undefined
  
  var cancel_url: js.UndefOr[String] = js.undefined
  
  var landing_page: js.UndefOr[LandingPage] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var payment_method: js.UndefOr[PaymentMethod] = js.undefined
  
  var return_url: js.UndefOr[String] = js.undefined
  
  var shipping_preference: js.UndefOr[ShippingPreference] = js.undefined
  
  var stored_payment_source: js.UndefOr[StoredPaymentSource] = js.undefined
  
  var user_action: js.UndefOr[UserAction] = js.undefined
}
object OrderApplicationContext {
  
  inline def apply(): OrderApplicationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderApplicationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderApplicationContext] (val x: Self) extends AnyVal {
    
    inline def setBrand_name(value: String): Self = StObject.set(x, "brand_name", value.asInstanceOf[js.Any])
    
    inline def setBrand_nameUndefined: Self = StObject.set(x, "brand_name", js.undefined)
    
    inline def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    inline def setCancel_urlUndefined: Self = StObject.set(x, "cancel_url", js.undefined)
    
    inline def setLanding_page(value: LandingPage): Self = StObject.set(x, "landing_page", value.asInstanceOf[js.Any])
    
    inline def setLanding_pageUndefined: Self = StObject.set(x, "landing_page", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPayment_method(value: PaymentMethod): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    inline def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    
    inline def setShipping_preference(value: ShippingPreference): Self = StObject.set(x, "shipping_preference", value.asInstanceOf[js.Any])
    
    inline def setShipping_preferenceUndefined: Self = StObject.set(x, "shipping_preference", js.undefined)
    
    inline def setStored_payment_source(value: StoredPaymentSource): Self = StObject.set(x, "stored_payment_source", value.asInstanceOf[js.Any])
    
    inline def setStored_payment_sourceUndefined: Self = StObject.set(x, "stored_payment_source", js.undefined)
    
    inline def setUser_action(value: UserAction): Self = StObject.set(x, "user_action", value.asInstanceOf[js.Any])
    
    inline def setUser_actionUndefined: Self = StObject.set(x, "user_action", js.undefined)
  }
}
