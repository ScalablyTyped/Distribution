package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.paymentsLibMod.Payee
import typings.paypalCheckoutServerSdk.paymentsLibMod.PaymentInstruction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseUnitRequest extends StObject {
  
  var amount: AmountWithBreakdown
  
  var custom_id: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var invoice_id: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var payee: js.UndefOr[Payee] = js.undefined
  
  var payment_instruction: js.UndefOr[PaymentInstruction] = js.undefined
  
  var reference_id: js.UndefOr[String] = js.undefined
  
  var shipping: js.UndefOr[ShippingDetail] = js.undefined
  
  var soft_descriptor: js.UndefOr[String] = js.undefined
}
object PurchaseUnitRequest {
  
  inline def apply(amount: AmountWithBreakdown): PurchaseUnitRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseUnitRequest]
  }
  
  extension [Self <: PurchaseUnitRequest](x: Self) {
    
    inline def setAmount(value: AmountWithBreakdown): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCustom_id(value: String): Self = StObject.set(x, "custom_id", value.asInstanceOf[js.Any])
    
    inline def setCustom_idUndefined: Self = StObject.set(x, "custom_id", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_idUndefined: Self = StObject.set(x, "invoice_id", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPayee(value: Payee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPayment_instruction(value: PaymentInstruction): Self = StObject.set(x, "payment_instruction", value.asInstanceOf[js.Any])
    
    inline def setPayment_instructionUndefined: Self = StObject.set(x, "payment_instruction", js.undefined)
    
    inline def setReference_id(value: String): Self = StObject.set(x, "reference_id", value.asInstanceOf[js.Any])
    
    inline def setReference_idUndefined: Self = StObject.set(x, "reference_id", js.undefined)
    
    inline def setShipping(value: ShippingDetail): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setSoft_descriptor(value: String): Self = StObject.set(x, "soft_descriptor", value.asInstanceOf[js.Any])
    
    inline def setSoft_descriptorUndefined: Self = StObject.set(x, "soft_descriptor", js.undefined)
  }
}
