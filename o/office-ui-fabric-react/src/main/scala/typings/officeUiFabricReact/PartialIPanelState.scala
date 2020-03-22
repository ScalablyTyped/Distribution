package typings.officeUiFabricReact

import typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.base.IPanelState> */
trait PartialIPanelState extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var isFooterSticky: js.UndefOr[Boolean] = js.undefined
  var visibility: js.UndefOr[PanelVisibilityState] = js.undefined
}

object PartialIPanelState {
  @scala.inline
  def apply(
    id: String = null,
    isFooterSticky: js.UndefOr[Boolean] = js.undefined,
    visibility: PanelVisibilityState = null
  ): PartialIPanelState = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isFooterSticky)) __obj.updateDynamic("isFooterSticky")(isFooterSticky.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIPanelState]
  }
}

