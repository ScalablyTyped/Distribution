package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItem extends js.Object {
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
  @scala.inline
  def apply(
    name: String,
    quantity: Double,
    unit_price: Currency,
    date: String = null,
    description: String = null,
    discount: Cost = null,
    tax: Tax = null,
    unit_of_measure: String = null
  ): InvoiceItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], unit_price = unit_price.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (discount != null) __obj.updateDynamic("discount")(discount.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (unit_of_measure != null) __obj.updateDynamic("unit_of_measure")(unit_of_measure.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItem]
  }
}

