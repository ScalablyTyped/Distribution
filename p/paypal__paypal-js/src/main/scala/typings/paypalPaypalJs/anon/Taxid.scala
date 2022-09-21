package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Taxid extends StObject {
  
  /**
    * The customer's tax ID value
    */
  var tax_id: String
  
  /**
    * The customer's tax ID type
    */
  var tax_id_type: String
}
object Taxid {
  
  inline def apply(tax_id: String, tax_id_type: String): Taxid = {
    val __obj = js.Dynamic.literal(tax_id = tax_id.asInstanceOf[js.Any], tax_id_type = tax_id_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Taxid]
  }
  
  extension [Self <: Taxid](x: Self) {
    
    inline def setTax_id(value: String): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    inline def setTax_id_type(value: String): Self = StObject.set(x, "tax_id_type", value.asInstanceOf[js.Any])
  }
}
