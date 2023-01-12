package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIDs extends StObject {
  
  def Add(Index: Double, ID: Double): Unit
  
  def Clone(): IIDs
  
  val Count: Double
  
  def IndexOf(ID: Double): Double
  
  def Item(Index: Double): Double
  
  def Remove(Index: Double): Unit
  
  def RemoveAll(ID: Double): Double
}
object IIDs {
  
  inline def apply(
    Add: (Double, Double) => Unit,
    Clone: () => IIDs,
    Count: Double,
    IndexOf: Double => Double,
    Item: Double => Double,
    Remove: Double => Unit,
    RemoveAll: Double => Double
  ): IIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], IndexOf = js.Any.fromFunction1(IndexOf), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction1(RemoveAll))
    __obj.asInstanceOf[IIDs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIDs] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, Double) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IIDs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setIndexOf(value: Double => Double): Self = StObject.set(x, "IndexOf", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => Double): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    inline def setRemoveAll(value: Double => Double): Self = StObject.set(x, "RemoveAll", js.Any.fromFunction1(value))
  }
}
