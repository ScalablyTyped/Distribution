package typings.officeUiFabricReact

import typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.base.IPanelState> */
trait ReadonlyIPanelState extends js.Object {
  val id: js.UndefOr[String] = js.undefined
  val isFooterSticky: js.UndefOr[Boolean] = js.undefined
  val visibility: PanelVisibilityState
}

object ReadonlyIPanelState {
  @scala.inline
  def apply(
    visibility: PanelVisibilityState,
    id: String = null,
    isFooterSticky: js.UndefOr[Boolean] = js.undefined
  ): ReadonlyIPanelState = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isFooterSticky)) __obj.updateDynamic("isFooterSticky")(isFooterSticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIPanelState]
  }
}

