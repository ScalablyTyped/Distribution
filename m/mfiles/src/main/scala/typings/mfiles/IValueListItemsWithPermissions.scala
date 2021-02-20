package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValueListItemsWithPermissions extends StObject {
  
  val Permissions: IAccessControlLists = js.native
  
  val ValueListItems: IValueListItems = js.native
}
object IValueListItemsWithPermissions {
  
  @scala.inline
  def apply(Permissions: IAccessControlLists, ValueListItems: IValueListItems): IValueListItemsWithPermissions = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], ValueListItems = ValueListItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueListItemsWithPermissions]
  }
  
  @scala.inline
  implicit class IValueListItemsWithPermissionsMutableBuilder[Self <: IValueListItemsWithPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: IAccessControlLists): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListItems(value: IValueListItems): Self = StObject.set(x, "ValueListItems", value.asInstanceOf[js.Any])
  }
}
