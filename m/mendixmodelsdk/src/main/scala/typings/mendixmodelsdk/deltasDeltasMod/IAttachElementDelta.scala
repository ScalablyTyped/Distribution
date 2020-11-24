package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.ATTACH_ELEMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttachElementDelta
  extends IElementDelta
     with Delta {
  
  var deltaType: ATTACH_ELEMENT = js.native
  
  /**
    * If the indicated new property is listy, `newIndex` is the index where the element-to-move will end up.
    * If not set, the element-to-move will be added at the end.
    */
  var newIndex: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the parent element to attach the element to indicated by `elementId` to.
    */
  var newParentId: String = js.native
  
  /**
    * The name of the property of the new parent element to put the element-to-move in/on.
    */
  var newParentPropertyName: String = js.native
}
object IAttachElementDelta {
  
  @scala.inline
  def apply(
    deltaType: ATTACH_ELEMENT,
    elementId: String,
    newParentId: String,
    newParentPropertyName: String,
    unitId: String
  ): IAttachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], newParentId = newParentId.asInstanceOf[js.Any], newParentPropertyName = newParentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachElementDelta]
  }
  
  @scala.inline
  implicit class IAttachElementDeltaOps[Self <: IAttachElementDelta] (val x: Self) extends AnyVal {
    
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
    def setDeltaType(value: ATTACH_ELEMENT): Self = this.set("deltaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewParentId(value: String): Self = this.set("newParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewParentPropertyName(value: String): Self = this.set("newParentPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewIndex: Self = this.set("newIndex", js.undefined)
  }
}
