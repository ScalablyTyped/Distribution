package typings.paypalCheckoutComponents.callbackDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItem extends js.Object {
  
  /**
    * Item description. Maximum 127 characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the line item is a debit (sale) or credit (refund) to the customer. Accepted values: `debit` and `credit`.
    */
  var kind: LineItemKind = js.native
  
  /**
    * Item name. Maximum 127 characters.
    */
  var name: String = js.native
  
  /**
    * Product or UPC code for the item. Maximum 127 characters.
    */
  var productCode: js.UndefOr[String] = js.native
  
  /**
    * Number of units of the item purchased. This value must be a whole number and can't be negative or zero.
    */
  var quantity: String = js.native
  
  /**
    * Per-unit price of the item. Can include up to 2 decimal places. This value can't be negative or zero.
    */
  var unitAmount: String = js.native
  
  /**
    * Per-unit tax price of the item. Can include up to 2 decimal places. This value can't be negative or zero.
    */
  var unitTaxAmount: js.UndefOr[String] = js.native
  
  /**
    * The URL to product information.
    */
  var url: js.UndefOr[String] = js.native
}
object LineItem {
  
  @scala.inline
  def apply(kind: LineItemKind, name: String, quantity: String, unitAmount: String): LineItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], unitAmount = unitAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItem]
  }
  
  @scala.inline
  implicit class LineItemOps[Self <: LineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: LineItemKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: String): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitAmount(value: String): Self = this.set("unitAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setProductCode(value: String): Self = this.set("productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCode: Self = this.set("productCode", js.undefined)
    
    @scala.inline
    def setUnitTaxAmount(value: String): Self = this.set("unitTaxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitTaxAmount: Self = this.set("unitTaxAmount", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
