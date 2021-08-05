package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueListItemsWithPermissions extends StObject {
  
  val Permissions: IAccessControlLists
  
  val ValueListItems: IValueListItems
}
object IValueListItemsWithPermissions {
  
  inline def apply(Permissions: IAccessControlLists, ValueListItems: IValueListItems): IValueListItemsWithPermissions = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], ValueListItems = ValueListItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueListItemsWithPermissions]
  }
  
  extension [Self <: IValueListItemsWithPermissions](x: Self) {
    
    inline def setPermissions(value: IAccessControlLists): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setValueListItems(value: IValueListItems): Self = StObject.set(x, "ValueListItems", value.asInstanceOf[js.Any])
  }
}
