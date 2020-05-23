package typings.mongodbQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  var deadQueue: js.UndefOr[Queue] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var visibility: js.UndefOr[Double] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    deadQueue: Queue = null,
    delay: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    visibility: js.UndefOr[Double] = js.undefined
  ): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (deadQueue != null) __obj.updateDynamic("deadQueue")(deadQueue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

