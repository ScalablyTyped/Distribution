package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.paymentsLibMod.Payee
import typings.paypalCheckoutServerSdk.paymentsLibMod.PaymentInstruction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseUnit extends StObject {
  
  var amount: AmountWithBreakdown
  
  var custom_id: String
  
  var description: String
  
  var id: String
  
  var invoice_id: String
  
  var items: js.Array[Item]
  
  var payee: Payee
  
  var payment_instruction: PaymentInstruction
  
  var payments: PaymentCollection
  
  var reference_id: String
  
  var shipping: ShippingDetail
  
  var soft_descriptor: String
}
object PurchaseUnit {
  
  inline def apply(
    amount: AmountWithBreakdown,
    custom_id: String,
    description: String,
    id: String,
    invoice_id: String,
    items: js.Array[Item],
    payee: Payee,
    payment_instruction: PaymentInstruction,
    payments: PaymentCollection,
    reference_id: String,
    shipping: ShippingDetail,
    soft_descriptor: String
  ): PurchaseUnit = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], custom_id = custom_id.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_id = invoice_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], payee = payee.asInstanceOf[js.Any], payment_instruction = payment_instruction.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any], reference_id = reference_id.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], soft_descriptor = soft_descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseUnit]
  }
  
  extension [Self <: PurchaseUnit](x: Self) {
    
    inline def setAmount(value: AmountWithBreakdown): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCustom_id(value: String): Self = StObject.set(x, "custom_id", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPayee(value: Payee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayment_instruction(value: PaymentInstruction): Self = StObject.set(x, "payment_instruction", value.asInstanceOf[js.Any])
    
    inline def setPayments(value: PaymentCollection): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setReference_id(value: String): Self = StObject.set(x, "reference_id", value.asInstanceOf[js.Any])
    
    inline def setShipping(value: ShippingDetail): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setSoft_descriptor(value: String): Self = StObject.set(x, "soft_descriptor", value.asInstanceOf[js.Any])
  }
}
