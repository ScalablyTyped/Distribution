package typings.officeDashUiDashFabricDashReact.libComponentsCalloutExamplesCalloutDotStatusDotExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusCalloutExampleState extends js.Object {
  var isCalloutVisible: js.UndefOr[Boolean] = js.undefined
}

object IStatusCalloutExampleState {
  @scala.inline
  def apply(isCalloutVisible: js.UndefOr[Boolean] = js.undefined): IStatusCalloutExampleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCalloutVisible)) __obj.updateDynamic("isCalloutVisible")(isCalloutVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatusCalloutExampleState]
  }
}

