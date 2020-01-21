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
  def apply(concurrency: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

