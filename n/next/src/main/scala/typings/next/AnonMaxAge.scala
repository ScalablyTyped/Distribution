package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxAge extends js.Object {
  /**
    * Specifies the number (in seconds) for the preview session to last for.
    * The given number will be converted to an integer by rounding down.
    * By default, no maximum age is set and the preview session finishes
    * when the client shuts down (browser is closed).
    */
  var maxAge: js.UndefOr[Double] = js.undefined
}

object AnonMaxAge {
  @scala.inline
  def apply(maxAge: Int | Double = null): AnonMaxAge = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxAge]
  }
}

