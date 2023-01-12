package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceItem extends StObject {
  
  var date: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var discount: js.UndefOr[Cost] = js.undefined
  
  var name: String
  
  var quantity: Double
  
  var tax: js.UndefOr[Tax] = js.undefined
  
  var unit_of_measure: js.UndefOr[String] = js.undefined
  
  var unit_price: Currency
}
object InvoiceItem {
  
  inline def apply(name: String, quantity: Double, unit_price: Currency): InvoiceItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], unit_price = unit_price.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvoiceItem] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscount(value: Cost): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setTax(value: Tax): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    inline def setUnit_of_measure(value: String): Self = StObject.set(x, "unit_of_measure", value.asInstanceOf[js.Any])
    
    inline def setUnit_of_measureUndefined: Self = StObject.set(x, "unit_of_measure", js.undefined)
    
    inline def setUnit_price(value: Currency): Self = StObject.set(x, "unit_price", value.asInstanceOf[js.Any])
  }
}
