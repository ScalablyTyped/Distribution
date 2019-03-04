package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItemsWithPermissions extends js.Object {
  val Permissions: IAccessControlLists
  val ValueListItems: IValueListItems
}

object IValueListItemsWithPermissions {
  @scala.inline
  def apply(Permissions: IAccessControlLists, ValueListItems: IValueListItems): IValueListItemsWithPermissions = {
    val __obj = js.Dynamic.literal(Permissions = Permissions, ValueListItems = ValueListItems)
  
    __obj.asInstanceOf[IValueListItemsWithPermissions]
  }
}

