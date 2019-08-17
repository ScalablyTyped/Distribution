package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

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
    val __obj = js.Dynamic.literal(currency = currency, name = name, price = price, quantity = quantity)
    if (description != null) __obj.updateDynamic("description")(description)
    if (sku != null) __obj.updateDynamic("sku")(sku)
    if (tax != null) __obj.updateDynamic("tax")(tax)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Item]
  }
}

