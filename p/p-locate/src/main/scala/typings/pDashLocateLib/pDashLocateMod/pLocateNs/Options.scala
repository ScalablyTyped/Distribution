package typings
package pDashLocateLib.pDashLocateMod.pLocateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  var preserveOrder: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    concurrency: scala.Int | scala.Double = null,
    preserveOrder: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveOrder)) __obj.updateDynamic("preserveOrder")(preserveOrder)
    __obj.asInstanceOf[Options]
  }
}

