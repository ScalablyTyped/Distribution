package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feeamount extends StObject {
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var fee_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var gross_amount: AmountWithCurrencyCode
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var net_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var shipping_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var tax_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var total_item_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
}
object Feeamount {
  
  inline def apply(gross_amount: AmountWithCurrencyCode): Feeamount = {
    val __obj = js.Dynamic.literal(gross_amount = gross_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feeamount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Feeamount] (val x: Self) extends AnyVal {
    
    inline def setFee_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "fee_amount", value.asInstanceOf[js.Any])
    
    inline def setFee_amountUndefined: Self = StObject.set(x, "fee_amount", js.undefined)
    
    inline def setGross_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "gross_amount", value.asInstanceOf[js.Any])
    
    inline def setNet_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "net_amount", value.asInstanceOf[js.Any])
    
    inline def setNet_amountUndefined: Self = StObject.set(x, "net_amount", js.undefined)
    
    inline def setShipping_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "shipping_amount", value.asInstanceOf[js.Any])
    
    inline def setShipping_amountUndefined: Self = StObject.set(x, "shipping_amount", js.undefined)
    
    inline def setTax_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "tax_amount", value.asInstanceOf[js.Any])
    
    inline def setTax_amountUndefined: Self = StObject.set(x, "tax_amount", js.undefined)
    
    inline def setTotal_item_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "total_item_amount", value.asInstanceOf[js.Any])
    
    inline def setTotal_item_amountUndefined: Self = StObject.set(x, "total_item_amount", js.undefined)
  }
}
