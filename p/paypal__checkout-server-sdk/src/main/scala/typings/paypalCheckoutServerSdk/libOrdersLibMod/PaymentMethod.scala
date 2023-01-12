package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethod extends StObject {
  
  var payee_preferred: PayeePreferred
  
  var payer_selected: String
  
  var standard_entry_class_code: StandardEntryClassCode
}
object PaymentMethod {
  
  inline def apply(
    payee_preferred: PayeePreferred,
    payer_selected: String,
    standard_entry_class_code: StandardEntryClassCode
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(payee_preferred = payee_preferred.asInstanceOf[js.Any], payer_selected = payer_selected.asInstanceOf[js.Any], standard_entry_class_code = standard_entry_class_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethod] (val x: Self) extends AnyVal {
    
    inline def setPayee_preferred(value: PayeePreferred): Self = StObject.set(x, "payee_preferred", value.asInstanceOf[js.Any])
    
    inline def setPayer_selected(value: String): Self = StObject.set(x, "payer_selected", value.asInstanceOf[js.Any])
    
    inline def setStandard_entry_class_code(value: StandardEntryClassCode): Self = StObject.set(x, "standard_entry_class_code", value.asInstanceOf[js.Any])
  }
}
