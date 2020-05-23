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
    family: js.UndefOr[Double] = js.undefined,
    hints: js.UndefOr[Double] = js.undefined,
    verbatim: js.UndefOr[Boolean] = js.undefined
  ): LookupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbatim)) __obj.updateDynamic("verbatim")(verbatim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOptions]
  }
}

