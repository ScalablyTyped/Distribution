package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItemSearchResultsWithPermissions extends js.Object {
  val Permissions: IAccessControlLists
  val ValueListItemSearchResults: IValueListItemSearchResults
}

object IValueListItemSearchResultsWithPermissions {
  @scala.inline
  def apply(Permissions: IAccessControlLists, ValueListItemSearchResults: IValueListItemSearchResults): IValueListItemSearchResultsWithPermissions = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], ValueListItemSearchResults = ValueListItemSearchResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IValueListItemSearchResultsWithPermissions]
  }
}

