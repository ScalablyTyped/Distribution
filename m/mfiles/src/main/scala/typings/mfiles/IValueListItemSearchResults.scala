package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueListItemSearchResults extends StObject {
  
  def Add(Index: Double, ValueListItem: IValueListItem): Unit
  
  def Clone(): IValueListItemSearchResults
  
  val Count: Double
  
  def Item(Index: Double): IValueListItem
  
  var MoreResults: Boolean
  
  def Remove(Index: Double): Unit
}
object IValueListItemSearchResults {
  
  inline def apply(
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
  
  extension [Self <: IValueListItemSearchResults](x: Self) {
    
    inline def setAdd(value: (Double, IValueListItem) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IValueListItemSearchResults): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IValueListItem): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
