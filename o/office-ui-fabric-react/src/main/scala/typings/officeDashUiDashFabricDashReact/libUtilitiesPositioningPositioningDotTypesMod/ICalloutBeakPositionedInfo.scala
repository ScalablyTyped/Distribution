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
    val __obj = js.Dynamic.literal(closestEdge = closestEdge.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    if (alignmentEdge != null) __obj.updateDynamic("alignmentEdge")(alignmentEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutBeakPositionedInfo]
  }
}

