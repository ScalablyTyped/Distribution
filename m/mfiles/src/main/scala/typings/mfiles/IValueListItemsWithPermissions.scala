package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValueListItemsWithPermissions extends js.Object {
  
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
  implicit class IValueListItemsWithPermissionsOps[Self <: IValueListItemsWithPermissions] (val x: Self) extends AnyVal {
    
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
    def setPermissions(value: IAccessControlLists): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListItems(value: IValueListItems): Self = this.set("ValueListItems", value.asInstanceOf[js.Any])
  }
}
