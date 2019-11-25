package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItems extends js.Object {
  val Count: Double
  def Item(Index: Double): IValueListItem
}

object IValueListItems {
  @scala.inline
  def apply(Count: Double, Item: Double => IValueListItem): IValueListItems = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IValueListItems]
  }
}

