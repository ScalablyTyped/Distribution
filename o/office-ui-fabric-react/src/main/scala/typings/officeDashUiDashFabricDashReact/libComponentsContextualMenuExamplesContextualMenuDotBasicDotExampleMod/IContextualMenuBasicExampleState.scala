package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuExamplesContextualMenuDotBasicDotExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuBasicExampleState extends js.Object {
  var showContextualMenu: js.UndefOr[Boolean] = js.undefined
}

object IContextualMenuBasicExampleState {
  @scala.inline
  def apply(showContextualMenu: js.UndefOr[Boolean] = js.undefined): IContextualMenuBasicExampleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showContextualMenu)) __obj.updateDynamic("showContextualMenu")(showContextualMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuBasicExampleState]
  }
}

