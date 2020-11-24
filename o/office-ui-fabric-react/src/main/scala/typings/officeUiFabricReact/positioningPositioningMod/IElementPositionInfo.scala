package typings.officeUiFabricReact.positioningPositioningMod

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.officeUiFabricReact.utilitiesMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementPositionInfo extends IElementPosition {
  
  var targetRectangle: Rectangle = js.native
}
object IElementPositionInfo {
  
  @scala.inline
  def apply(elementRectangle: Rectangle, targetEdge: RectangleEdge, targetRectangle: Rectangle): IElementPositionInfo = {
    val __obj = js.Dynamic.literal(elementRectangle = elementRectangle.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any], targetRectangle = targetRectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementPositionInfo]
  }
  
  @scala.inline
  implicit class IElementPositionInfoOps[Self <: IElementPositionInfo] (val x: Self) extends AnyVal {
    
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
    def setTargetRectangle(value: Rectangle): Self = this.set("targetRectangle", value.asInstanceOf[js.Any])
  }
}
