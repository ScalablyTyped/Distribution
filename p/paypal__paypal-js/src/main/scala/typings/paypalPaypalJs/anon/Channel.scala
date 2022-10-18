package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.BATCH
import typings.paypalPaypalJs.paypalPaypalJsStrings.MOBILE_APP
import typings.paypalPaypalJs.paypalPaypalJsStrings.MOBILE_WEB
import typings.paypalPaypalJs.paypalPaypalJsStrings.PAY_WITH_CRYPTO
import typings.paypalPaypalJs.paypalPaypalJsStrings.WEB
import typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.Payment
import typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.ProductFlow
import typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.UserExperienceFlow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /** The payment flow channel type. */
  var channel: WEB | MOBILE_WEB | MOBILE_APP | BATCH
  
  /** The payment method user chose to start the payment process. */
  var entry_point: Payment
  
  /** Payment method used to complete the transaction. This can sometimes be different than the entry point if user changed their mind during the checkout flow. */
  var payment_method: Payment | PAY_WITH_CRYPTO
  
  /** The product flow type. */
  var product_flow: ProductFlow
  
  /** The user experience flow for the PayPal transaction. */
  var user_experience_flow: UserExperienceFlow
}
object Channel {
  
  inline def apply(
    channel: WEB | MOBILE_WEB | MOBILE_APP | BATCH,
    entry_point: Payment,
    payment_method: Payment | PAY_WITH_CRYPTO,
    product_flow: ProductFlow,
    user_experience_flow: UserExperienceFlow
  ): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], entry_point = entry_point.asInstanceOf[js.Any], payment_method = payment_method.asInstanceOf[js.Any], product_flow = product_flow.asInstanceOf[js.Any], user_experience_flow = user_experience_flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setChannel(value: WEB | MOBILE_WEB | MOBILE_APP | BATCH): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setEntry_point(value: Payment): Self = StObject.set(x, "entry_point", value.asInstanceOf[js.Any])
    
    inline def setPayment_method(value: Payment | PAY_WITH_CRYPTO): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setProduct_flow(value: ProductFlow): Self = StObject.set(x, "product_flow", value.asInstanceOf[js.Any])
    
    inline def setUser_experience_flow(value: UserExperienceFlow): Self = StObject.set(x, "user_experience_flow", value.asInstanceOf[js.Any])
  }
}
