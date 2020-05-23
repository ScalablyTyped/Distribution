package typings.officeUiFabricReact.hoverCardBaseMod

import typings.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode
import typings.officeUiFabricReact.hoverCardTypesMod.OpenCardMode
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
    if (!js.isUndefined(isHoverCardVisible)) __obj.updateDynamic("isHoverCardVisible")(isHoverCardVisible.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (openMode != null) __obj.updateDynamic("openMode")(openMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoverCardState]
  }
}

