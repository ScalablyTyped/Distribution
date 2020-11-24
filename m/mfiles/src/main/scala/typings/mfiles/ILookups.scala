package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILookups extends js.Object {
  
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
  implicit class ILookupsOps[Self <: ILookups] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (Double, ILookup) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => ILookups): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: ILookups => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLookupByItem(value: Double => ILookup): Self = this.set("GetLookupByItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLookupIndexByItem(value: Double => Double): Self = this.set("GetLookupIndexByItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => ILookup): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
}
