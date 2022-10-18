package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountBreakdown extends StObject {
  
  var discount: Money
  
  var handling: Money
  
  var insurance: Money
  
  var item_total: Money
  
  var shipping: Money
  
  var shipping_discount: Money
  
  var tax_total: Money
}
object AmountBreakdown {
  
  inline def apply(
    discount: Money,
    handling: Money,
    insurance: Money,
    item_total: Money,
    shipping: Money,
    shipping_discount: Money,
    tax_total: Money
  ): AmountBreakdown = {
    val __obj = js.Dynamic.literal(discount = discount.asInstanceOf[js.Any], handling = handling.asInstanceOf[js.Any], insurance = insurance.asInstanceOf[js.Any], item_total = item_total.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], shipping_discount = shipping_discount.asInstanceOf[js.Any], tax_total = tax_total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountBreakdown]
  }
  
  extension [Self <: AmountBreakdown](x: Self) {
    
    inline def setDiscount(value: Money): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setHandling(value: Money): Self = StObject.set(x, "handling", value.asInstanceOf[js.Any])
    
    inline def setInsurance(value: Money): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setItem_total(value: Money): Self = StObject.set(x, "item_total", value.asInstanceOf[js.Any])
    
    inline def setShipping(value: Money): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShipping_discount(value: Money): Self = StObject.set(x, "shipping_discount", value.asInstanceOf[js.Any])
    
    inline def setTax_total(value: Money): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
  }
}
