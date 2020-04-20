package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserAccounts extends js.Object {
  val Count: Double
  def Item(Index: Double): IUserAccount
}

object IUserAccounts {
  @scala.inline
  def apply(Count: Double, Item: Double => IUserAccount): IUserAccounts = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IUserAccounts]
  }
}

