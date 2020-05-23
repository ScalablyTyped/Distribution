package typings.memjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success extends js.Object {
  var success: Boolean
  var value: js.UndefOr[Double | Null] = js.undefined
}

object Success {
  @scala.inline
  def apply(success: Boolean, value: js.UndefOr[Null | Double] = js.undefined): Success = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
}

