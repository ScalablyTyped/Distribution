package typings
package pDashQueueLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultAddOptions extends QueueAddOptions {
  /**
    Priority of operation. Operations with greater priority will be scheduled first.
    @default 0
    */
  val priority: js.UndefOr[scala.Double] = js.undefined
}

object DefaultAddOptions {
  @scala.inline
  def apply(
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    priority: scala.Int | scala.Double = null
  ): DefaultAddOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAddOptions]
  }
}

