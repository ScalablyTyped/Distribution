package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValueListItemSearchResults extends js.Object {
  
  def Add(Index: Double, ValueListItem: IValueListItem): Unit = js.native
  
  def Clone(): IValueListItemSearchResults = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IValueListItem = js.native
  
  var MoreResults: Boolean = js.native
  
  def Remove(Index: Double): Unit = js.native
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
  
  @scala.inline
  implicit class IValueListItemSearchResultsOps[Self <: IValueListItemSearchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (Double, IValueListItem) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IValueListItemSearchResults): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IValueListItem): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoreResults(value: Boolean): Self = this.set("MoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
}
