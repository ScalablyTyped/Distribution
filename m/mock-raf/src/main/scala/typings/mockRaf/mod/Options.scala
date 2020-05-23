package typings.mockRaf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The number of steps to take. */
  var count: js.UndefOr[Double] = js.undefined
  /** The time that should pass during each requestAnimationFrame step in milliseconds. Default is roughly equivalent to default browser behavior. */
  var time: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, time: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

