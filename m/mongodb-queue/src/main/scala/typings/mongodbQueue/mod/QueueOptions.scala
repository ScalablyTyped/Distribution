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
    delay: Int | Double = null,
    maxRetries: Int | Double = null,
    visibility: Int | Double = null
  ): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (deadQueue != null) __obj.updateDynamic("deadQueue")(deadQueue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

