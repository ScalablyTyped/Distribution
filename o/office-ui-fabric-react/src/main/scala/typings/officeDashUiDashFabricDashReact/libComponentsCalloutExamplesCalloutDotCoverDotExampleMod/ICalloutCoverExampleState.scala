package typings.officeDashUiDashFabricDashReact.libComponentsCalloutExamplesCalloutDotCoverDotExampleMod

import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutCoverExampleState extends js.Object {
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  var isCalloutVisible: js.UndefOr[Boolean] = js.undefined
}

object ICalloutCoverExampleState {
  @scala.inline
  def apply(directionalHint: DirectionalHint = null, isCalloutVisible: js.UndefOr[Boolean] = js.undefined): ICalloutCoverExampleState = {
    val __obj = js.Dynamic.literal()
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(isCalloutVisible)) __obj.updateDynamic("isCalloutVisible")(isCalloutVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutCoverExampleState]
  }
}

