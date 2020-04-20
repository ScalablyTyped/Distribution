package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItemSearchResults extends js.Object {
  val Count: Double
  var MoreResults: Boolean
  def Add(Index: Double, ValueListItem: IValueListItem): Unit
  def Clone(): IValueListItemSearchResults
  def Item(Index: Double): IValueListItem
  def Remove(Index: Double): Unit
}

object IValueListItemSearchResults {
  @scala.inline
  def apply(
    Add: (Double, IValueListItem) => Unit,
    Clone: () => IValueListItemSearchResults,
    Count: Double,
    Item: Double => IValueListItem,
    MoreResults: Boolean,
    Remove: Double => Unit
  ): IValueListItemSearchResults = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreResults = MoreResults.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IValueListItemSearchResults]
  }
}

