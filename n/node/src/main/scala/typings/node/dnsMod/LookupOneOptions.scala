package typings.node.dnsMod

import typings.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupOneOptions extends LookupOptions {
  @JSName("all")
  var all_LookupOneOptions: js.UndefOr[`false`] = js.undefined
}

object LookupOneOptions {
  @scala.inline
  def apply(
    all: `false` = null,
    family: js.UndefOr[Double] = js.undefined,
    hints: js.UndefOr[Double] = js.undefined,
    verbatim: js.UndefOr[Boolean] = js.undefined
  ): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbatim)) __obj.updateDynamic("verbatim")(verbatim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOneOptions]
  }
}

