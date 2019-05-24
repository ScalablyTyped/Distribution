package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultAddOptions extends js.Object {
  /**
  		Priority of operation. Operations with greater priority will be scheduled first.
  		@default 0
  		*/
  var priority: js.UndefOr[scala.Double] = js.undefined
}

object DefaultAddOptions {
  @scala.inline
  def apply(priority: scala.Int | scala.Double = null): DefaultAddOptions = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAddOptions]
  }
}

