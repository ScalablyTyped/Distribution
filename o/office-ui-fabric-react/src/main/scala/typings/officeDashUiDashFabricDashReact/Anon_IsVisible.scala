package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsVisible extends js.Object {
  /** Is checkbox visible */
  var isVisible: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsVisible {
  @scala.inline
  def apply(isVisible: js.UndefOr[Boolean] = js.undefined): Anon_IsVisible = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsVisible]
  }
}

