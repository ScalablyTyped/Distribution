package typings.officeUiFabricReact.positioningTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositionedData extends js.Object {
  
  /**
    * The finalized alignment edge that the element is aligning too. For instance, RectangleEdge.left means
    * that the left edge of the target should be in line with the left edge of the element being positioned.
    */
  var alignmentEdge: js.UndefOr[RectangleEdge] = js.native
  
  /**
    * The new position of the element.
    */
  var elementPosition: IPosition = js.native
  
  /**
    * The finalized target edge that element is aligning to. For instance RectangleEdge.bottom would mean
    * that the bottom edge of the target is being aligned to by the RectangleEdge.top of the element
    * that is being positioned.
    */
  var targetEdge: RectangleEdge = js.native
}
object IPositionedData {
  
  @scala.inline
  def apply(elementPosition: IPosition, targetEdge: RectangleEdge): IPositionedData = {
    val __obj = js.Dynamic.literal(elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionedData]
  }
  
  @scala.inline
  implicit class IPositionedDataOps[Self <: IPositionedData] (val x: Self) extends AnyVal {
    
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
    def setElementPosition(value: IPosition): Self = this.set("elementPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEdge(value: RectangleEdge): Self = this.set("targetEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentEdge(value: RectangleEdge): Self = this.set("alignmentEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentEdge: Self = this.set("alignmentEdge", js.undefined)
  }
}
