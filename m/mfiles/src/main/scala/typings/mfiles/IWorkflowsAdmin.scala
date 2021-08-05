package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkflowsAdmin extends StObject {
  
  def Add(Index: Double, WorkflowAdmin: IWorkflowAdmin): Unit
  
  val Count: Double
  
  def Item(Index: Double): IWorkflowAdmin
  
  def Remove(Index: Double): Unit
}
object IWorkflowsAdmin {
  
  inline def apply(
    Add: (Double, IWorkflowAdmin) => Unit,
    Count: Double,
    Item: Double => IWorkflowAdmin,
    Remove: Double => Unit
  ): IWorkflowsAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IWorkflowsAdmin]
  }
  
  extension [Self <: IWorkflowsAdmin](x: Self) {
    
    inline def setAdd(value: (Double, IWorkflowAdmin) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IWorkflowAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
