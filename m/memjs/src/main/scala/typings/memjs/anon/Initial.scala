package typings.memjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initial extends js.Object {
  var expires: js.UndefOr[Double] = js.undefined
  var initial: js.UndefOr[Double] = js.undefined
}

object Initial {
  @scala.inline
  def apply(expires: js.UndefOr[Double] = js.undefined, initial: js.UndefOr[Double] = js.undefined): Initial = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial]
  }
}

