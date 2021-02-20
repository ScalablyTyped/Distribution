package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIndirectPropertyID extends StObject {
  
  def Add(Index: Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): Unit = js.native
  
  def Clone(): IIndirectPropertyID = js.native
  
  val Count: Double = js.native
  
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): Boolean = js.native
  
  def Item(Index: Double): IIndirectPropertyIDLevel = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  def ToJSON(): String = js.native
}
object IIndirectPropertyID {
  
  @scala.inline
  def apply(
    Add: (Double, IIndirectPropertyIDLevel) => Unit,
    Clone: () => IIndirectPropertyID,
    Count: Double,
    EqualTo: IIndirectPropertyID => Boolean,
    Item: Double => IIndirectPropertyIDLevel,
    Remove: Double => Unit,
    ToJSON: () => String
  ): IIndirectPropertyID = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], EqualTo = js.Any.fromFunction1(EqualTo), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IIndirectPropertyID]
  }
  
  @scala.inline
  implicit class IIndirectPropertyIDMutableBuilder[Self <: IIndirectPropertyID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IIndirectPropertyIDLevel) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IIndirectPropertyID): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualTo(value: IIndirectPropertyID => Boolean): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => IIndirectPropertyIDLevel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
  }
}
