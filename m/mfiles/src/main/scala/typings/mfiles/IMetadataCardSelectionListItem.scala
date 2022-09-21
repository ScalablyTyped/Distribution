package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardSelectionListItem extends StObject {
  
  val ChildItems: Any
  
  val HasParent: Boolean
  
  val ParentID: Double
  
  val Selectable: Boolean
  
  val Value: Any
}
object IMetadataCardSelectionListItem {
  
  inline def apply(ChildItems: Any, HasParent: Boolean, ParentID: Double, Selectable: Boolean, Value: Any): IMetadataCardSelectionListItem = {
    val __obj = js.Dynamic.literal(ChildItems = ChildItems.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ParentID = ParentID.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardSelectionListItem]
  }
  
  extension [Self <: IMetadataCardSelectionListItem](x: Self) {
    
    inline def setChildItems(value: Any): Self = StObject.set(x, "ChildItems", value.asInstanceOf[js.Any])
    
    inline def setHasParent(value: Boolean): Self = StObject.set(x, "HasParent", value.asInstanceOf[js.Any])
    
    inline def setParentID(value: Double): Self = StObject.set(x, "ParentID", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "Selectable", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
