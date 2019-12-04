package typings.officeDashUiDashFabricDashReact.libComponentsCalloutExamplesCalloutDotDirectionalDotExampleMod

import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutDirectionalExampleState extends js.Object {
  var beakWidth: js.UndefOr[Double] = js.undefined
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  var gapSpace: js.UndefOr[Double] = js.undefined
  var isBeakVisible: js.UndefOr[Boolean] = js.undefined
  var isCalloutVisible: js.UndefOr[Boolean] = js.undefined
}

object ICalloutDirectionalExampleState {
  @scala.inline
  def apply(
    beakWidth: Int | Double = null,
    directionalHint: DirectionalHint = null,
    gapSpace: Int | Double = null,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    isCalloutVisible: js.UndefOr[Boolean] = js.undefined
  ): ICalloutDirectionalExampleState = {
    val __obj = js.Dynamic.literal()
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isCalloutVisible)) __obj.updateDynamic("isCalloutVisible")(isCalloutVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutDirectionalExampleState]
  }
}

