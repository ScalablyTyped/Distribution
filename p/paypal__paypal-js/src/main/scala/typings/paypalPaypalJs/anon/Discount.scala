package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discount extends StObject {
  
  var discount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  var handling: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  var insurance: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  var item_total: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  var shipping: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  var shipping_discount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  var tax_total: js.UndefOr[AmountWithCurrencyCode] = js.undefined
}
object Discount {
  
  inline def apply(): Discount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discount]
  }
  
  extension [Self <: Discount](x: Self) {
    
    inline def setDiscount(value: AmountWithCurrencyCode): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setHandling(value: AmountWithCurrencyCode): Self = StObject.set(x, "handling", value.asInstanceOf[js.Any])
    
    inline def setHandlingUndefined: Self = StObject.set(x, "handling", js.undefined)
    
    inline def setInsurance(value: AmountWithCurrencyCode): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setItem_total(value: AmountWithCurrencyCode): Self = StObject.set(x, "item_total", value.asInstanceOf[js.Any])
    
    inline def setItem_totalUndefined: Self = StObject.set(x, "item_total", js.undefined)
    
    inline def setShipping(value: AmountWithCurrencyCode): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setShipping_discount(value: AmountWithCurrencyCode): Self = StObject.set(x, "shipping_discount", value.asInstanceOf[js.Any])
    
    inline def setShipping_discountUndefined: Self = StObject.set(x, "shipping_discount", js.undefined)
    
    inline def setTax_total(value: AmountWithCurrencyCode): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTax_totalUndefined: Self = StObject.set(x, "tax_total", js.undefined)
  }
}
