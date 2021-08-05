package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAssociatedPropertyDefs extends StObject {
  
  def Add(Index: Double, AssociatedPropertyDef: IAssociatedPropertyDef): Unit
  
  def Clone(): IAssociatedPropertyDefs
  
  val Count: Double
  
  def Item(Index: Double): IAssociatedPropertyDef
  
  def Remove(Index: Double): Unit
}
object IAssociatedPropertyDefs {
  
  inline def apply(
    Add: (Double, IAssociatedPropertyDef) => Unit,
    Clone: () => IAssociatedPropertyDefs,
    Count: Double,
    Item: Double => IAssociatedPropertyDef,
    Remove: Double => Unit
  ): IAssociatedPropertyDefs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IAssociatedPropertyDefs]
  }
  
  extension [Self <: IAssociatedPropertyDefs](x: Self) {
    
    inline def setAdd(value: (Double, IAssociatedPropertyDef) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IAssociatedPropertyDefs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IAssociatedPropertyDef): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
