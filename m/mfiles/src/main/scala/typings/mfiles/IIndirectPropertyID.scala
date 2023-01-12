package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndirectPropertyID extends StObject {
  
  def Add(Index: Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): Unit
  
  def Clone(): IIndirectPropertyID
  
  val Count: Double
  
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): Boolean
  
  def Item(Index: Double): IIndirectPropertyIDLevel
  
  def Remove(Index: Double): Unit
  
  def ToJSON(): String
}
object IIndirectPropertyID {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IIndirectPropertyID] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, IIndirectPropertyIDLevel) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IIndirectPropertyID): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setEqualTo(value: IIndirectPropertyID => Boolean): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IIndirectPropertyIDLevel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
  }
}
