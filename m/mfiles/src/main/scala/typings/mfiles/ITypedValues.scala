package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypedValues extends StObject {
  
  def Add(Index: Double, TypedValue: ITypedValue): Unit
  
  val Count: Double
  
  def Item(Index: Double): ITypedValue
  
  def Remove(Index: Double): Unit
}
object ITypedValues {
  
  @scala.inline
  def apply(
    Add: (Double, ITypedValue) => Unit,
    Count: Double,
    Item: Double => ITypedValue,
    Remove: Double => Unit
  ): ITypedValues = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[ITypedValues]
  }
  
  @scala.inline
  implicit class ITypedValuesMutableBuilder[Self <: ITypedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, ITypedValue) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => ITypedValue): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
