package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainsFocus extends js.Object {
  var containsFocus: js.UndefOr[Boolean] = js.undefined
}

object AnonContainsFocus {
  @scala.inline
  def apply(containsFocus: js.UndefOr[Boolean] = js.undefined): AnonContainsFocus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containsFocus)) __obj.updateDynamic("containsFocus")(containsFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainsFocus]
  }
}

