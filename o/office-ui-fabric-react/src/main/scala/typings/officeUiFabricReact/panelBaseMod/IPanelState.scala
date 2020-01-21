package typings.officeUiFabricReact.panelBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelState extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var isFooterSticky: js.UndefOr[Boolean] = js.undefined
  var visibility: PanelVisibilityState
}

object IPanelState {
  @scala.inline
  def apply(
    visibility: PanelVisibilityState,
    id: String = null,
    isFooterSticky: js.UndefOr[Boolean] = js.undefined
  ): IPanelState = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isFooterSticky)) __obj.updateDynamic("isFooterSticky")(isFooterSticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelState]
  }
}

