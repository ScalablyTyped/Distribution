package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: js.UndefOr[js.Any] = js.undefined
}

object AnonParams {
  @scala.inline
  def apply(params: js.Any = null): AnonParams = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams]
  }
}

