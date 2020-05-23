package typings.node.dnsMod

import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupAllOptions extends LookupOptions {
  @JSName("all")
  var all_LookupAllOptions: `true`
}

object LookupAllOptions {
  @scala.inline
  def apply(
    all: `true`,
    family: js.UndefOr[Double] = js.undefined,
    hints: js.UndefOr[Double] = js.undefined,
    verbatim: js.UndefOr[Boolean] = js.undefined
  ): LookupAllOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbatim)) __obj.updateDynamic("verbatim")(verbatim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAllOptions]
  }
}

