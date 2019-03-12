package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItems extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IValueListItem
}

object IValueListItems {
  @scala.inline
  def apply(Count: scala.Double, Item: scala.Double => IValueListItem): IValueListItems = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IValueListItems]
  }
}

