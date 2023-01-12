package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupplementaryPurchaseData extends StObject {
  
  var invoice_id: String
  
  var note_to_payer: String
}
object SupplementaryPurchaseData {
  
  inline def apply(invoice_id: String, note_to_payer: String): SupplementaryPurchaseData = {
    val __obj = js.Dynamic.literal(invoice_id = invoice_id.asInstanceOf[js.Any], note_to_payer = note_to_payer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplementaryPurchaseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupplementaryPurchaseData] (val x: Self) extends AnyVal {
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setNote_to_payer(value: String): Self = StObject.set(x, "note_to_payer", value.asInstanceOf[js.Any])
  }
}
