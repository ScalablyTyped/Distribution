package typings.pDashQueue.distPriorityDashQueueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pDashQueue.distOptionsMod.QueueAddOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueueOptions extends QueueAddOptions {
  var priority: js.UndefOr[Double] = js.undefined
}

object PriorityQueueOptions {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.Any] = null, priority: Int | Double = null): PriorityQueueOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityQueueOptions]
  }
}

