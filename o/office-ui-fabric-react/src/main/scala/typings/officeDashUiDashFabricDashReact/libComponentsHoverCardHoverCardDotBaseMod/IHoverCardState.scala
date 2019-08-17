package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotBaseMod

import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod.ExpandingCardMode
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod.OpenCardMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHoverCardState extends js.Object {
  var isHoverCardVisible: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[ExpandingCardMode] = js.undefined
  var openMode: js.UndefOr[OpenCardMode] = js.undefined
}

object IHoverCardState {
  @scala.inline
  def apply(
    isHoverCardVisible: js.UndefOr[Boolean] = js.undefined,
    mode: ExpandingCardMode = null,
    openMode: OpenCardMode = null
  ): IHoverCardState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isHoverCardVisible)) __obj.updateDynamic("isHoverCardVisible")(isHoverCardVisible)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (openMode != null) __obj.updateDynamic("openMode")(openMode)
    __obj.asInstanceOf[IHoverCardState]
  }
}

