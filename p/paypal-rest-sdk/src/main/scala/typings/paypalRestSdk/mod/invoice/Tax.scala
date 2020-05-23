package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tax extends Cost {
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Tax {
  @scala.inline
  def apply(
    amount: Currency = null,
    id: String = null,
    name: String = null,
    percent: js.UndefOr[Double] = js.undefined
  ): Tax = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tax]
  }
}

