package typings
package pDashQueueLib.distPriorityDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueueOptions
  extends pDashQueueLib.distOptionsMod.QueueAddOptions {
  var priority: js.UndefOr[scala.Double] = js.undefined
}

object PriorityQueueOptions {
  @scala.inline
  def apply(
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    priority: scala.Int | scala.Double = null
  ): PriorityQueueOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityQueueOptions]
  }
}

