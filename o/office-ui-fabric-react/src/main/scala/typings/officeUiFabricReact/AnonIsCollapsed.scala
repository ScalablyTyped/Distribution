package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsCollapsed extends js.Object {
  /** Whether the footer is collapsed */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
}

object AnonIsCollapsed {
  @scala.inline
  def apply(isCollapsed: js.UndefOr[Boolean] = js.undefined): AnonIsCollapsed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsCollapsed]
  }
}

