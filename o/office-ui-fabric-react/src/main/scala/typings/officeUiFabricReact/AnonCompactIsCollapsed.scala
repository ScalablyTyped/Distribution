package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompactIsCollapsed extends js.Object {
  /** Whether the group is in compact mode or not */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** whether or not the group is collapsed */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
}

object AnonCompactIsCollapsed {
  @scala.inline
  def apply(compact: js.UndefOr[Boolean] = js.undefined, isCollapsed: js.UndefOr[Boolean] = js.undefined): AnonCompactIsCollapsed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompactIsCollapsed]
  }
}

