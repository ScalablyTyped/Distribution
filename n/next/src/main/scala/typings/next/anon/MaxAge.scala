package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAge extends js.Object {
  /**
    * Specifies the number (in seconds) for the preview session to last for.
    * The given number will be converted to an integer by rounding down.
    * By default, no maximum age is set and the preview session finishes
    * when the client shuts down (browser is closed).
    */
  var maxAge: js.UndefOr[Double] = js.undefined
}

object MaxAge {
  @scala.inline
  def apply(maxAge: js.UndefOr[Double] = js.undefined): MaxAge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAge]
  }
}

