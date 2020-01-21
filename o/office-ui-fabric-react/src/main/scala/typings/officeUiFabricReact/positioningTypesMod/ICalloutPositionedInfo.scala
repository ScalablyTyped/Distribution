package typings.officeUiFabricReact.positioningTypesMod

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
    val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    if (alignmentEdge != null) __obj.updateDynamic("alignmentEdge")(alignmentEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutPositionedInfo]
  }
}

