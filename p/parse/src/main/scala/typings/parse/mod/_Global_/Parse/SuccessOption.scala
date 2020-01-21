package typings.parse.mod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessOption extends js.Object {
  var success: js.UndefOr[js.Function] = js.undefined
}

object SuccessOption {
  @scala.inline
  def apply(success: js.Function = null): SuccessOption = {
    val __obj = js.Dynamic.literal()
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessOption]
  }
}

