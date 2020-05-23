package typings.pAll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Number of concurrent pending promises. Minimum: `1`.
  		@default Infinity
  		*/
  var concurrency: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(concurrency: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

