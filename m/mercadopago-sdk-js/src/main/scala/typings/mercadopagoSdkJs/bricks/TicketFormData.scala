package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TicketFormData extends StObject {
  
  var payer: PayerAPI
  
  var payment_method_id: String
  
  var transaction_amount: Double
}
object TicketFormData {
  
  inline def apply(payer: PayerAPI, payment_method_id: String, transaction_amount: Double): TicketFormData = {
    val __obj = js.Dynamic.literal(payer = payer.asInstanceOf[js.Any], payment_method_id = payment_method_id.asInstanceOf[js.Any], transaction_amount = transaction_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TicketFormData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TicketFormData] (val x: Self) extends AnyVal {
    
    inline def setPayer(value: PayerAPI): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_id(value: String): Self = StObject.set(x, "payment_method_id", value.asInstanceOf[js.Any])
    
    inline def setTransaction_amount(value: Double): Self = StObject.set(x, "transaction_amount", value.asInstanceOf[js.Any])
  }
}
