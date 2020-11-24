package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValueListItemSearchResultsWithPermissions extends js.Object {
  
  val Permissions: IAccessControlLists = js.native
  
  val ValueListItemSearchResults: IValueListItemSearchResults = js.native
}
object IValueListItemSearchResultsWithPermissions {
  
  @scala.inline
  def apply(Permissions: IAccessControlLists, ValueListItemSearchResults: IValueListItemSearchResults): IValueListItemSearchResultsWithPermissions = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], ValueListItemSearchResults = ValueListItemSearchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueListItemSearchResultsWithPermissions]
  }
  
  @scala.inline
  implicit class IValueListItemSearchResultsWithPermissionsOps[Self <: IValueListItemSearchResultsWithPermissions] (val x: Self) extends AnyVal {
    
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
    def setValueListItemSearchResults(value: IValueListItemSearchResults): Self = this.set("ValueListItemSearchResults", value.asInstanceOf[js.Any])
  }
}
