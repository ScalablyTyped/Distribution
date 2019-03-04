package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginAccounts extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): ILoginAccount
}

object ILoginAccounts {
  @scala.inline
  def apply(Count: scala.Double, Item: js.Function1[scala.Double, ILoginAccount]): ILoginAccounts = {
    val __obj = js.Dynamic.literal(Count = Count, Item = Item)
  
    __obj.asInstanceOf[ILoginAccounts]
  }
}

