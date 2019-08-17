package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutPositionedInfo extends IPositionedData {
  var beakPosition: ICalloutBeakPositionedInfo
}

object ICalloutPositionedInfo {
  @scala.inline
  def apply(
    beakPosition: ICalloutBeakPositionedInfo,
    elementPosition: IPosition,
    targetEdge: RectangleEdge,
    alignmentEdge: RectangleEdge = null
  ): ICalloutPositionedInfo = {
    val __obj = js.Dynamic.literal(beakPosition = beakPosition, elementPosition = elementPosition, targetEdge = targetEdge)
    if (alignmentEdge != null) __obj.updateDynamic("alignmentEdge")(alignmentEdge)
    __obj.asInstanceOf[ICalloutPositionedInfo]
  }
}

