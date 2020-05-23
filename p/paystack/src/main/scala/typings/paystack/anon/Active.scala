package typings.paystack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var amount: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Active {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    amount: js.UndefOr[Double] = js.undefined,
    description: String = null,
    name: String = null
  ): Active = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

