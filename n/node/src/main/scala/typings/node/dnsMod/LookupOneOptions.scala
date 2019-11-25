package typings.node.dnsMod

import typings.node.nodeNumbers.`false`
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
    family: Int | Double = null,
    hints: Int | Double = null,
    verbatim: js.UndefOr[Boolean] = js.undefined
  ): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(verbatim)) __obj.updateDynamic("verbatim")(verbatim.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOneOptions]
  }
}

