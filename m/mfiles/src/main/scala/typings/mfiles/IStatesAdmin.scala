package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStatesAdmin extends StObject {
  
  def Add(Index: Double, StateAdmin: IStateAdmin): Unit
  
  val Count: Double
  
  def Item(Index: Double): IStateAdmin
  
  def Remove(Index: Double): Unit
}
object IStatesAdmin {
  
  inline def apply(
    Add: (Double, IStateAdmin) => Unit,
    Count: Double,
    Item: Double => IStateAdmin,
    Remove: Double => Unit
  ): IStatesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IStatesAdmin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStatesAdmin] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, IStateAdmin) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IStateAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
