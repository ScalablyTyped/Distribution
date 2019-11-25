package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCollapsed extends js.Object {
  /** Whether the footer is collapsed */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsCollapsed {
  @scala.inline
  def apply(isCollapsed: js.UndefOr[Boolean] = js.undefined): Anon_IsCollapsed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsCollapsed]
  }
}

