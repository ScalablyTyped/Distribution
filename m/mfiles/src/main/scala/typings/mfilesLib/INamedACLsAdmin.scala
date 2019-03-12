package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedACLsAdmin extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): INamedACLAdmin
}

object INamedACLsAdmin {
  @scala.inline
  def apply(Count: scala.Double, Item: scala.Double => INamedACLAdmin): INamedACLsAdmin = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[INamedACLsAdmin]
  }
}

