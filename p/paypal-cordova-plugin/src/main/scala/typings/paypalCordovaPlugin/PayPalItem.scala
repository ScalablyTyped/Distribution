package typings.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalItem extends js.Object {
  /**
    * ISO standard currency code.
    */
  var currency: String = js.native
  /**
    * Name of the item. 127 characters max.
    */
  var name: String = js.native
  /**
    * Unit price for this item 10 characters max.
    * May be negative for "coupon" etc.
    */
  var price: String = js.native
  /**
    * Number of units. 10 characters max.
    */
  var quantity: Double = js.native
  /**
    * The stock keeping unit for this item. 50 characters max (optional).
    */
  var sku: String = js.native
}

object PayPalItem {
  @scala.inline
  def apply(currency: String, name: String, price: String, quantity: Double, sku: String): PayPalItem = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalItem]
  }
  @scala.inline
  implicit class PayPalItemOps[Self <: PayPalItem] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
  }
  
}

