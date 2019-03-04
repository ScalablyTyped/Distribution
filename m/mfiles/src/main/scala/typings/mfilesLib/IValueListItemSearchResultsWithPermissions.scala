package typings
package mfilesLib

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
    val __obj = js.Dynamic.literal(Permissions = Permissions, ValueListItemSearchResults = ValueListItemSearchResults)
  
    __obj.asInstanceOf[IValueListItemSearchResultsWithPermissions]
  }
}

