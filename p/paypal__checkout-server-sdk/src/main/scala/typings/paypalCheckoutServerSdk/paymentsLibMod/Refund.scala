package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refund
  extends StObject
     with ActivityTimestamps
     with RefundStatus {
  
  var amount: Money
  
  var id: String
  
  var invoice_id: String
  
  var links: js.Array[LinkDescription]
  
  var note_to_payer: String
  
  var seller_payable_breakdown: SellerPayableBreakdown
}
object Refund {
  
  inline def apply(
    amount: Money,
    create_time: String,
    id: String,
    invoice_id: String,
    links: js.Array[LinkDescription],
    note_to_payer: String,
    seller_payable_breakdown: SellerPayableBreakdown,
    status: Status,
    status_details: RefundStatusDetails,
    update_time: String
  ): Refund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_id = invoice_id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], note_to_payer = note_to_payer.asInstanceOf[js.Any], seller_payable_breakdown = seller_payable_breakdown.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_details = status_details.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refund]
  }
  
  extension [Self <: Refund](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNote_to_payer(value: String): Self = StObject.set(x, "note_to_payer", value.asInstanceOf[js.Any])
    
    inline def setSeller_payable_breakdown(value: SellerPayableBreakdown): Self = StObject.set(x, "seller_payable_breakdown", value.asInstanceOf[js.Any])
  }
}
