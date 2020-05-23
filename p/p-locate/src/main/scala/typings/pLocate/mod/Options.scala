package typings.pLocate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Number of concurrently pending promises returned by `tester`. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[Double] = js.undefined
  /**
  		Preserve `input` order when searching.
  		Disable this to improve performance if you don't care about the order.
  		@default true
  		*/
  val preserveOrder: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(concurrency: js.UndefOr[Double] = js.undefined, preserveOrder: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveOrder)) __obj.updateDynamic("preserveOrder")(preserveOrder.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

