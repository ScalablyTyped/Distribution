package typings.pWaitFor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Number of milliseconds to wait before retrying `condition`.
  		@default 20
  		*/
  val interval: js.UndefOr[Double] = js.undefined
  /**
  		Number of milliseconds to wait before automatically rejecting.
  		@default Infinity
  		*/
  val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(interval: Int | Double = null, timeout: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

