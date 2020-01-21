package typings.nodeForge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetached extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
}

object AnonDetached {
  @scala.inline
  def apply(detached: js.UndefOr[Boolean] = js.undefined): AnonDetached = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetached]
  }
}

