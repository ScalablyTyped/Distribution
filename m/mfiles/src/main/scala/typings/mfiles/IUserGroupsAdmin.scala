package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroupsAdmin extends js.Object {
  val Count: Double
  def Item(Index: Double): IUserGroupAdmin
}

object IUserGroupsAdmin {
  @scala.inline
  def apply(Count: Double, Item: Double => IUserGroupAdmin): IUserGroupsAdmin = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IUserGroupsAdmin]
  }
}

