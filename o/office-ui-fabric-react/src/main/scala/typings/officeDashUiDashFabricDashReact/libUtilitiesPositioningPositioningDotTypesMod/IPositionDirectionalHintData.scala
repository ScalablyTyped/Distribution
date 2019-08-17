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
    val __obj = js.Dynamic.literal(targetEdge = targetEdge)
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge)
    if (alignmentEdge != null) __obj.updateDynamic("alignmentEdge")(alignmentEdge)
    if (!js.isUndefined(isAuto)) __obj.updateDynamic("isAuto")(isAuto)
    __obj.asInstanceOf[IPositionDirectionalHintData]
  }
}

