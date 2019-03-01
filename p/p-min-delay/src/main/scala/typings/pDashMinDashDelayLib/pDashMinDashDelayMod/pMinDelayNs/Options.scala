package typings
package pDashMinDashDelayLib.pDashMinDashDelayMod.pMinDelayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var delayRejection: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(delayRejection: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayRejection)) __obj.updateDynamic("delayRejection")(delayRejection)
    __obj.asInstanceOf[Options]
  }
}

