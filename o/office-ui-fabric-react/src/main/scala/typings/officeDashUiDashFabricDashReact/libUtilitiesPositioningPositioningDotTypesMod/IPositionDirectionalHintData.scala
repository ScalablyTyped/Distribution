package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionDirectionalHintData extends js.Object {
  var alignTargetEdge: js.UndefOr[Boolean] = js.undefined
  var alignmentEdge: js.UndefOr[RectangleEdge] = js.undefined
  var isAuto: js.UndefOr[Boolean] = js.undefined
  var targetEdge: RectangleEdge
}

object IPositionDirectionalHintData {
  @scala.inline
  def apply(
    targetEdge: RectangleEdge,
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
    alignmentEdge: RectangleEdge = null,
    isAuto: js.UndefOr[Boolean] = js.undefined
  ): IPositionDirectionalHintData = {
    val __obj = js.Dynamic.literal(targetEdge = targetEdge.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge.asInstanceOf[js.Any])
    if (alignmentEdge != null) __obj.updateDynamic("alignmentEdge")(alignmentEdge.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuto)) __obj.updateDynamic("isAuto")(isAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionDirectionalHintData]
  }
}

