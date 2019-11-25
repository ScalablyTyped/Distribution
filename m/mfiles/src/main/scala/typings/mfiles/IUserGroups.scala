package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroups extends js.Object {
  val Count: Double
  def Item(Index: Double): IUserGroup
}

object IUserGroups {
  @scala.inline
  def apply(Count: Double, Item: Double => IUserGroup): IUserGroups = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IUserGroups]
  }
}

