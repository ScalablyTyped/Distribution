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
    Add: js.Function2[scala.Double, IValueListItem, scala.Unit],
    Clone: js.Function0[IValueListItemSearchResults],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IValueListItem],
    MoreResults: scala.Boolean,
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IValueListItemSearchResults = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, Item = Item, MoreResults = MoreResults, Remove = Remove)
  
    __obj.asInstanceOf[IValueListItemSearchResults]
  }
}

