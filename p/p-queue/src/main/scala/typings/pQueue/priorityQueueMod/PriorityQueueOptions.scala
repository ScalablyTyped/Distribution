package typings.pQueue.priorityQueueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pQueue.optionsMod.QueueAddOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueueOptions extends QueueAddOptions {
  var priority: js.UndefOr[Double] = js.undefined
}

object PriorityQueueOptions {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.Any] = null, priority: js.UndefOr[Double] = js.undefined): PriorityQueueOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityQueueOptions]
  }
}

