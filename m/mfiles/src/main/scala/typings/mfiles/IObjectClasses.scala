package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectClasses extends StObject {
  
  def Add(Index: Double, ObjectClass: IObjectClass): Unit
  
  def Clone(): IObjectClasses
  
  val Count: Double
  
  def Item(Index: Double): IObjectClass
  
  def Remove(Index: Double): Unit
}
object IObjectClasses {
  
  inline def apply(
    Add: (Double, IObjectClass) => Unit,
    Clone: () => IObjectClasses,
    Count: Double,
    Item: Double => IObjectClass,
    Remove: Double => Unit
  ): IObjectClasses = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IObjectClasses] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, IObjectClass) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IObjectClasses): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectClass): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
