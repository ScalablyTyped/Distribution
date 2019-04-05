package typings
package pDashLocateLib.pDashLocateMod.pLocateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Number of concurrently pending promises returned by `tester`. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[scala.Double] = js.undefined
  /**
  		Preserve `input` order when searching.
  		Disable this to improve performance if you don't care about the order.
  		@default true
  		*/
  val preserveOrder: js.UndefOr[scala.Boolean] = js.undefined
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

