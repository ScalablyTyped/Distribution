package typings.officeUiFabricReact.positioningTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalloutBeakPositionedInfo extends IPositionedData {
  
  var closestEdge: RectangleEdge = js.native
}
object ICalloutBeakPositionedInfo {
  
  @scala.inline
  def apply(closestEdge: RectangleEdge, elementPosition: IPosition, targetEdge: RectangleEdge): ICalloutBeakPositionedInfo = {
    val __obj = js.Dynamic.literal(closestEdge = closestEdge.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutBeakPositionedInfo]
  }
  
  @scala.inline
  implicit class ICalloutBeakPositionedInfoOps[Self <: ICalloutBeakPositionedInfo] (val x: Self) extends AnyVal {
    
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
    def setClosestEdge(value: RectangleEdge): Self = this.set("closestEdge", value.asInstanceOf[js.Any])
  }
}
