package typings.officeUiFabricReact.positioningTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutPositionedInfo extends IPositionedData {
  var beakPosition: ICalloutBeakPositionedInfo = js.native
}

object ICalloutPositionedInfo {
  @scala.inline
  def apply(beakPosition: ICalloutBeakPositionedInfo, elementPosition: IPosition, targetEdge: RectangleEdge): ICalloutPositionedInfo = {
    val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutPositionedInfo]
  }
  @scala.inline
  implicit class ICalloutPositionedInfoOps[Self <: ICalloutPositionedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeakPosition(value: ICalloutBeakPositionedInfo): Self = this.set("beakPosition", value.asInstanceOf[js.Any])
  }
  
}

