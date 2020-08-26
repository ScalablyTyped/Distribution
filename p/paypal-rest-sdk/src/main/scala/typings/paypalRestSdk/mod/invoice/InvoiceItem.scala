package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvoiceItem extends js.Object {
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
  implicit class InvoiceItemOps[Self <: InvoiceItem] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit_price(value: Currency): Self = this.set("unit_price", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDiscount(value: Cost): Self = this.set("discount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscount: Self = this.set("discount", js.undefined)
    @scala.inline
    def setTax(value: Tax): Self = this.set("tax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
    @scala.inline
    def setUnit_of_measure(value: String): Self = this.set("unit_of_measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit_of_measure: Self = this.set("unit_of_measure", js.undefined)
  }
  
}

