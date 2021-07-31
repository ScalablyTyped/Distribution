package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataSets extends StObject {
  
  def Clone(): IDataSets
  
  val Count: Double
  
  def Item(Index: Double): IDataSet
}
object IDataSets {
  
  @scala.inline
  def apply(Clone: () => IDataSets, Count: Double, Item: Double => IDataSet): IDataSets = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IDataSets]
  }
  
  @scala.inline
  implicit class IDataSetsMutableBuilder[Self <: IDataSets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IDataSets): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IDataSet): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
