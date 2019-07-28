package typings.mockDashRaf.mockDashRafMod

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
  def apply(count: Int | Double = null, time: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

