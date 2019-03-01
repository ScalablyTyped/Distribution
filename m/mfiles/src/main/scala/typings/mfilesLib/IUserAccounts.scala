package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserAccounts extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IUserAccount
}

object IUserAccounts {
  @scala.inline
  def apply(Count: scala.Double, Item: js.Function1[scala.Double, IUserAccount]): IUserAccounts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IUserAccounts]
  }
}

