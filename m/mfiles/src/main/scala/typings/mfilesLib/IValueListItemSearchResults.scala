package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItemSearchResults extends js.Object {
  val Count: scala.Double
  var MoreResults: scala.Boolean
  def Add(Index: scala.Double, ValueListItem: IValueListItem): scala.Unit
  def Clone(): IValueListItemSearchResults
  def Item(Index: scala.Double): IValueListItem
  def Remove(Index: scala.Double): scala.Unit
}

object IValueListItemSearchResults {
  @scala.inline
  def apply(
    Add: (scala.Double, IValueListItem) => scala.Unit,
    Clone: () => IValueListItemSearchResults,
    Count: scala.Double,
    Item: scala.Double => IValueListItem,
    MoreResults: scala.Boolean,
    Remove: scala.Double => scala.Unit
  ): IValueListItemSearchResults = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), MoreResults = MoreResults, Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IValueListItemSearchResults]
  }
}

