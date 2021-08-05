package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueListItemSearchResultsWithPermissions extends StObject {
  
  val Permissions: IAccessControlLists
  
  val ValueListItemSearchResults: IValueListItemSearchResults
}
object IValueListItemSearchResultsWithPermissions {
  
  inline def apply(Permissions: IAccessControlLists, ValueListItemSearchResults: IValueListItemSearchResults): IValueListItemSearchResultsWithPermissions = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], ValueListItemSearchResults = ValueListItemSearchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueListItemSearchResultsWithPermissions]
  }
  
  extension [Self <: IValueListItemSearchResultsWithPermissions](x: Self) {
    
    inline def setPermissions(value: IAccessControlLists): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setValueListItemSearchResults(value: IValueListItemSearchResults): Self = StObject.set(x, "ValueListItemSearchResults", value.asInstanceOf[js.Any])
  }
}
