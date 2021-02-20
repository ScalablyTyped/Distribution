package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValueListItemSearchResultsWithPermissions extends StObject {
  
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
  implicit class IValueListItemSearchResultsWithPermissionsMutableBuilder[Self <: IValueListItemSearchResultsWithPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: IAccessControlLists): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListItemSearchResults(value: IValueListItemSearchResults): Self = StObject.set(x, "ValueListItemSearchResults", value.asInstanceOf[js.Any])
  }
}
