package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuExamplesContextualMenuDotDirectionalDotExampleMod

import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuDirectionalExampleState extends js.Object {
  var beakWidth: js.UndefOr[Double] = js.undefined
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
  var edgeFixed: js.UndefOr[Boolean] = js.undefined
  var gapSpace: js.UndefOr[Double] = js.undefined
  var isBeakVisible: js.UndefOr[Boolean] = js.undefined
  var useDirectionalHintForRtl: js.UndefOr[Boolean] = js.undefined
}

object IContextualMenuDirectionalExampleState {
  @scala.inline
  def apply(
    beakWidth: Int | Double = null,
    directionalHint: DirectionalHint = null,
    directionalHintForRTL: DirectionalHint = null,
    edgeFixed: js.UndefOr[Boolean] = js.undefined,
    gapSpace: Int | Double = null,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    useDirectionalHintForRtl: js.UndefOr[Boolean] = js.undefined
  ): IContextualMenuDirectionalExampleState = {
    val __obj = js.Dynamic.literal()
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeFixed)) __obj.updateDynamic("edgeFixed")(edgeFixed.asInstanceOf[js.Any])
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(useDirectionalHintForRtl)) __obj.updateDynamic("useDirectionalHintForRtl")(useDirectionalHintForRtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuDirectionalExampleState]
  }
}

