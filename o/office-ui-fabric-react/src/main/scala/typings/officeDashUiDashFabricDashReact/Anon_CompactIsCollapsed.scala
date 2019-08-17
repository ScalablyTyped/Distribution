package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompactIsCollapsed extends js.Object {
  /** Whether the group is in compact mode or not */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** whether or not the group is collapsed */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
}

object Anon_CompactIsCollapsed {
  @scala.inline
  def apply(compact: js.UndefOr[Boolean] = js.undefined, isCollapsed: js.UndefOr[Boolean] = js.undefined): Anon_CompactIsCollapsed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed)
    __obj.asInstanceOf[Anon_CompactIsCollapsed]
  }
}

