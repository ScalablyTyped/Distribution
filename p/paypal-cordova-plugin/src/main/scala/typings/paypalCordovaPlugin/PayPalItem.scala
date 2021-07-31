package typings.paypalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayPalItem extends StObject {
  
  /**
    * ISO standard currency code.
    */
  var currency: String
  
  /**
    * Name of the item. 127 characters max.
    */
  var name: String
  
  /**
    * Unit price for this item 10 characters max.
    * May be negative for "coupon" etc.
    */
  var price: String
  
  /**
    * Number of units. 10 characters max.
    */
  var quantity: Double
  
  /**
    * The stock keeping unit for this item. 50 characters max (optional).
    */
  var sku: String
}
object PayPalItem {
  
  @scala.inline
  def apply(currency: String, name: String, price: String, quantity: Double, sku: String): PayPalItem = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalItem]
  }
  
  @scala.inline
  implicit class PayPalItemMutableBuilder[Self <: PayPalItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
  }
}
