package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardSelectionListItem extends StObject {
  
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
  implicit class IMetadataCardSelectionListItemMutableBuilder[Self <: IMetadataCardSelectionListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildItems(value: js.Any): Self = StObject.set(x, "ChildItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasParent(value: Boolean): Self = StObject.set(x, "HasParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentID(value: Double): Self = StObject.set(x, "ParentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "Selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
