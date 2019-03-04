package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var currency: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var price: java.lang.String
  var quantity: scala.Double
  var sku: js.UndefOr[java.lang.String] = js.undefined
  var tax: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    currency: java.lang.String,
    name: java.lang.String,
    price: java.lang.String,
    quantity: scala.Double,
    description: java.lang.String = null,
    sku: java.lang.String = null,
    tax: java.lang.String = null,
    url: java.lang.String = null
  ): Item = {
    val __obj = js.Dynamic.literal(currency = currency, name = name, price = price, quantity = quantity)
    if (description != null) __obj.updateDynamic("description")(description)
    if (sku != null) __obj.updateDynamic("sku")(sku)
    if (tax != null) __obj.updateDynamic("tax")(tax)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Item]
  }
}

