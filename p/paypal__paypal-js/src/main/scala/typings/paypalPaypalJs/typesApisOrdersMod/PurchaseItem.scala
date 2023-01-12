package typings.paypalPaypalJs.typesApisOrdersMod

import typings.paypalPaypalJs.paypalPaypalJsStrings.DIGITAL_GOODS
import typings.paypalPaypalJs.paypalPaypalJsStrings.DONATION
import typings.paypalPaypalJs.paypalPaypalJsStrings.PHYSICAL_GOODS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseItem extends StObject {
  
  var category: js.UndefOr[DIGITAL_GOODS | PHYSICAL_GOODS | DONATION] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var quantity: String
  
  var sku: js.UndefOr[String] = js.undefined
  
  var tax: js.UndefOr[AmountWithCurrencyCodeOptional] = js.undefined
  
  var unit_amount: AmountWithCurrencyCodeOptional
}
object PurchaseItem {
  
  inline def apply(name: String, quantity: String, unit_amount: AmountWithCurrencyCodeOptional): PurchaseItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], unit_amount = unit_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseItem] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: DIGITAL_GOODS | PHYSICAL_GOODS | DONATION): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
    
    inline def setTax(value: AmountWithCurrencyCodeOptional): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    inline def setUnit_amount(value: AmountWithCurrencyCodeOptional): Self = StObject.set(x, "unit_amount", value.asInstanceOf[js.Any])
  }
}
