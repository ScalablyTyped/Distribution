package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefundRequest extends StObject {
  
  var amont: Money
  
  var invoice_id: String
  
  var note_to_payer: String
}
object RefundRequest {
  
  inline def apply(amont: Money, invoice_id: String, note_to_payer: String): RefundRequest = {
    val __obj = js.Dynamic.literal(amont = amont.asInstanceOf[js.Any], invoice_id = invoice_id.asInstanceOf[js.Any], note_to_payer = note_to_payer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundRequest]
  }
  
  extension [Self <: RefundRequest](x: Self) {
    
    inline def setAmont(value: Money): Self = StObject.set(x, "amont", value.asInstanceOf[js.Any])
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setNote_to_payer(value: String): Self = StObject.set(x, "note_to_payer", value.asInstanceOf[js.Any])
  }
}
