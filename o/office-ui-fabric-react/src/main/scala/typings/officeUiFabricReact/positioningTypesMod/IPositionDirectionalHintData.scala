package typings.officeUiFabricReact.positioningTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositionDirectionalHintData extends js.Object {
  
  var alignTargetEdge: js.UndefOr[Boolean] = js.native
  
  var alignmentEdge: js.UndefOr[RectangleEdge] = js.native
  
  var isAuto: js.UndefOr[Boolean] = js.native
  
  var targetEdge: RectangleEdge = js.native
}
object IPositionDirectionalHintData {
  
  @scala.inline
  def apply(targetEdge: RectangleEdge): IPositionDirectionalHintData = {
    val __obj = js.Dynamic.literal(targetEdge = targetEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionDirectionalHintData]
  }
  
  @scala.inline
  implicit class IPositionDirectionalHintDataOps[Self <: IPositionDirectionalHintData] (val x: Self) extends AnyVal {
    
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
    def setTargetEdge(value: RectangleEdge): Self = this.set("targetEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignTargetEdge(value: Boolean): Self = this.set("alignTargetEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignTargetEdge: Self = this.set("alignTargetEdge", js.undefined)
    
    @scala.inline
    def setAlignmentEdge(value: RectangleEdge): Self = this.set("alignmentEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentEdge: Self = this.set("alignmentEdge", js.undefined)
    
    @scala.inline
    def setIsAuto(value: Boolean): Self = this.set("isAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAuto: Self = this.set("isAuto", js.undefined)
  }
}
