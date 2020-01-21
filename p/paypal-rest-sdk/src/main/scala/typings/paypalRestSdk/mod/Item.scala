package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var currency: String
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var price: String
  var quantity: Double
  var sku: js.UndefOr[String] = js.undefined
  var tax: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    currency: String,
    name: String,
    price: String,
    quantity: Double,
    description: String = null,
    sku: String = null,
    tax: String = null,
    url: String = null
  ): Item = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

