package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentTerm extends StObject {
  
  var due_date: js.UndefOr[String] = js.undefined
  
  var term_type: js.UndefOr[String] = js.undefined
}
object PaymentTerm {
  
  inline def apply(): PaymentTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentTerm] (val x: Self) extends AnyVal {
    
    inline def setDue_date(value: String): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    inline def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
    
    inline def setTerm_type(value: String): Self = StObject.set(x, "term_type", value.asInstanceOf[js.Any])
    
    inline def setTerm_typeUndefined: Self = StObject.set(x, "term_type", js.undefined)
  }
}
