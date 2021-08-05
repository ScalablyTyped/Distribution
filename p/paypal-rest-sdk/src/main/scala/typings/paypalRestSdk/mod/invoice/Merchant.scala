package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merchant
  extends StObject
     with Person {
  
  var additional_info: js.UndefOr[String] = js.undefined
  
  var additional_info_label: js.UndefOr[String] = js.undefined
  
  var fax: js.UndefOr[Phone] = js.undefined
  
  var tax_id: js.UndefOr[String] = js.undefined
}
object Merchant {
  
  inline def apply(): Merchant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Merchant]
  }
  
  extension [Self <: Merchant](x: Self) {
    
    inline def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
    
    inline def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
    
    inline def setAdditional_info_label(value: String): Self = StObject.set(x, "additional_info_label", value.asInstanceOf[js.Any])
    
    inline def setAdditional_info_labelUndefined: Self = StObject.set(x, "additional_info_label", js.undefined)
    
    inline def setFax(value: Phone): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    inline def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    inline def setTax_id(value: String): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    inline def setTax_idUndefined: Self = StObject.set(x, "tax_id", js.undefined)
  }
}
