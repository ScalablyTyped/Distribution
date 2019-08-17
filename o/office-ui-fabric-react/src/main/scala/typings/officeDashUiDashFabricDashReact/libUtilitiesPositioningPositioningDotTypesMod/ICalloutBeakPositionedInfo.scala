package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutBeakPositionedInfo extends IPositionedData {
  var closestEdge: RectangleEdge
}

object ICalloutBeakPositionedInfo {
  @scala.inline
  def apply(
    closestEdge: RectangleEdge,
    elementPosition: IPosition,
    targetEdge: RectangleEdge,
    alignmentEdge: RectangleEdge = null
  ): ICalloutBeakPositionedInfo = {
    val __obj = js.Dynamic.literal(closestEdge = closestEdge, elementPosition = elementPosition, targetEdge = targetEdge)
    if (alignmentEdge != null) __obj.updateDynamic("alignmentEdge")(alignmentEdge)
    __obj.asInstanceOf[ICalloutBeakPositionedInfo]
  }
}

