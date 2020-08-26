package typings.officeUiFabricReact.positioningPositioningMod

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElementPosition extends js.Object {
  var alignmentEdge: js.UndefOr[RectangleEdge] = js.native
  var elementRectangle: Rectangle = js.native
  var targetEdge: RectangleEdge = js.native
}

object IElementPosition {
  @scala.inline
  def apply(elementRectangle: Rectangle, targetEdge: RectangleEdge): IElementPosition = {
    val __obj = js.Dynamic.literal(elementRectangle = elementRectangle.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementPosition]
  }
  @scala.inline
  implicit class IElementPositionOps[Self <: IElementPosition] (val x: Self) extends AnyVal {
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
    def setElementRectangle(value: Rectangle): Self = this.set("elementRectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetEdge(value: RectangleEdge): Self = this.set("targetEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlignmentEdge(value: RectangleEdge): Self = this.set("alignmentEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentEdge: Self = this.set("alignmentEdge", js.undefined)
  }
  
}

