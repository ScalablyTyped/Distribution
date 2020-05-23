package typings.nodeWaves.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object Delay {
  @scala.inline
  def apply(delay: js.UndefOr[Double] = js.undefined, duration: js.UndefOr[Double] = js.undefined): Delay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

