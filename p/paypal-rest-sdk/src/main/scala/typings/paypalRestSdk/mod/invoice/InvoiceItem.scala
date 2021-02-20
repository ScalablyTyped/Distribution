package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvoiceItem extends StObject {
  
  var date: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var discount: js.UndefOr[Cost] = js.native
  
  var name: String = js.native
  
  var quantity: Double = js.native
  
  var tax: js.UndefOr[Tax] = js.native
  
  var unit_of_measure: js.UndefOr[String] = js.native
  
  var unit_price: Currency = js.native
}
object InvoiceItem {
  
  @scala.inline
  def apply(name: String, quantity: Double, unit_price: Currency): InvoiceItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], unit_price = unit_price.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItem]
  }
  
  @scala.inline
  implicit class InvoiceItemMutableBuilder[Self <: InvoiceItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDiscount(value: Cost): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax(value: Tax): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    @scala.inline
    def setUnit_of_measure(value: String): Self = StObject.set(x, "unit_of_measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit_of_measureUndefined: Self = StObject.set(x, "unit_of_measure", js.undefined)
    
    @scala.inline
    def setUnit_price(value: Currency): Self = StObject.set(x, "unit_price", value.asInstanceOf[js.Any])
  }
}
