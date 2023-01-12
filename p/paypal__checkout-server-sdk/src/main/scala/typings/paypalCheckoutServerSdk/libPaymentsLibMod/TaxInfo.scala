package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaxInfo extends StObject {
  
  var tax_id: String
  
  var tax_id_type: TaxIdType
}
object TaxInfo {
  
  inline def apply(tax_id: String, tax_id_type: TaxIdType): TaxInfo = {
    val __obj = js.Dynamic.literal(tax_id = tax_id.asInstanceOf[js.Any], tax_id_type = tax_id_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaxInfo] (val x: Self) extends AnyVal {
    
    inline def setTax_id(value: String): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    inline def setTax_id_type(value: TaxIdType): Self = StObject.set(x, "tax_id_type", value.asInstanceOf[js.Any])
  }
}
