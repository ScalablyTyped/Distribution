package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSwallowErrors extends js.Object {
  var swallowErrors: js.UndefOr[Boolean] = js.undefined
}

object AnonSwallowErrors {
  @scala.inline
  def apply(swallowErrors: js.UndefOr[Boolean] = js.undefined): AnonSwallowErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(swallowErrors)) __obj.updateDynamic("swallowErrors")(swallowErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSwallowErrors]
  }
}

