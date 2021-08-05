package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookups extends StObject {
  
  def Add(Index: Double, Lookup: ILookup): Unit
  
  def Clone(): ILookups
  
  def CloneFrom(Lookups: ILookups): Unit
  
  val Count: Double
  
  def GetLookupByItem(Item: Double): ILookup
  
  def GetLookupIndexByItem(Item: Double): Double
  
  def Item(Index: Double): ILookup
  
  def Remove(Index: Double): Unit
}
object ILookups {
  
  inline def apply(
    Add: (Double, ILookup) => Unit,
    Clone: () => ILookups,
    CloneFrom: ILookups => Unit,
    Count: Double,
    GetLookupByItem: Double => ILookup,
    GetLookupIndexByItem: Double => Double,
    Item: Double => ILookup,
    Remove: Double => Unit
  ): ILookups = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Count = Count.asInstanceOf[js.Any], GetLookupByItem = js.Any.fromFunction1(GetLookupByItem), GetLookupIndexByItem = js.Any.fromFunction1(GetLookupIndexByItem), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[ILookups]
  }
  
  extension [Self <: ILookups](x: Self) {
    
    inline def setAdd(value: (Double, ILookup) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => ILookups): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCloneFrom(value: ILookups => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetLookupByItem(value: Double => ILookup): Self = StObject.set(x, "GetLookupByItem", js.Any.fromFunction1(value))
    
    inline def setGetLookupIndexByItem(value: Double => Double): Self = StObject.set(x, "GetLookupIndexByItem", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => ILookup): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
