package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardSelectionListItem extends js.Object {
  
  val ChildItems: js.Any = js.native
  
  val HasParent: Boolean = js.native
  
  val ParentID: Double = js.native
  
  val Selectable: Boolean = js.native
  
  val Value: js.Any = js.native
}
object IMetadataCardSelectionListItem {
  
  @scala.inline
  def apply(ChildItems: js.Any, HasParent: Boolean, ParentID: Double, Selectable: Boolean, Value: js.Any): IMetadataCardSelectionListItem = {
    val __obj = js.Dynamic.literal(ChildItems = ChildItems.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ParentID = ParentID.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardSelectionListItem]
  }
  
  @scala.inline
  implicit class IMetadataCardSelectionListItemOps[Self <: IMetadataCardSelectionListItem] (val x: Self) extends AnyVal {
    
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
    def setChildItems(value: js.Any): Self = this.set("ChildItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasParent(value: Boolean): Self = this.set("HasParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentID(value: Double): Self = this.set("ParentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("Selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
