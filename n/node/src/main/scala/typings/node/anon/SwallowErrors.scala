package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwallowErrors extends js.Object {
  var swallowErrors: js.UndefOr[Boolean] = js.undefined
}

object SwallowErrors {
  @scala.inline
  def apply(swallowErrors: js.UndefOr[Boolean] = js.undefined): SwallowErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(swallowErrors)) __obj.updateDynamic("swallowErrors")(swallowErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwallowErrors]
  }
}

