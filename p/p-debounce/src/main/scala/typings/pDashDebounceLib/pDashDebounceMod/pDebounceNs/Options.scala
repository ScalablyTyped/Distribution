package typings
package pDashDebounceLib.pDashDebounceMod.pDebounceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var leading: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(leading: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    __obj.asInstanceOf[Options]
  }
}

