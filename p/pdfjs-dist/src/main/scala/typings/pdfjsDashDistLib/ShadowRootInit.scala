package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowRootInit extends js.Object {
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  var mode: pdfjsDashDistLib.pdfjsDashDistLibStrings.open | pdfjsDashDistLib.pdfjsDashDistLibStrings.closed
}

object ShadowRootInit {
  @scala.inline
  def apply(
    mode: pdfjsDashDistLib.pdfjsDashDistLibStrings.open | pdfjsDashDistLib.pdfjsDashDistLibStrings.closed,
    delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  ): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (!js.isUndefined(delegatesFocus)) __obj.updateDynamic("delegatesFocus")(delegatesFocus)
    __obj.asInstanceOf[ShadowRootInit]
  }
}

