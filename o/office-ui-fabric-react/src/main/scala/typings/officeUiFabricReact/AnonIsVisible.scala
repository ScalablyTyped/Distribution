package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsVisible extends js.Object {
  /** Is checkbox visible */
  var isVisible: js.UndefOr[Boolean] = js.undefined
}

object AnonIsVisible {
  @scala.inline
  def apply(isVisible: js.UndefOr[Boolean] = js.undefined): AnonIsVisible = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsVisible]
  }
}

