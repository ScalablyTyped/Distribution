package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginAccounts extends js.Object {
  val Count: Double
  def Item(Index: Double): ILoginAccount
}

object ILoginAccounts {
  @scala.inline
  def apply(Count: Double, Item: Double => ILoginAccount): ILoginAccounts = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[ILoginAccounts]
  }
}

