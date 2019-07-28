package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
}

object Anon_Interval {
  @scala.inline
  def apply(interval: Int | Double = null, persistent: js.UndefOr[Boolean] = js.undefined): Anon_Interval = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    __obj.asInstanceOf[Anon_Interval]
  }
}

