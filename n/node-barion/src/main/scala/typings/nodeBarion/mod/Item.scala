package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var Description: String
  
  var ImageUrl: js.UndefOr[String] = js.undefined
  
  var ItemTotal: Double
  
  var Name: String
  
  var Quantity: Double
  
  var SKU: js.UndefOr[String] = js.undefined
  
  var Unit: String
  
  var UnitPrice: Double
}
object Item {
  
  inline def apply(
    Description: String,
    ItemTotal: Double,
    Name: String,
    Quantity: Double,
    Unit: String,
    UnitPrice: Double
  ): Item = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ItemTotal = ItemTotal.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any], UnitPrice = UnitPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
    
    inline def setItemTotal(value: Double): Self = StObject.set(x, "ItemTotal", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setSKU(value: String): Self = StObject.set(x, "SKU", value.asInstanceOf[js.Any])
    
    inline def setSKUUndefined: Self = StObject.set(x, "SKU", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitPrice(value: Double): Self = StObject.set(x, "UnitPrice", value.asInstanceOf[js.Any])
  }
}
