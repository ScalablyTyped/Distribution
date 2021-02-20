package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkflows extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): IWorkflow = js.native
}
object IWorkflows {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IWorkflow): IWorkflows = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IWorkflows]
  }
  
  @scala.inline
  implicit class IWorkflowsMutableBuilder[Self <: IWorkflows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IWorkflow): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
