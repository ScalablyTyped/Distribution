package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAssociatedPropertyDefs extends StObject {
  
  def Add(Index: Double, AssociatedPropertyDef: IAssociatedPropertyDef): Unit = js.native
  
  def Clone(): IAssociatedPropertyDefs = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IAssociatedPropertyDef = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IAssociatedPropertyDefs {
  
  @scala.inline
  def apply(
    Add: (Double, IAssociatedPropertyDef) => Unit,
    Clone: () => IAssociatedPropertyDefs,
    Count: Double,
    Item: Double => IAssociatedPropertyDef,
    Remove: Double => Unit
  ): IAssociatedPropertyDefs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IAssociatedPropertyDefs]
  }
  
  @scala.inline
  implicit class IAssociatedPropertyDefsMutableBuilder[Self <: IAssociatedPropertyDefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IAssociatedPropertyDef) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IAssociatedPropertyDefs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IAssociatedPropertyDef): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
