package typings.pQueue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultAddOptions extends QueueAddOptions {
  /**
    Priority of operation. Operations with greater priority will be scheduled first.
    @default 0
    */
  val priority: js.UndefOr[Double] = js.undefined
}

object DefaultAddOptions {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.Any] = null, priority: js.UndefOr[Double] = js.undefined): DefaultAddOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAddOptions]
  }
}

