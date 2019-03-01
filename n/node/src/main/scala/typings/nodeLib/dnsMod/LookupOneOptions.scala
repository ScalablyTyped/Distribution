package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupOneOptions extends LookupOptions {
  @JSName("all")
  var all_LookupOneOptions: js.UndefOr[nodeLib.nodeLibNumbers.`false`] = js.undefined
}

object LookupOneOptions {
  @scala.inline
  def apply(
    all: nodeLib.nodeLibNumbers.`false` = null,
    family: scala.Int | scala.Double = null,
    hints: scala.Int | scala.Double = null,
    verbatim: js.UndefOr[scala.Boolean] = js.undefined
  ): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(verbatim)) __obj.updateDynamic("verbatim")(verbatim)
    __obj.asInstanceOf[LookupOneOptions]
  }
}

