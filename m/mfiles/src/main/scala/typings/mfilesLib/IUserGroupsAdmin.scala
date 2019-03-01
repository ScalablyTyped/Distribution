package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroupsAdmin extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IUserGroupAdmin
}

object IUserGroupsAdmin {
  @scala.inline
  def apply(Count: scala.Double, Item: js.Function1[scala.Double, IUserGroupAdmin]): IUserGroupsAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IUserGroupsAdmin]
  }
}

