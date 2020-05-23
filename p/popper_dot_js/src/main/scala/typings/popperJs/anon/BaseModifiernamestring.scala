package typings.popperJs.anon

import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.BaseModifier & {  name  :string} */
trait BaseModifiernamestring extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var name: String
  var order: js.UndefOr[Double] = js.undefined
}

object BaseModifiernamestring {
  @scala.inline
  def apply(
    name: String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => Data = null,
    order: js.UndefOr[Double] = js.undefined
  ): BaseModifiernamestring = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifiernamestring]
  }
}

