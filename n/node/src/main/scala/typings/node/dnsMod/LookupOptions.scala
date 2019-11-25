package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupOptions extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var hints: js.UndefOr[Double] = js.undefined
  var verbatim: js.UndefOr[Boolean] = js.undefined
}

object LookupOptions {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    family: Int | Double = null,
    hints: Int | Double = null,
    verbatim: js.UndefOr[Boolean] = js.undefined
  ): LookupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(verbatim)) __obj.updateDynamic("verbatim")(verbatim.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOptions]
  }
}

