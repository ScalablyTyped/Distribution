package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILookups extends StObject {
  
  def Add(Index: Double, Lookup: ILookup): Unit = js.native
  
  def Clone(): ILookups = js.native
  
  def CloneFrom(Lookups: ILookups): Unit = js.native
  
  val Count: Double = js.native
  
  def GetLookupByItem(Item: Double): ILookup = js.native
  
  def GetLookupIndexByItem(Item: Double): Double = js.native
  
  def Item(Index: Double): ILookup = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object ILookups {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ILookupsMutableBuilder[Self <: ILookups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, ILookup) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => ILookups): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: ILookups => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLookupByItem(value: Double => ILookup): Self = StObject.set(x, "GetLookupByItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLookupIndexByItem(value: Double => Double): Self = StObject.set(x, "GetLookupIndexByItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => ILookup): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
